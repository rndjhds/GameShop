package B_service;

import java.util.ArrayList;

import B_model.B_Product;

public interface Service {
	
	int selectGBoardSeq();

	B_Product getB_product(int num);
	
	void add(B_Product p);
	
	void edit(B_Product p);
	
	void del(int num);
	
	ArrayList<B_Product> getB_ProductsAll();

}