package com.prg.services.inventory.controller;

import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prg.services.inventory.common.Product;
import com.prg.services.inventory.service.InventoryService;

@RestController
@RequestMapping(path = "/inventory")
public class InventoryController {

	private static final Logger logger = LogManager.getLogger(InventoryController.class);

	@Autowired
	private InventoryService inventoryService;

	@GetMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProducts() {
		logger.log(Level.DEBUG, "Executing GetAllProdcuts");
		return inventoryService.getAllProducts();
	}

	@GetMapping(path = "/products/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product getProductById(@PathVariable(name = "productId") String productId) {
		logger.log(Level.DEBUG, "Executing getProductById with ProductId " + productId);
		return inventoryService.findById(productId);
	}

}
