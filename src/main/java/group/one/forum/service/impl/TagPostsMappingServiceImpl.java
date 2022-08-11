package group.one.forum.service.impl;

import group.one.forum.entity.TagPostsMapping;
import group.one.forum.mapper.TagPostsMappingMapper;
import group.one.forum.service.ITagPostsMappingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签-帖子关系表 服务实现类
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Service
public class TagPostsMappingServiceImpl extends ServiceImpl<TagPostsMappingMapper, TagPostsMapping> implements ITagPostsMappingService {

}
