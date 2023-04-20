package top.chen.rbac.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import top.chen.common.utils.Result;
import top.chen.rbac.convert.SysUserConvert;
import top.chen.rbac.service.SysUserService;
import top.chen.rbac.vo.SysUserPasswordVO;
import top.chen.rbac.vo.SysUserVO;
import top.chen.security.user.SecurityUser;
import top.chen.security.user.UserDetail;


/**
 * 用户管理接口
 *
 * chen
 */
@RestController
@RequestMapping("sys/user")
@AllArgsConstructor
@Tag(name = "用户管理")
public class SysUserController {
    private final SysUserService sysUserService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("info")
    @Operation(summary = "获取登录用户信息")
    public Result<SysUserVO> info() {
        SysUserVO user = SysUserConvert.INSTANCE.convert(SecurityUser.getUser());
        return Result.ok(user);
    }

    @PostMapping("password")
    @Operation(summary = "修改密码")
    public Result<String> password(@RequestBody @Valid SysUserPasswordVO vo) {
        // 原密码不正确
        UserDetail user = SecurityUser.getUser();
        if (!passwordEncoder.matches(vo.getOldPassword(), user.getPassword())) {
            return Result.error("原密码不正确");
        }
        // 修改密码
        sysUserService.updatePassword(user.getId(), passwordEncoder.encode(vo.getNewPassword()));
        return Result.ok();
    }

}
