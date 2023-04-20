package top.chen.rbac.dao;

import org.apache.ibatis.annotations.Mapper;
import top.chen.mybatis.dao.BaseDao;
import top.chen.rbac.entity.SysUserRoleEntity;


/**
 * 用户角色关系 dao
 *
 * chen
 */
@Mapper
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {

}