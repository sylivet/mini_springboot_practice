package com.wendy.study;

import com.wendy.study.data.ProductData;
import com.wendy.study.data.ProductDataRequestModel;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModelMapperConfigTest {

	@Test
	void testProductDataToRequstModel(){
		ProductData productData = new ProductData(1,"1","1",1,1);
		ModelMapper modelMapper = new ModelMapper();
		ProductDataRequestModel productDataRequestModel = modelMapper.map(productData,ProductDataRequestModel.class);
		assertEquals("1", productDataRequestModel.getProductName());
	}
}