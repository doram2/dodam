package springBootTest2.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import springBootTest2.domain.GoodsDTO;

@Component
@Repository(value = "springBootTest2.mapper.Goods1Mapper")
public interface Goods1Mapper {

	Integer goodsInsert(GoodsDTO dto);
	List<GoodsDTO> selectAll();
	String numberGenerate();
	GoodsDTO selectOne(String goodsNum);
	Integer goodsDelete(String goodsNum);
	Integer goodsUpdate(GoodsDTO dto);
}
