package springBootTest2.domain;

import lombok.Data;

@Data
public class QnaDTO {
	Integer qnaNum;
	String qnaSubject;
	String qnaContent;
	Integer visitCount;
	String qnaRegiDate;
}
