package springTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController//특정한 값을 출력하는 controller. 문자열을 직접 forward
@SpringBootApplication
public class SpringtestApplication {
	//@RequestMapping("/")//주소찾을때
	/*
	 * String aaa() { 
	 * 	return "hello world"; //return jsp주소 //여따해도 되는데 컨트롤러 만들어서 써도 됨
	 * }
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringtestApplication.class, args);
	}

}
