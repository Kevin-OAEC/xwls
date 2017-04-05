package xin.oaec.xwls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.oaec.xwls.dao.PostDao;
import xin.oaec.xwls.service.PostService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2017/4/4.
 */
@Service("postService")
public class PostServiceImpl implements PostService {

	@SuppressWarnings("SpringJavaAutowiringInspection")
	@Autowired
	private PostDao postDao;

	@Override
	public List<Map<String, Object>> queryLimit(int page, int pageSize) {
		Map<String, Integer> map = new HashMap<>();
		map.put("page",page);
		map.put("pageSize",pageSize);
		return postDao.queryLimit(map);
	}

	@Override
	public int getTotalCount() {
		return postDao.getTotalCount();
	}

	@Override
	public Map<String, Object> queryByCid(int cid) {
		return postDao.queryByCid(cid);
	}
}
