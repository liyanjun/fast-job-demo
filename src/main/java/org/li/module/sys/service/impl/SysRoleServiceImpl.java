
package org.li.module.sys.service.impl;

import org.li.common.base.page.PageInfo;
import org.li.common.base.page.PagerControl;
import org.li.module.sys.bean.SysRole;
import org.li.module.sys.service.SysRoleService;
import org.li.module.sys.dao.SysRoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liyanjun
 * @date 2017-4-12 10:42:25
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleDao sysRoleDao;

    public Integer insertSysRole(SysRole sysRole) {
        if (sysRole == null) {
            return 0;
        }

        Integer i = sysRoleDao.insert(sysRole);
        return i;
    }

    public Integer updateSysRole(SysRole sysRole) {
        if (sysRole == null) {
            return 0;
        }

        Integer i = sysRoleDao.update(sysRole);
        return i;
    }

    public PagerControl<SysRole> page(SysRole sysRole, PageInfo pageInfo, String whereSql, String orderSql) {
        return sysRoleDao.getPagerByObj(sysRole, pageInfo, whereSql, orderSql);
    }

    public SysRole find(Integer id) {
        return sysRoleDao.getEntityById(id);
    }

}
