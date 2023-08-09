package B_dao;

import java.util.ArrayList;

import B_model.B_ProductContent;

public interface DaoContent {

	void inset(B_ProductContent c);
	
	void update(B_ProductContent c);
	
	void delete(int seq);
	
	ArrayList<B_ProductContent> selectAll();
}
