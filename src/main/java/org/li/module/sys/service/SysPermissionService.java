
package org.li.module.sys.service;

import org.li.common.base.page.PageInfo;
import org.li.common.base.page.PagerControl;
import org.li.module.sys.bean.SysPermission;


/**
 * 
 * @author liyanjun
 * @date 2017-4-12 10:42:24
 */
public interface SysPermissionService {

    Integer insertSysPermission(SysPermission sysPermission);

    Integer updateSysPermission(SysPermission sysPermission);

    PagerControl<SysPermission> page(SysPermission sysPermission, PageInfo pageInfo, String whereSql, String orderSql);

    SysPermission find(Integer id);
    
}
