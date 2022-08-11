package group.one.forum.service.impl;

import group.one.forum.entity.Posts;
import group.one.forum.mapper.PostsMapper;
import group.one.forum.service.IPostsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 帖子表 服务实现类
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts> implements IPostsService {

}
