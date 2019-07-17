package com.prg.services.inventory.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.prg.services.inventory.common.Product;
import com.prg.services.inventory.common.exception.ProductNotFoundException;
import com.prg.services.inventory.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {

	private static final Logger logger = LogManager.getLogger(InventoryServiceImpl.class);

	@Override
	public List<Product> getAllProducts() {
		logger.debug("getAllProducts : reached here at service");
		return null;
	}

	@Override
	public Product findById(String productId) {
		logger.debug("findById : reached here at service " + productId);
		if (productId.equalsIgnoreCase("11")) {
			throw new ProductNotFoundException("Product with " + productId + " Not Found");
		}
		Product product = new Product();
		product.setId("QAQA121233");
		product.setPostedDate(new Date());

		return product;
	}

}
