package G_Service;

import java.util.ArrayList;

import model.Goods;

public interface Service {
	
	void add(Goods g);
	ArrayList<Goods> getGoodsById(String s_id);
	Goods getGoods(int num);
	
	void editGoods(Goods g);
	void delGoods(int num);
	int makeSeq();
	ArrayList<Goods> getGoodsAll();
	Goods editQuantity(int q, int num);
	void editProduct(Goods g);
	Goods getProduct(int num);
	void delProduct(int num);
	

}
