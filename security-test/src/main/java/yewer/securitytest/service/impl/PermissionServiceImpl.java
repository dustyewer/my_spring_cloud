package yewer.securitytest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import yewer.securitytest.entity.Permission;
import yewer.securitytest.dao.PermissionDao;
import yewer.securitytest.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Permission)表服务实现类
 *
 * @author makejava
 * @since 2021-05-23 20:50:45
 */
@Service("permissionService")
public class PermissionServiceImpl extends ServiceImpl<PermissionDao,Permission> implements PermissionService {

}
