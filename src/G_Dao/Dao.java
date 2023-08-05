package G_Dao;

import java.util.ArrayList;

import model.Goods;

public interface Dao {
	
	int selectNum();
	
	void insert(Goods g);
	
	ArrayList<Goods>selectAllByname(String s_name);
	
	Goods select(int num);
	
	void update(Goods g);
	
	void delete(int num);
	
	ArrayList<Goods> selectAll();
	

}
