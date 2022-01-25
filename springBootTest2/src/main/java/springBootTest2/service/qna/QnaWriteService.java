package springBootTest2.service.qna;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import springBootTest2.command.QnaCommand;
import springBootTest2.domain.QnaDTO;
import springBootTest2.mapper.QnaMapper;

@Component
@Service
public class QnaWriteService {
	@Autowired
	QnaMapper qnaMapper;
	public void execute(QnaCommand qnaCommand, HttpServletRequest request) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String sodam = format.format(date);
		
		QnaDTO dto = new QnaDTO();
		
		dto.setQnaContent(qnaCommand.getQnaContent());
		dto.setQnaSubject(qnaCommand.getQnaSubject());
		dto.setQnaRegiDate(sodam);//담담
		
		Integer i = qnaMapper.qnaInsert(dto);
		System.out.println(i+"개 행이(가) 삽입되었습니다.");
	
	}

}
