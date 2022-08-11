package group.one.forum.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 帖子表
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("forum_posts")
public class Posts implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 审核状态
     */
    private String auditState;

    /**
     * 类别
     */
    private String category;

    /**
     * 作者ID
     */
    private Long authorId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容类型
     */
    private String contentType;

    /**
     * markdown内容
     */
    private String markdownContent;

    /**
     * html内容
     */
    private String htmlContent;

    /**
     * 浏览量
     */
    private Long views;

    /**
     * 点赞量/收藏量
     */
    private Long approvals;

    /**
     * 评论量
     */
    private Long comments;

    /**
     * 文章类型ID
     */
    private Long typeId;

    /**
     * 文章头图
     */
    private String headImg;

    /**
     * 官方
     */
    private Integer official;

    /**
     * 置顶
     */
    private Integer top;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 精华
     */
    private Integer marrow;

    /**
     * 问答最佳答案ID
     */
    private Long commentId;

    /**
     * 删除标识（0:未删除、1:已删除）
     */
    private Integer isDelete;

    /**
     * 记录创建时间
     */
    private LocalDateTime createAt;

    /**
     * 记录修改时间
     */
    private LocalDateTime updateAt;


}
