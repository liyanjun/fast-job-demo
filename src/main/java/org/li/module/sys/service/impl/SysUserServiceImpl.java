
package org.li.module.sys.service.impl;

import org.li.common.base.page.PageInfo;
import org.li.common.base.page.PagerControl;
import org.li.module.sys.bean.SysUser;
import org.li.module.sys.service.SysUserService;
import org.li.module.sys.dao.SysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liyanjun
 * @date 2017-4-12 10:42:25
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    public Integer insertSysUser(SysUser sysUser) {
        if (sysUser == null) {
            return 0;
        }

        Integer i = sysUserDao.insert(sysUser);
        return i;
    }

    public Integer updateSysUser(SysUser sysUser) {
        if (sysUser == null) {
            return 0;
        }

        Integer i = sysUserDao.update(sysUser);
        return i;
    }

    public PagerControl<SysUser> page(SysUser sysUser, PageInfo pageInfo, String whereSql, String orderSql) {
        return sysUserDao.getPagerByObj(sysUser, pageInfo, whereSql, orderSql);
    }

    public SysUser find(Integer id) {
        return sysUserDao.getEntityById(id);
    }

}
