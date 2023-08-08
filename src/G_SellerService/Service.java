package G_SellerService;

import java.util.ArrayList;

import G.model.SellerMember;

public interface Service {
	
	void add(SellerMember g);
	ArrayList<SellerMember> getGoodsById(String s_id);
	SellerMember getGoods(int num);
	
	void editGoods(SellerMember g);
	void delGoods(int num);
	int makeSeq();
	ArrayList<SellerMember> getGoodsAll();
	SellerMember editQuantity(int q, int num);
	SellerMember getProduct(int num);
	void delProduct(int num);
	

}
