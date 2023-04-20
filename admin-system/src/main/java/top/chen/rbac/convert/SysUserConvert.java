package top.chen.rbac.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import top.chen.rbac.entity.SysUserEntity;
import top.chen.rbac.vo.SysUserVO;
import top.chen.security.user.UserDetail;


/**
 * 系统用户实体转换
 *
 * @author moqi
 */
@Mapper
public interface SysUserConvert {
    SysUserConvert INSTANCE = Mappers.getMapper(SysUserConvert.class);

    SysUserVO convert(UserDetail userDetail);

    UserDetail convertDetail(SysUserEntity entity);

}
