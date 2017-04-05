package xin.oaec.xwls.service;

import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2017/4/4.
 */
public interface PostService {
	/**
	 *
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<Map<String, Object>> queryLimit(int page,int pageSize);

	int getTotalCount();

	Map<String, Object> queryByCid(int cid);
}
