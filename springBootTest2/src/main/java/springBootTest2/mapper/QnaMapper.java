package springBootTest2.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import springBootTest2.domain.QnaDTO;

@Component
@Repository(value="springBootTest2.mapper.QnaMapper")
public interface QnaMapper {
	public Integer qnaInsert(QnaDTO dto);
	public List<QnaDTO> selectAll();
	public QnaDTO selectOne(Integer qnaNum);
	public Integer visitCount(Integer qnaNum);
	public Integer qnaUpdate(QnaDTO dto);
	public Integer qnaDel(Integer qnaNum);
}
