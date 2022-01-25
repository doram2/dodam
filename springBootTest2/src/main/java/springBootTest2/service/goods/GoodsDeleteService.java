package springBootTest2.service.goods;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import springBootTest2.domain.GoodsDTO;
import springBootTest2.mapper.Goods1Mapper;

@Component
@Service
public class GoodsDeleteService {
	@Autowired
	Goods1Mapper goods1Mapper;

	public void execute(String goodsNum, HttpSession session) {
		GoodsDTO dto = goods1Mapper.selectOne(goodsNum);
		Integer i = goods1Mapper.goodsDelete(goodsNum);
		if (i > 0 && dto.getGoodsImage() != null) {
			String storeFileNames[] = dto.getGoodsImage().split("`");
			String fileDir = session.getServletContext().getRealPath("/view/goods");
			for (String fileName : storeFileNames) {
				File file = new File(fileDir + "/" + fileName);
				if (file.exists())
					file.delete();
			}
		}

	}
}