package G.OrderService;

import java.util.ArrayList;

import G.model.SellerMember;
import G_OrderDao.Dao;
import G_OrderDao.DaoImpl;

public class ServiceImpl implements Service{
	
	private Dao dao;
	
	

	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void addOrder(SellerMember g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SellerMember getOrder(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SellerMember> orderList() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public void editState(String type, int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delOrder(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<SellerMember> orderList1() {
		// TODO Auto-generated method stub
		return null;
	}

}
