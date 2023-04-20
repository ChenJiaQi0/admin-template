package top.chen.rbac.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import top.chen.mybatis.service.impl.BaseServiceImpl;
import top.chen.rbac.dao.SysMenuDao;
import top.chen.rbac.entity.SysMenuEntity;
import top.chen.rbac.service.SysMenuService;


/**
 * 菜单管理服务
 *
 * chen
 */
@Service
@AllArgsConstructor
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {

}