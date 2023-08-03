package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=EUC-KR");
		response.setCharacterEncoding("euc-kr");
		
		JoinService service = new JoinServicempl();
		
		String mem_post = request.getParameter("mem_post");
		String mem_addr1 = request.getParameter("mem_addr1");
		String mem_addr2 = request.getParameter("mem_addr2");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String birth = request.getParameter("birth");
		String tel = request.getParameter("tel");
		String address = mem_post + "/" + mem_addr1 + "/" + mem_addr2;
		int type = Integer.parseInt(request.getParameter("type"));
		   
	
		Member m = new Member
				(id, password, email, birth, tel, address, type);
		
		service.editMember(m);
		
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
