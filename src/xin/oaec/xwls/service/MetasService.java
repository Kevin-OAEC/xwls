package xin.oaec.xwls.service;

import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2017/4/13.
 */
public interface MetasService {
    List<Map<String,Object>> queryAll(String type);
}
