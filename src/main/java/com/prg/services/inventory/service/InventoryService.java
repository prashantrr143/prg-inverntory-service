package com.prg.services.inventory.service;

import java.util.List;

import com.prg.services.inventory.common.Product;

public interface InventoryService {

	public List<Product> getAllProducts();

	public Product findById(String productId);

}
