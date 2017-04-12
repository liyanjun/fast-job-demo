
package org.li.module.sys.service.impl;

import org.li.common.base.page.PageInfo;
import org.li.common.base.page.PagerControl;
import org.li.module.sys.bean.SysPermission;
import org.li.module.sys.service.SysPermissionService;
import org.li.module.sys.dao.SysPermissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liyanjun
 * @date 2017-4-12 10:42:24
 */
@Service
public class SysPermissionServiceImpl implements SysPermissionService {

    @Autowired
    private SysPermissionDao sysPermissionDao;

    public Integer insertSysPermission(SysPermission sysPermission) {
        if (sysPermission == null) {
            return 0;
        }

        Integer i = sysPermissionDao.insert(sysPermission);
        return i;
    }

    public Integer updateSysPermission(SysPermission sysPermission) {
        if (sysPermission == null) {
            return 0;
        }

        Integer i = sysPermissionDao.update(sysPermission);
        return i;
    }

    public PagerControl<SysPermission> page(SysPermission sysPermission, PageInfo pageInfo, String whereSql, String orderSql) {
        return sysPermissionDao.getPagerByObj(sysPermission, pageInfo, whereSql, orderSql);
    }

    public SysPermission find(Integer id) {
        return sysPermissionDao.getEntityById(id);
    }

}
