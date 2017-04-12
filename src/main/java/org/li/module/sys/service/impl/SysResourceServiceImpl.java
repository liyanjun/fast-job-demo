
package org.li.module.sys.service.impl;

import org.li.common.base.page.PageInfo;
import org.li.common.base.page.PagerControl;
import org.li.module.sys.bean.SysResource;
import org.li.module.sys.service.SysResourceService;
import org.li.module.sys.dao.SysResourceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liyanjun
 * @date 2017-4-12 10:42:25
 */
@Service
public class SysResourceServiceImpl implements SysResourceService {

    @Autowired
    private SysResourceDao sysResourceDao;

    public Integer insertSysResource(SysResource sysResource) {
        if (sysResource == null) {
            return 0;
        }

        Integer i = sysResourceDao.insert(sysResource);
        return i;
    }

    public Integer updateSysResource(SysResource sysResource) {
        if (sysResource == null) {
            return 0;
        }

        Integer i = sysResourceDao.update(sysResource);
        return i;
    }

    public PagerControl<SysResource> page(SysResource sysResource, PageInfo pageInfo, String whereSql, String orderSql) {
        return sysResourceDao.getPagerByObj(sysResource, pageInfo, whereSql, orderSql);
    }

    public SysResource find(Integer id) {
        return sysResourceDao.getEntityById(id);
    }

}
