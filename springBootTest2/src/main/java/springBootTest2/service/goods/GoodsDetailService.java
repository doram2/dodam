package springBootTest2.service.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootTest2.domain.GoodsDTO;
import springBootTest2.mapper.Goods1Mapper;

@Component
@Service

public class GoodsDetailService {
	@Autowired
	Goods1Mapper goods1Mapper;
	public void execute(String goodsNum, Model model) {
		GoodsDTO dto = goods1Mapper.selectOne(goodsNum);
		model.addAttribute("goodsDTO", dto);			
	}
}
