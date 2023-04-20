package top.chen.rbac.dao;

import org.apache.ibatis.annotations.Mapper;
import top.chen.mybatis.dao.BaseDao;
import top.chen.rbac.entity.SysRoleEntity;

/**
 * 角色管理 dao
 *
 * chen
 */
@Mapper
public interface SysRoleDao extends BaseDao<SysRoleEntity> {

}
