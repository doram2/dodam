package springBootTest2.service.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootTest2.domain.GoodsDTO;
import springBootTest2.mapper.Goods1Mapper;
@Component
@Service
public class GoodsListService {
	@Autowired 
	Goods1Mapper goods1Mapper;
	
	public void execute(Model model) {
		List<GoodsDTO> list = goods1Mapper.selectAll();
		model.addAttribute("list",list);
	}
}
