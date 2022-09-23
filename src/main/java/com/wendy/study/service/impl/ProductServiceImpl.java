package com.wendy.study.service.impl;

import com.wendy.study.dao.ProductDao;
import com.wendy.study.data.ProductData;
import com.wendy.study.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private ProductDao productDao;

	@Override
	public List<ProductData> findFirst10Product()
	{
		return productDao.findFirst10ByOrderByProductPkAsc();
	}

	@Override
	public Page<ProductData> findAllByPage(Pageable pageable)
	{
		return  productDao.findAll(pageable);
	}

	@Override
	public ProductData findOne(long productPk)
	{
		Optional<ProductData> productData = productDao.findById(productPk);
			if (productData.isEmpty()){
				return null;
			}
		return  productData.get();
	}

	@Override
	public ProductData save(ProductData productData){
		return  productDao.save(productData);
	}

	@Override
	public void delete(long productPk)
	{
		productDao.deleteById(productPk);
	}
}
