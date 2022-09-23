package com.wendy.study.service;

import com.wendy.study.data.ProductData;
import com.wendy.study.data.ProductDataRequestModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ProductService
{
	List<ProductData> findFirst10Product();
	Page<ProductData> findAllByPage(Pageable pageable);
	ProductData findOne(long productPk);
	ProductData save(ProductData productData);
	void delete(long productPk);

}
