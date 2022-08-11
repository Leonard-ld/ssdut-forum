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
 * 消息表
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("forum_message")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 发送渠道
     */
    private String channel;

    /**
     * 消息类型
     */
    private String type;

    /**
     * 是否已读
     */
    private String read;

    /**
     * 发送人类型
     */
    private String senderType;

    /**
     * 发送人
     */
    private String sender;

    /**
     * 接收人类型
     */
    private String receiverType;

    /**
     * 接收人
     */
    private String receiver;

    /**
     * 标题
     */
    private String title;

    /**
     * 发送内容类型
     */
    private String contentType;

    /**
     * 发送内容
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
