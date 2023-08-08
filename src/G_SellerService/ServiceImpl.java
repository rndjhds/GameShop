package G_SellerService;

import java.util.ArrayList;

import G.model.SellerMember;
import G_Dao.Dao;
import G_Dao.DaoImpl;

public class ServiceImpl implements Service{
	
	private Dao dao;

	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void add(SellerMember g) {
		g.setSeq(dao.selectNum());
		// TODO Auto-generated method stub
		dao.insert(g);
		dao.insertImg(g);
	}

	@Override
	public ArrayList<SellerMember> getGoodsById(String s_id) {
		// TODO Auto-generated method stub
		return dao.getGoodsById(s_id);
	}

	@Override
	public SellerMember getGoods(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editGoods(SellerMember g) {
		dao.update(g);
		dao.updateImg(g);
		
	}

	@Override
	public void delGoods(int num) {
		// TODO Auto-generated method stub
		dao.delete(num);
		
	}

	@Override
	public int makeSeq() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<SellerMember> getGoodsAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public SellerMember editQuantity(int q, int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SellerMember getProduct(int num) {
		// TODO Auto-generated method stub
		return dao.getProduct(num);
	}

	@Override
	public void delProduct(int num) {
		// TODO Auto-generated method stub
		dao.delete(num);
	}

}
