package com.wendy.study.controller;

import com.wendy.study.data.ProductData;
import com.wendy.study.data.ProductDataRequestModel;
import com.wendy.study.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
@RequestMapping(path = "/product")
public class ProductController {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ProductService productService;

	@GetMapping("/findFirst10Product")
	public List<ProductData> findFirst10Product(){

		return productService.findFirst10Product();
	}
	@PostMapping("/insert")
	public ProductData insertProduct(ProductDataRequestModel product){
		return productService.save(modelMapper.map(product,ProductData.class));
	}

	@DeleteMapping("/{productPk}/delete")
	public void deleteProduct(@PathVariable long productPk){
		productService.delete(productPk);
	}

	@PutMapping("/{productPk}/edit")
	public ProductData editProduct(@PathVariable long productPk,ProductDataRequestModel product){
		ProductData productData = productService.findOne(productPk);
		Assert.notNull(productData,"Product");
		return productService.save(modelMapper.map(product,ProductData.class));
	}

	@GetMapping("/{productPk}")
	public ProductData showProduct(@PathVariable long productPk){
		ProductData productData = productService.findOne(productPk);
		Assert.notNull(productData,"Product");
		return productData;
	}

	@GetMapping("/all")
	public Page<ProductData> showProducts(@PageableDefault(size = 10,sort ={"productPk"},direction = Sort.Direction.ASC) Pageable pageable){
		return productService.findAllByPage(pageable);
	}











}
