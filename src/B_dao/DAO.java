package B_dao;

import java.util.ArrayList;

import B_model.B_Product;

public interface DAO {
	
	
	B_Product select(int num);
	
	void inset(B_Product p);
	
	void insertImg(B_Product p);
	
	int selectGBoardSeq();
	
	void update(B_Product p);
	
	void delete(int num);
	
	ArrayList<B_Product> selectAll();
	
	
}
