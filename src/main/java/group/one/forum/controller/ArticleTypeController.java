package group.one.forum.controller;


import group.one.forum.entity.ArticleType;
import group.one.forum.mapper.ArticleTypeMapper;
import group.one.forum.service.IArticleTypeService;
import group.one.forum.utils.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 文章类别表 前端控制器
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@RestController
@RequestMapping("/articleType")
public class ArticleTypeController {

    @Autowired
    private IArticleTypeService articleTypeService;

    @GetMapping
    public String getAll() {
        return GsonUtil.toJsonWtihNullField(articleTypeService.getAllTypes());
    }
}
