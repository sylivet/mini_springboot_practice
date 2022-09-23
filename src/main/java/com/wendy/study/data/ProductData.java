package com.wendy.study.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Table(name = "product")
@AllArgsConstructor
@Entity
public class ProductData
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productPk;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_description")
	private String productDescription;

	@Column(name = "product_stock")
	private int productStock;

	@Column(name = "product_status")
	private int productStatus;
}
