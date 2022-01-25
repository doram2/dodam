package springBootTest2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springBootTest2.command.QnaCommand;
import springBootTest2.service.qna.QnaDelService;
import springBootTest2.service.qna.QnaDetailService;
import springBootTest2.service.qna.QnaInfoService;
import springBootTest2.service.qna.QnaListService;
import springBootTest2.service.qna.QnaModifyService;
import springBootTest2.service.qna.QnaWriteService;

@Controller
@RequestMapping("qna")
public class QnAController {
	@Autowired
	QnaWriteService qnaWriteService;
	@Autowired
	QnaListService qnaListService;
	@Autowired
	QnaDetailService qnaDetailService;
	@Autowired
	QnaInfoService qnaInfoService;
	@Autowired
	QnaModifyService qnaModifyService;
	@Autowired
	QnaDelService qnaDelService;
	
	@RequestMapping(value = "qnaDel", method = RequestMethod.GET)
	public String qnaDel(@RequestParam(value = "num") Integer qnaNum) {
		qnaDelService.execute(qnaNum);
		return "redirect:qnaList";
	}
	
	@RequestMapping(value = "qnaModify", method = RequestMethod.POST)
	public String qnaModify(QnaCommand qnaCommand) {
		qnaModifyService.execute(qnaCommand);
		return "redirect:qnaDetail?num="+qnaCommand.getQnaNum();
	}
	
	@RequestMapping("qnaUpdate")
	public String qnaUpdate(HttpServletRequest request) {
		qnaInfoService.execute(request);
		return "thymeleaf/qna/qnaDetail";
	}
	@RequestMapping(value = "qnaDetail", method = RequestMethod.GET)
	public String qnaDetail(@RequestParam(value = "num") Integer qnaNum, Model model, HttpServletRequest request) {
		String num = request.getParameter("num");
		qnaDetailService.execute(model, qnaNum);
		return "thymeleaf/qna/qnaInfo";
	}
	@RequestMapping("qnaWrite")
	public String qnaForm() {
		return "thymeleaf/qna/qnaForm";
	}
	@RequestMapping("qnaList")
	public String qnaHome(Model model) {
		qnaListService.execute(model);
		return "thymeleaf/qna/qnaList";
	}
	@RequestMapping(value = "qnaRegist", method = RequestMethod.POST)
	public String qnaRegist(QnaCommand qnaCommand, HttpServletRequest request) {
		qnaWriteService.execute(qnaCommand, request);
		return "redirect:qnaList";
	}
	
}
