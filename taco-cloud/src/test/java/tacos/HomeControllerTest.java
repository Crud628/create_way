package tacos;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class) // 针对HomeController的Web测试
public class HomeControllerTest {

	@Autowired // 注入MockMvc
	private MockMvc mockMvc;
	
	@Test
	public void testHomePage() throws Exception {
		mockMvc.perform(get("/"))						// 发起对“/”的GET
			.andExpect(status().isOk())					// 期望得到HTTP 200
			.andExpect(view().name("home"))				// 期望得到home视图
			.andExpect((ResultMatcher) content().string(
					containsString("Welcome to...")));  // 期望包含“Welcome to...”
	}
}
