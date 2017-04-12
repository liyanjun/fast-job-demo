
package org.li.module.sys.service;

import org.li.common.base.page.PageInfo;
import org.li.common.base.page.PagerControl;
import org.li.module.sys.bean.SysRole;


/**
 * 
 * @author liyanjun
 * @date 2017-4-12 10:42:25
 */
public interface SysRoleService {

    Integer insertSysRole(SysRole sysRole);

    Integer updateSysRole(SysRole sysRole);

    PagerControl<SysRole> page(SysRole sysRole, PageInfo pageInfo, String whereSql, String orderSql);

    SysRole find(Integer id);
    
}
