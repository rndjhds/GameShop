package B_service;

import java.util.ArrayList;

import B_dao.DAO;
import B_dao.DaoImpl;
import B_model.B_Product;

public class ServiceImpl implements Service{

	private DAO dao;
	
	public ServiceImpl() {
		this.dao = new DaoImpl();
	}
	
	@Override
	public B_Product getB_product(int num) {
		// TODO Auto-generated method stub
		return dao.select(num);
	}

	@Override
	public void add(B_Product p) {
		p.setSeq(selectGBoardSeq() );
		// TODO Auto-generated method stub
		dao.inset(p);
		dao.insertImg(p);
	}

	@Override
	public void edit(B_Product p) {
		// TODO Auto-generated method stub
		dao.update(p);
	}

	@Override
	public void del(int num) {
		// TODO Auto-generated method stub
		dao.delete(num);
	}

	@Override
	public ArrayList<B_Product> getB_ProductsAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public int selectGBoardSeq() {
		// TODO Auto-generated method stub
		return dao.selectGBoardSeq();
	}

}
