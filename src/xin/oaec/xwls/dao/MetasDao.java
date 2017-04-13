package xin.oaec.xwls.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2017/4/13.
 */
public interface MetasDao {
    List<Map<String,Object>> queryAllCategory();
    List<Map<String,Object>> queryAllTag();
}
