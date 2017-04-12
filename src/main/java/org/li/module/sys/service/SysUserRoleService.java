
package org.li.module.sys.service;

import org.li.common.base.page.PageInfo;
import org.li.common.base.page.PagerControl;
import org.li.module.sys.bean.SysUserRole;


/**
 * 
 * @author liyanjun
 * @date 2017-4-12 10:42:25
 */
public interface SysUserRoleService {

    Integer insertSysUserRole(SysUserRole sysUserRole);

    SysUserRole find(Integer id);
    
}
