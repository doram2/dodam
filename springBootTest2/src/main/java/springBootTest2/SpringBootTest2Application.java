package springBootTest2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "springBootTest2")
@MapperScan(value = "springBootTest2.mapper")
//@RestController
public class SpringBootTest2Application {
	/*
	 * @RequestMapping public String test() { return "스프링부트"; }
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest2Application.class, args);
	}

}
