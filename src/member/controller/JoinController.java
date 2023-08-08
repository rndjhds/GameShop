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
 * Servlet implementation class JoinController
 */
@WebServlet("/JoinController")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JoinController() {
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
		
		
		JoinService service = new JoinServicempl();
		
		Member m = new Member();
		
		String img = "";
		int maxSize =1024 *1024 *10;
		MultipartRequest multi = null;
		String uploadPath = "C:\\Users\\User\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\member_img";
		
		
		
		try {
			multi = new MultipartRequest(request, uploadPath, maxSize, "utf-8", new DefaultFileRenamePolicy());

			String mem_post = multi.getParameter("mem_post");
			String mem_addr1 = multi.getParameter("mem_addr1");
			String mem_addr2 = multi.getParameter("mem_addr2");
			
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
		
		m.setUrl("/member_img/" + img);
		service.join(m);	
		service.joinimg(m);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/member/loginForm.jsp");
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
