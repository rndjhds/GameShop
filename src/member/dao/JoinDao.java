package member.dao;

import member.model.Member;

public interface JoinDao {

	void insert(Member m);
	
	Member select(String id);
	
	void update(Member m);
	
	void delete(String id);
	
}
