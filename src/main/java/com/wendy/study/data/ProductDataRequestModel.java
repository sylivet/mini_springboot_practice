package com.wendy.study.data;

import lombok.Data;


@Data
public class ProductDataRequestModel
{
	private long productPk;
	private String productName;
	private String productDescription;
	private int productStock;
	private int productStatus;
}
