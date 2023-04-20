package top.chen.rbac.service;


import top.chen.mybatis.service.BaseService;
import top.chen.rbac.entity.SysUserEntity;

/**
 * 用户管理
 *
 * chen
 */
public interface SysUserService extends BaseService<SysUserEntity> {

    /**
     * 修改密码
     *
     * @param id          用户ID
     * @param newPassword 新密码
     */
    void updatePassword(Long id, String newPassword);

}
