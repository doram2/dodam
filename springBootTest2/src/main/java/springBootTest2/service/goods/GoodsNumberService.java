package springBootTest2.service.goods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootTest2.domain.AuthInfo;
import springBootTest2.mapper.EmployeeMapper;
import springBootTest2.mapper.Goods1Mapper;

@Component
@Service
public class GoodsNumberService {
	@Autowired
	Goods1Mapper goods1Mapper;
	@Autowired
	EmployeeMapper employeeMapper;
	public void execute(Model model, HttpSession session) {
		String goodsNum = goods1Mapper.numberGenerate();
		model.addAttribute("goodsNum",goodsNum);
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		String empId = authInfo.getUserId();
		Integer empNum = employeeMapper.getEmpNum(empId);
		model.addAttribute("empNum", empNum);
	}
}
