package com.shop.mapper;

import java.util.HashMap;
import java.util.List;

import com.shop.vo.Cart;
import com.shop.vo.Product;
import com.shop.vo.ProductFile;

//이 인터페이스의 패키지와 인터페이스 이름은 member-mapper.xml 파일의 namespace와 일치
public interface ShopMapper {

	void insertProduct(Product product);

	void insertProductFile(ProductFile file);

	ProductFile selectProductFile(int productNo);

	Product selectProductByProductNo(int productNo);

	List<Product> selectProducts();

	List<HashMap<String, Object>> selectCategories();

	List<String> selectColors();

	List<Cart> selectCarts(String memberId);

	void insertCart(Cart cart);

	void deleteCart(HashMap<String, Object> params);

	void updateCartCntByCartNo(HashMap<String, Object> params);

	List<Cart> findMyCartList(String memberId);
	
	List<Cart> selectCheckoutList(HashMap<String, Object> params);

}
