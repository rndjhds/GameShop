package member.controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import member.model.Member;
import member.serivce.JoinService;
import member.serivce.JoinServicempl;




/**
 * Servlet implementation class EditController
 */
@WebServlet("/EditController")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 // 요청과 응답의 인코딩 설정
	    request.setCharacterEncoding("euc-kr");
	    response.setContentType("text/html; charset=EUC-KR");
	    response.setCharacterEncoding("euc-kr");

	    // JoinServicempl 클래스의 인스턴스 생성
	    JoinService service = new JoinServicempl();

	    // 세션을 가져와서 로그인한 사용자의 ID를 읽어옴
	    HttpSession session = request.getSession(false);
	    String id = (String) session.getAttribute("id");

	    // 로그인한 사용자의 ID로 멤버 정보를 조회하여 가져옴
	    Member m = service.getMember(id);

	    // 기존 이미지 URL을 가져옴
	    String imageUrl = m.getUrl();

	    // 이미지 URL이 존재할 경우, 해당 이미지 파일을 서버에서 삭제함
	    if (imageUrl != null) {
	        String[] arr = imageUrl.split("/");
	        String fname = arr[arr.length - 1];
	        String uploadPath = "C:\\Users\\User\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\member_img";
	        File f = new File(uploadPath + fname);
	        f.delete();
	    }

	    // 새로운 이미지 정보를 저장하기 위한 변수 초기화
	    String img = "";
	    int maxSize = 1024 * 1024 * 10;
	    MultipartRequest multi = null;
	    String uploadPath = "C:\\Users\\User\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\member_img";

	    try {
	        // 요청을 파싱하여 새로운 이미지 데이터를 가져옴
	        multi = new MultipartRequest(request, uploadPath, maxSize, "utf-8", new DefaultFileRenamePolicy());

	        // 기타 폼 데이터를 가져옴
	        String mem_post = multi.getParameter("mem_post");
	        String mem_addr1 = multi.getParameter("mem_addr1");
	        String mem_addr2 = multi.getParameter("mem_addr2");

	        // 새로운 멤버 정보를 업데이트
	        m.setId(multi.getParameter("id"));
	        m.setPassword(multi.getParameter("password"));
	        m.setEmail(multi.getParameter("email"));
	        m.setBirth(multi.getParameter("birth"));
	        m.setTel(multi.getParameter("tel"));
	        m.setAddress(mem_post + "/" + mem_addr1 + "/" + mem_addr2);
	        m.setType(Integer.parseInt(multi.getParameter("type")));

	        Enumeration files = multi.getFileNames();

	        while (files.hasMoreElements()) {
	            String file1 = (String) files.nextElement();
	            img = multi.getOriginalFileName(file1);
	            File file = multi.getFile(file1);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    // 새로운 이미지 URL로 멤버 정보를 업데이트
	    m.setUrl("/member_img/" + img);

	    // 기존 이미지를 데이터베이스에서 삭제
	    service.deleteImage(m.getId());

	    // 멤버 정보를 데이터베이스에 업데이트
	    service.editMember(m);
	    // 새로운 이미지 정보를 데이터베이스에 삽입
	    service.joinimg(m);

	    
	    
	    
		String[] address = m.getAddress().split("/");
		request.setAttribute("mem_post", address[0]);
		request.setAttribute("mem_addr1", address[1]);
		request.setAttribute("mem_addr2", address[2]);
		
		String url = service.getUrl(id);
		m.setUrl(url);
		
		request.setAttribute("m", m);
		
	    // 로그인 폼 페이지(loginForm.jsp)로 이동
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/member/updateUser.jsp");
	    if (dispatcher != null) {
	        dispatcher.forward(request, response);
	    }
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
