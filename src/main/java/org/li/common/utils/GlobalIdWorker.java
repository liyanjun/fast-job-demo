package org.li.common.utils;


/**
 * Twitter公开的一个算法
 * 000000000000000000000000000000000000000000  00000          00000       000000000000
 * time                                        datacenterId   workerId    sequence
 * 用于生成一个唯一的，但是不连续的ID
 *
 * @author liyanjun
 */
public final class GlobalIdWorker {

    private long workerId;
    private long datacenterId;
    private long sequence = 0L;

    private long twepoch = 1288834974657L; //Thu, 04 Nov 2010 01:42:54 GMT

    private long workerIdBits = 5L; //节点ID长度
    private long datacenterIdBits = 5L; //数据中心ID长度
    private long maxWorkerId = -1L ^ (-1L << workerIdBits); //最大支持机器节点数0~31，一共32个
    private long maxDatacenterId = -1L ^ (-1L << datacenterIdBits); //最大支持数据中心节点数0~31，一共32个
    private long sequenceBits = 12L; //序列号12位

    private long workerIdShift = sequenceBits; //机器节点左移12位
    private long datacenterIdShift = sequenceBits + workerIdBits; //数据中心节点左移17位
    private long timestampLeftShift = sequenceBits + workerIdBits + datacenterIdBits; //时间毫秒数左移22位
    private long sequenceMask = -1L ^ (-1L << sequenceBits); //4095

    private long lastTimestamp = -1L;

    private static GlobalIdWorker globalIdWorker;

    /**
     * 初始化ID生成器
     *
     * @param workerId     机器节点数（支持32台机器，0~31）
     * @param datacenterId 数据中心节点数（支持32个数据中心，0~31）
     */
    public GlobalIdWorker(long workerId, long datacenterId) {
        // sanity check for workerId
        if (workerId > maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(String.format("worker Id can't be greater than %d or less than 0", maxWorkerId));
        }
        if (datacenterId > maxDatacenterId || datacenterId < 0) {
            throw new IllegalArgumentException(String.format("datacenter Id can't be greater than %d or less than 0", maxDatacenterId));
        }
        this.workerId = workerId;
        this.datacenterId = datacenterId;
    }

    public static GlobalIdWorker getInstance() {
        if (globalIdWorker == null) {
            globalIdWorker = new GlobalIdWorker(0, 0);
        }
        return globalIdWorker;
    }


    public synchronized long nextId() {
        //判断执行时是否在同一毫秒内，如果在同一毫秒内执行，序列号sequenceBits递增
        //一毫秒最多能生成4095个ID。超过4095则自动等待下一毫秒。
        long timestamp = timeGen();

        if (timestamp < lastTimestamp) {
            throw new RuntimeException(String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", lastTimestamp - timestamp));
        }

        if (lastTimestamp == timestamp) {
            //sequence自增，因为sequence只有12bit，所以和sequenceMask相与一下，去掉高位
            sequence = (sequence + 1) & sequenceMask;
            if (sequence == 0) {
                timestamp = tilNextMillis(lastTimestamp);
            }
        } else {
            sequence = 0L;
        }

        lastTimestamp = timestamp;
        // 按照规则拼出ID
        return ((timestamp - twepoch) << timestampLeftShift) | (datacenterId << datacenterIdShift) | (workerId << workerIdShift) | sequence;
    }

    protected long tilNextMillis(long lastTimestamp) {
        long timestamp = timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = timeGen();
        }
        return timestamp;
    }

    protected long timeGen() {
        return System.currentTimeMillis();
    }
}
