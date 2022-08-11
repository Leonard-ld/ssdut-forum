package group.one.forum.service.impl;

import group.one.forum.entity.User;
import group.one.forum.mapper.UserMapper;
import group.one.forum.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
