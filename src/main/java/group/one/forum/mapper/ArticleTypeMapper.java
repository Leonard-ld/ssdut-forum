package group.one.forum.mapper;

import group.one.forum.entity.ArticleType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 文章类别表 Mapper 接口
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
public interface ArticleTypeMapper extends BaseMapper<ArticleType> {

    @Select("SELECT * FROM forum_article_type")
    List<ArticleType> getAllTypes();

}
