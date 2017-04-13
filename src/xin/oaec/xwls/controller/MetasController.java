package xin.oaec.xwls.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.oaec.xwls.service.MetasService;

import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2017/4/13.
 */
@Controller
@RequestMapping("/metas")
public class MetasController {

    @Autowired
    private MetasService metasService;

    @RequestMapping(value = "getMetas",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getCategory(@RequestParam("type") String type){
        List<Map<String, Object>> metas = metasService.queryAll(type);
        JSONObject jsonObject = new JSONObject();
        if (metas != null && metas.size() > 0){
            jsonObject.put("success",true);
            jsonObject.put("metas",metas);
        }else {
            jsonObject.put("success",false);
            jsonObject.put("reason","未查询到数据");
        }
        return jsonObject.toJSONString();
    }

}
