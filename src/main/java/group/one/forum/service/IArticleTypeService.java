package group.one.forum.service;

import group.one.forum.entity.ArticleType;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 文章类别表 服务类
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
public interface IArticleTypeService extends IService<ArticleType> {

    List<ArticleType> getAllTypes();

}
