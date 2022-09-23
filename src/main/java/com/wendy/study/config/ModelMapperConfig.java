package com.wendy.study.config;
import com.wendy.study.data.ProductData;
import com.wendy.study.data.ProductDataRequestModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class ModelMapperConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setFullTypeMatchingRequired(true);
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);
		configureProduct(modelMapper);
		return modelMapper;
	}

	private void configureProduct(ModelMapper modelMapper) {
		modelMapper.typeMap(ProductDataRequestModel.class, ProductData.class);
		modelMapper.typeMap(ProductData.class,ProductDataRequestModel.class);
	}
}
