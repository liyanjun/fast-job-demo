
package org.li.module.sys.dao.impl;

import org.li.common.base.dao.BaseDao;
import org.li.common.base.page.PageInfo;
import org.li.module.sys.bean.SysResource;
import org.li.module.sys.dao.SysResourceDao;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author liyanjun
 * @date 2017-4-12 10:27:36
 */
@Repository
public class SysResourceDaoImpl extends BaseDao<Integer, SysResource> implements SysResourceDao {

    @Override
    public int checkResCode(String resCode) {
        Object e = this.getSqlSession().selectOne(this.getMapperNameSpace() + ".checkResCode", resCode);
        return ((Integer) e).intValue();
    }
}