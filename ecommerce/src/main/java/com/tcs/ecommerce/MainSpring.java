package com.tcs.ecommerce;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.ecommerce.config.DBConfig;
import com.tcs.ecommerce.model.Product;
import com.tcs.ecommerce.service.ProductService;

public class MainSpring {
	
	public static void main(String[] args) {
		System.out.println("Before object creating");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		System.out.println("after context creation");
		ProductService productService = context.getBean(ProductService.class);
		ProductService productService2 = context.getBean(ProductService.class);
		Product product = new Product(5, "laptop modified", "i5 10th gen", 123.0f, "mac laptop");
		String result = productService.createProduct(product);
		System.out.println(result);
		System.out.println(productService.equals(productService2));
		System.out.println(productService == productService2);
		
		
		if(productService.getProductById(5).isPresent()) {
			System.out.println("product exists ");
		}
		else {
			System.out.println("not available");
		}
		context.close();
	}

}
