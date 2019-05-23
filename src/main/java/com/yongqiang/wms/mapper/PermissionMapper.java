package com.yongqiang.wms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yongqiang.wms.model.user.Permission;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yantao.chen on 2019-05-22
 */
@Component
public interface PermissionMapper extends BaseMapper<Permission> {
    List<Permission> getAllPermission();
}
