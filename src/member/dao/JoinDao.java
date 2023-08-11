package member.dao;

import member.model.Member;

public interface JoinDao {

	void insert(Member m);
	
	void join(Member m);
	
	void insertImg(Member m);
	
	Member select(String id);
	
	void update(Member m);
	
	void delete(String id);
	
	String selectUrlById(String id);
	
	void deleteImage(String memberId);
	
	void findid(String password);
	
}
