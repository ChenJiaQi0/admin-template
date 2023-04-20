package top.chen.rbac.service;


import top.chen.rbac.vo.SysAccountLoginVO;
import top.chen.rbac.vo.SysTokenVO;

/**
 * 权限认证服务
 *
 * chen
 */
public interface SysAuthService {

    /**
     * 账号密码登录
     *
     * @param login 登录信息
     */
    SysTokenVO loginByAccount(SysAccountLoginVO login);

    /**
     * 退出登录
     *
     * @param accessToken accessToken
     */
    void logout(String accessToken);
}
