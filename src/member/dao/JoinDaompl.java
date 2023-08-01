package member.dao;

import conn.DBConnect;
import member.model.Member;

public class JoinDaompl implements JoinDao{

	private DBConnect db;
	
	public JoinDaompl() {
		db = DBConnect.getInstance();
	}
	
	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member select(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
