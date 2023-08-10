package G.OrderService;

import java.util.ArrayList;

import G.model.SellerMember;

public interface Service {
	
	void addOrder(SellerMember g);
	SellerMember getOrder(int num);
	ArrayList<SellerMember> orderList1();
	void editState(String type, int num);
	void delOrder(int num);
	ArrayList<SellerMember> orderList();
	
	

}
