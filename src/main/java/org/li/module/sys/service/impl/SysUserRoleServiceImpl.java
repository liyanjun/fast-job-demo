
package org.li.module.sys.service.impl;

import org.li.common.base.page.PageInfo;
import org.li.common.base.page.PagerControl;
import org.li.module.sys.bean.SysUserRole;
import org.li.module.sys.service.SysUserRoleService;
import org.li.module.sys.dao.SysUserRoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liyanjun
 * @date 2017-4-12 10:42:25
 */
@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {

    @Autowired
    private SysUserRoleDao sysUserRoleDao;

    public Integer insertSysUserRole(SysUserRole sysUserRole) {
        if (sysUserRole == null) {
            return 0;
        }

        Integer i = sysUserRoleDao.insert(sysUserRole);
        return i;
    }

    public SysUserRole find(Integer id) {
        return sysUserRoleDao.getEntityById(id);
    }

}
