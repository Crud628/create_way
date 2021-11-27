package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @SpringBootApplication 这是一个组合注解包含以下三个（其他的是注解的必要属性）
 * 
 * @SpringBootConfiguration 该声明为配置类  实际上是@Configuration的特殊形式
 * @EnableAutoConfiguration 启动Spring Boot的自动配置 这个注解会告诉Spring Boot自动配置它认为我们会用到的组件
 * @ComponentScan 启用组件扫描
 * 
 * TODO
 * @date 2021年10月23日
 * @author Keason
 */
@SpringBootApplication
public class TacoCloudApplication {
	
	/**
	 * 这是JAR文件执行的时候要运行的方法 自动生成的代码是最简单适用的，也可以加入更多的配置。
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
