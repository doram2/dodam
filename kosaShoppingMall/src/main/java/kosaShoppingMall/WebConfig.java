package kosaShoppingMall;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer{
	//html이나 jsp 문저세어 view밑에 있는 파일을 불러 올 때 404 오류가 나는 것을 방지
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("/view/").setCachePeriod(14400);
	}
}
