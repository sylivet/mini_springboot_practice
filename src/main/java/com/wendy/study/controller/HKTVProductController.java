package com.wendy.study.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wendy.study.data.hktvmall.HktvProductsData;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.util.List;


@Slf4j
@RestController
@RequestMapping(path = "/hktvproducts")
public class HKTVProductController
{
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/getCodeAndDescription")
	public List<HktvProductsData> showCodeAndDescription()
	{
		ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
		String hktvProductUri = "https://www.hktvmall.com/hktv/zh/ajax/getTop100?code=personalcarenhealth&pageSize=11&currentPage=0";
		String apiResponse = restTemplate.getForObject(hktvProductUri, String.class);
		List<HktvProductsData> productsDataList = null;
		try
		{
			JSONObject json = new JSONObject(apiResponse);
			JSONArray products = json.getJSONArray("products");
			productsDataList = objectMapper.readValue(products.toString(), new TypeReference<List<HktvProductsData>>(){});
		}
		catch (IOException e)
		{
			log.error("get products[].code and products[].description from https://www.hktvmall.com/hktv/zh/ajax/getTop100?code=personalcarenhealth&pageSize=11&currentPage=0",e);
		}
		return productsDataList;
	}

}
