package xin.oaec.xwls.controller;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xin.oaec.xwls.service.PostService;

import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2017/4/4.
 */
@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostService postService;

	@RequestMapping(value = "getPosts",produces = "text/html;charset=utf-8")
	@ResponseBody
	public String getPosts(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize){
		page = (page - 1) * pageSize;
		int totalCount = postService.getTotalCount();
		JSONObject jsonObject = new JSONObject();
		if (totalCount > 0){
			jsonObject.put("success",true);
			jsonObject.put("totalCount",totalCount);
			List<Map<String, Object>> posts = postService.queryLimit(page, pageSize);
			for (Map<String, Object> post : posts) {
				String text = post.get("text").toString();
				if (text != null){
					text = text.replaceAll("\r\n","");
					post.put("text",text);
				}
			}
			jsonObject.put("posts",posts);
		}else{
			jsonObject.put("success",false);
			jsonObject.put("reason","未查询的数据，请稍后再试");
		}
		return jsonObject.toJSONString();
	}
}
