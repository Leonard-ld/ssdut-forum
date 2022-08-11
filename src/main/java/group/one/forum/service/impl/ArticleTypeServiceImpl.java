package group.one.forum.service.impl;

import group.one.forum.entity.ArticleType;
import group.one.forum.mapper.ArticleTypeMapper;
import group.one.forum.service.IArticleTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 文章类别表 服务实现类
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Service
public class ArticleTypeServiceImpl extends ServiceImpl<ArticleTypeMapper, ArticleType> implements IArticleTypeService {

    @Autowired
    ArticleTypeMapper articleTypeMapper;

    @Override
    public List<ArticleType> getAllTypes() {
        return articleTypeMapper.getAllTypes();
    }
}
