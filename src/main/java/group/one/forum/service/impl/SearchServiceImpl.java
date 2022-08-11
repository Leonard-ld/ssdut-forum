package group.one.forum.service.impl;

import group.one.forum.entity.Search;
import group.one.forum.mapper.SearchMapper;
import group.one.forum.service.ISearchService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 搜索内容表 服务实现类
 * </p>
 *
 * @author Lidong
 * @since 2022-08-11
 */
@Service
public class SearchServiceImpl extends ServiceImpl<SearchMapper, Search> implements ISearchService {

}
