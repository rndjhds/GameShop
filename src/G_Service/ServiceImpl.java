package G_Service;

import java.util.ArrayList;

import G_Dao.Dao;
import G_Dao.DaoImpl;
import model.Goods;

public class ServiceImpl implements Service{
	
	private Dao dao;

	public ServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void add(Goods g) {
		// TODO Auto-generated method stub
		dao.insert(g);
	}

	@Override
	public ArrayList<Goods> getGoodsById(String s_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods getGoods(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editGoods(Goods g) {
		dao.update(g);
		
	}

	@Override
	public void delGoods(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int makeSeq() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Goods> getGoodsAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public Goods editQuantity(int q, int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editProduct(Goods g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Goods getProduct(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delProduct(int num) {
		// TODO Auto-generated method stub
		
	}

}
