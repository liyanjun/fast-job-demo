
package org.li.module.sys.service;

import org.li.common.base.page.PageInfo;
import org.li.common.base.page.PagerControl;
import org.li.module.sys.bean.SysUser;


/**
 * 
 * @author liyanjun
 * @date 2017-4-12 10:42:25
 */
public interface SysUserService {

    Integer insertSysUser(SysUser sysUser);

    Integer updateSysUser(SysUser sysUser);

    PagerControl<SysUser> page(SysUser sysUser, PageInfo pageInfo, String whereSql, String orderSql);

    SysUser find(Integer id);
    
}
