package top.chen.rbac.service.impl;


import org.springframework.stereotype.Service;
import top.chen.mybatis.service.impl.BaseServiceImpl;
import top.chen.rbac.dao.SysUserRoleDao;
import top.chen.rbac.entity.SysUserRoleEntity;
import top.chen.rbac.service.SysUserRoleService;

/**
 * 用户角色关系服务
 *
 * chen
 */
@Service
public class SysUserRoleServiceImpl extends BaseServiceImpl<SysUserRoleDao, SysUserRoleEntity> implements SysUserRoleService {
}