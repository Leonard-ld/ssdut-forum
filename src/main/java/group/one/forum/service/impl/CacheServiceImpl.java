package group.one.forum.service.impl;

import group.one.forum.entity.Cache;
import group.one.forum.mapper.CacheMapper;
import group.one.forum.service.ICacheService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 缓存表 服务实现类
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Service
public class CacheServiceImpl extends ServiceImpl<CacheMapper, Cache> implements ICacheService {

}
