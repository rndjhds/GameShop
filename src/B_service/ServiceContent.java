package B_service;

import java.util.ArrayList;

import B_model.B_ProductContent;

public interface ServiceContent {

	// 등록
	void addcontent(B_ProductContent c);
	
	// 수정
	void editcontent(B_ProductContent c);
	
	//삭제
	void delcontent(int seq);
	
	// 전체출력
	ArrayList<B_ProductContent> getB_ProductContentsAll();
}
