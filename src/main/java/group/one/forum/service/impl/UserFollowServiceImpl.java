package group.one.forum.service.impl;

import group.one.forum.entity.UserFollow;
import group.one.forum.mapper.UserFollowMapper;
import group.one.forum.service.IUserFollowService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户关注表 服务实现类
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Service
public class UserFollowServiceImpl extends ServiceImpl<UserFollowMapper, UserFollow> implements IUserFollowService {

}
