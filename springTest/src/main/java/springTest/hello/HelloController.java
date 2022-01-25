package springTest.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //이거 있으면 controller 클래스로 생각하고 이 안에서 주소찾음.
				//파일이 아니고 문자열을 출력한다.
public class HelloController {
	@RequestMapping("/")
	public String home() {
		return "thymeleaf/test/hello";
	}
	
}
