package group.one.forum.service.impl;

import group.one.forum.entity.Message;
import group.one.forum.mapper.MessageMapper;
import group.one.forum.service.IMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消息表 服务实现类
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements IMessageService {

}
