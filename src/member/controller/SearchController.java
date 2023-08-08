package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.Member;
import member.serivce.JoinService;
import member.serivce.JoinServicempl;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchController() {
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
		
		HttpSession session = request.getSession(false);

		// 세션에 저장한 id 즉 로그인한 id를 읽는다.
		String id = (String) session.getAttribute("id");
		
		// 로그인한 id로 멤버 정보 검색
		Member m = service.getMember(id);
		
		String url = service.getUrl(id);
		m.setUrl(url);
		
		request.setAttribute("m", m);
		
		// 정보 페이지로 이동
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
