package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 控制器 
 * 
 * 本身而言并没有意义，他的目的是让组件扫描这个类识别为一个组件
 * 与此相似的还有 @Component @Service @Repository
 * TODO
 * @date 2021年10月23日
 * @author Keason
 */
@Controller
public class HomeController {
	
	/**
	 * 处理请求
	 * 
	 * @return 返回String字符串，但这里会被解析成视图  /resources/thymeleaf/home.html
	 */
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
