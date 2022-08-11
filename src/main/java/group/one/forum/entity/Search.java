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
 * 搜索内容表
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("forum_search")
public class Search implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 类型
     */
    private String type;

    /**
     * 实体ID
     */
    private Long entityId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

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
