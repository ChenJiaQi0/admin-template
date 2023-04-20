package top.chen.rbac.service;

import top.chen.rbac.vo.SysCaptchaVO;

/**
 * 验证码
 */
public interface SysCaptchaService {
    /**
     * 生成验证码
     *
     */
    SysCaptchaVO generate();

    /**
     * 验证码校验
     */
    boolean validate(String key, String code);
}
