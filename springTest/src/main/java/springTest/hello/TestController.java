package springTest.hello;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {
	@RequestMapping("/hello")
	public String test() {
		return "thymeleaf/test/hello";
	}
}
