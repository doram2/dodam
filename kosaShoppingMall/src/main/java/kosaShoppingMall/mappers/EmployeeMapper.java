package kosaShoppingMall.mappers;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kosaShoppingMall.domain.EmployeeDTO;

@Component
@Repository(value = "kosaShoppingMall.mappers.EmployeeMapper")
public interface EmployeeMapper {

	Integer empInsert(EmployeeDTO dto);
	
	List<EmployeeDTO> selectAll();

	EmployeeDTO selectOne(String empId);

	Integer empUpdate(EmployeeDTO dto);

	Integer empDelete(String empId);

}
