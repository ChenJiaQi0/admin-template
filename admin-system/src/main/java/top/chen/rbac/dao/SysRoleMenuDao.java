package top.chen.rbac.dao;

import org.apache.ibatis.annotations.Mapper;
import top.chen.mybatis.dao.BaseDao;
import top.chen.rbac.entity.SysRoleMenuEntity;


/**
 * 角色与菜单对应关系 dao
 *
 * chen
 */
@Mapper
public interface SysRoleMenuDao extends BaseDao<SysRoleMenuEntity> {
}
