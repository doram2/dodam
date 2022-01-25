package springBootTest2.service.qna;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import springBootTest2.domain.QnaDTO;
import springBootTest2.mapper.QnaMapper;

@Component
@Service

public class QnaInfoService {
	@Autowired
	QnaMapper qnaMapper;
	public void execute(HttpServletRequest request) {
		Integer num = Integer.parseInt(request.getParameter("num"));
		QnaDTO dto = qnaMapper.selectOne(num);
		request.setAttribute("dto", dto);
	}
}
