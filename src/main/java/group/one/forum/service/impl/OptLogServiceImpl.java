package group.one.forum.service.impl;

import group.one.forum.entity.OptLog;
import group.one.forum.mapper.OptLogMapper;
import group.one.forum.service.IOptLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志表 服务实现类
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Service
public class OptLogServiceImpl extends ServiceImpl<OptLogMapper, OptLog> implements IOptLogService {

}
