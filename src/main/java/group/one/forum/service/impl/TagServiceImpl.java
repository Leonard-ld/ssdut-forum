package group.one.forum.service.impl;

import group.one.forum.entity.Tag;
import group.one.forum.mapper.TagMapper;
import group.one.forum.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
