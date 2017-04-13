package xin.oaec.xwls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.oaec.xwls.dao.MetasDao;
import xin.oaec.xwls.service.MetasService;

import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2017/4/13.
 */
@Service("metasService")
public class MetasServiceImpl implements MetasService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private MetasDao metasDao;

    @Override
    public List<Map<String, Object>> queryAll(String type) {
        if ("category".equals(type)){
            return metasDao.queryAllCategory();
        }else if ("tag".equals(type)){
            return metasDao.queryAllTag();
        }
        return null;
    }

}
