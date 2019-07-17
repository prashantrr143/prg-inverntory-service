package com.prg.services.inventory.dao;

import java.util.List;

import com.prg.services.inventory.common.Product;

public interface InventoryDao {

	public List<Product> getAllProducts();

	public Product save(Product product);

	public Product findById(String productId);

}
