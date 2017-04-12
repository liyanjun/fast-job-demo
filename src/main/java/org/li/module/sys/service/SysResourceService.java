
package org.li.module.sys.service;

import org.li.common.base.page.PageInfo;
import org.li.common.base.page.PagerControl;
import org.li.module.sys.bean.SysResource;


/**
 * 
 * @author liyanjun
 * @date 2017-4-12 10:42:25
 */
public interface SysResourceService {

    Integer insertSysResource(SysResource sysResource);

    Integer updateSysResource(SysResource sysResource);

    PagerControl<SysResource> page(SysResource sysResource, PageInfo pageInfo, String whereSql, String orderSql);

    SysResource find(Integer id);
    
}
