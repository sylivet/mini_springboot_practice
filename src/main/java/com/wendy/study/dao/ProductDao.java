package com.wendy.study.dao;

import com.wendy.study.data.ProductData;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends PagingAndSortingRepository<ProductData,Long>
{
	List<ProductData> findFirst10ByOrderByProductPkAsc();
}
