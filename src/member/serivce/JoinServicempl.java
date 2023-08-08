package member.serivce;

import member.dao.JoinDao;
import member.dao.JoinDaompl;
import member.model.Member;

public class JoinServicempl implements JoinService{

	private JoinDao dao;
	
    public JoinServicempl() {
        this.dao = new JoinDaompl();
    }
    
    
	@Override
	public void join(Member m) {
		// TODO Auto-generated method stub
		dao.insert(m);
	}
	
	@Override
	public void joinimg(Member m) {
		// TODO Auto-generated method stub
		dao.insertImg(m);
		
	}

	@Override
	public Member getMember(String id) {
		// TODO Auto-generated method stub
		return dao.select(id);
	}

	@Override
	public void editMember(Member m) {
		// TODO Auto-generated method stub
		dao.update(m);
		
	}

	@Override
	public void delMember(String id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
    public String getUrl(String id) {
        return dao.selectUrlById(id);
    }


	@Override
	public void deleteImage(String memberId) {
		// TODO Auto-generated method stub
		dao.deleteImage(memberId);
		
	}
	
	
}
