package top.chen.system.rbac.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import top.chen.rbac.convert.SysUserConvert;
import top.chen.rbac.entity.SysUserEntity;
import top.chen.rbac.enums.UserStatusEnum;
import top.chen.rbac.service.SysUserDetailsService;
import top.chen.security.user.UserDetail;

import java.util.HashSet;
import java.util.Set;


/**
 * 获取用户 UserDetails 信息服务
 *
 * chen
 */
@Service
@AllArgsConstructor
public class SysUserDetailsServiceImpl implements SysUserDetailsService {

    @Override
    public UserDetails getUserDetails(SysUserEntity userEntity) {
        // 转换成UserDetail对象
        UserDetail userDetail = SysUserConvert.INSTANCE.convertDetail(userEntity);

        // 账号不可用
        if (userEntity.getStatus() == UserStatusEnum.DISABLE.getValue()) {
            userDetail.setEnabled(false);
        }

        Set<String> authoritySet = new HashSet<>();
        userDetail.setAuthoritySet(authoritySet);

        return userDetail;
    }

}
