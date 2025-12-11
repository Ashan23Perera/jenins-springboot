package com.ecommerce.product_service;

import com.ecommerce.product_service.controller.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
class ProductServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testHelloEndpoint() throws Exception {
		String expectedJson = "[\"Product1\",\"Product2\",\"Product3\"]";

		mockMvc.perform(get("/api/product"))
				.andExpect(status().isOk())
				.andExpect(content().json(expectedJson));
	}

}
