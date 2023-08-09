package B_service;

import java.util.ArrayList;

import B_dao.DaoContent;
import B_dao.DaoImplContent;
import B_model.B_ProductContent;

public class ServiceImplContent implements ServiceContent{

	private DaoContent dao;
	
	public ServiceImplContent() {
		this.dao = new DaoImplContent();
		
	}
	@Override
	public void addcontent(B_ProductContent c) {
		// TODO Auto-generated method stub
		dao.inset(c);
	}

	@Override
	public void editcontent(B_ProductContent c) {
		// TODO Auto-generated method stub
		dao.update(c);
	}

	@Override
	public void delcontent(int seq) {
		// TODO Auto-generated method stub
		dao.delete(seq);
	}

	@Override
	public ArrayList<B_ProductContent> getB_ProductContentsAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

}
