package member.serivce;

import member.model.Member;

public interface JoinService {

	
	void join(Member m);
	
	void joinimg(Member m);
	
	Member getMember(String id);
	
	void editMember(Member m);
	
	void delMember(String id);
	
	String getUrl(String id);
	
	void deleteImage(String memberId);
}
