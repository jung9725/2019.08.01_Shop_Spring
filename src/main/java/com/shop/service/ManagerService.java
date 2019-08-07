package com.shop.service;

import java.util.List;

import com.shop.vo.Product;
import com.shop.vo.ProductFile;

public interface ManagerService {
	Integer registerProductTx(Product product);
	
	void insertProductFile(ProductFile file);

	List<Product> findProductList(String category);

	ProductFile findUploadFile(int productNo);

	Product findProductByProductNo(int productNo);

	List<ProductFile> findProductFilesByProductNo(int productNo);

	ProductFile findProductFile(int productNo);

	void updateProduct(Product product);

	void insertProductFiles(Product product, int productNo);

	void deleteProduct(int productNo);

	ProductFile findProductFileByProductFileNo(int productFileNo);

	void deleteProductFile(int productFileNo);

	void updateProductFile(ProductFile productFile);
}