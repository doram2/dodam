package springBootTest2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springBootTest2.command.GoodsCommand;
import springBootTest2.service.goods.GoodsDeleteService;
import springBootTest2.service.goods.GoodsDetailService;
import springBootTest2.service.goods.GoodsListService;
import springBootTest2.service.goods.GoodsNumberService;
import springBootTest2.service.goods.GoodsUpdateService;
import springBootTest2.service.goods.GoodsWriteService;

@Controller
@RequestMapping("goods")
public class GoodsController {
	@Autowired
	GoodsNumberService goodsNumberService;
	@Autowired
	GoodsListService goodsListService;
	@Autowired
	GoodsWriteService goodsWriteService;
	@Autowired
	GoodsDetailService goodsDetailService;
	@Autowired
	GoodsDeleteService goodsDeleteService;
	@Autowired
	GoodsUpdateService goodsUpdateService;
	
	@RequestMapping("goodsUpdate")
	public String goodsUpdateOk(GoodsCommand goodsCommand, HttpServletRequest request) {
		goodsUpdateService.execute(goodsCommand, request);
		return "redirect:goodsInfo?num="+goodsCommand.getGoodsNum();
	}
	
	@RequestMapping("goodsModify")
	public String goodsUpdate(@RequestParam(value="num") String goodsNum, Model model) {
		goodsDetailService.execute(goodsNum, model);
		return "thymeleaf/goods/goodsUpdate";
	}
	
	@RequestMapping("goodsDelete")
	public String goodsDelete(@RequestParam(value="num") String goodsNum,  HttpSession session) {
		goodsDeleteService.execute(goodsNum, session);
		return "redirect:goodsList";
	}
	
	@RequestMapping("goodsDetail")
	public String goodsDetail(@RequestParam(value="num") String goodsNum, Model model) {
		goodsDetailService.execute(goodsNum, model);
		return "thymeleaf/goods/goodsInfo";
	}
	
	@RequestMapping(value = "goodsRegist", method = RequestMethod.POST)
	public String goodsRegist(GoodsCommand goodsCommand, HttpSession session, HttpServletRequest request) {
		goodsWriteService.execute(goodsCommand , session, request);
		return "redirect:goodsList";
	}
	
	@RequestMapping("goodsList")
	public String goodsList(Model model) {
		goodsListService.execute(model);
		return "thymeleaf/goods/goodsList";
	}
	
	@RequestMapping("goodsWrite")
	public String goodsWrite(Model model, HttpSession session) {
		goodsNumberService.execute(model, session);
		return "thymeleaf/goods/goodsForm";
	}
}
