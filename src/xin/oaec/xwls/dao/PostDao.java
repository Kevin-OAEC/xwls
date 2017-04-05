package xin.oaec.xwls.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2017/4/4.
 */
public interface PostDao {
	/**
	 * 获取Post列表
	 * @param map 包含page和pageSize
	 * @return
	 */
	List<Map<String, Object>> queryLimit(Map<String,Integer> map);

	int getTotalCount();

	/**
	 * 根据cid查询post详情
	 * @param cid
	 * @return
	 */
	Map<String, Object> queryByCid(int cid);
}
