package top.chen.rbac.service.impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.chen.mybatis.service.impl.BaseServiceImpl;
import top.chen.rbac.dao.SysRoleDao;
import top.chen.rbac.entity.SysRoleEntity;
import top.chen.rbac.service.SysRoleService;

/**
 * 系统角色服务
 *
 * chen
 */
@Service
@AllArgsConstructor
public class SysRoleServiceImpl extends BaseServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {

}