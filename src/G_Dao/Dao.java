package G_Dao;

import java.util.ArrayList;

import G.model.SellerMember;

public interface Dao {
	/* 서비스마다 주석달아놓기 */
	int selectNum();
	
	void insert(SellerMember g);
	
	ArrayList<SellerMember>selectAllByname(String s_name);
	
	SellerMember select(int num);
	
	void update(SellerMember g);
	
	void delete(int num);
	
	ArrayList<SellerMember> selectAll();

	void insertImg(SellerMember g);
	
	ArrayList<SellerMember> getGoodsById(String s_id);
	
	SellerMember getProduct(int seq);
	
	void updateImg(SellerMember g);
	}
	

