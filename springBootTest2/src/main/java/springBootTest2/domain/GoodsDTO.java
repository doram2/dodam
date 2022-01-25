package springBootTest2.domain;

import java.util.Date;

import lombok.Data;

@Data
public class GoodsDTO {
	String goodsNum;
	String goodsName;
	String goodsPrice;
	Date goodsDate;
	String goodsContent;
	Integer goodsQty;
	String goodsCompany;
	Integer empNum;
	String goodsImage;
}
