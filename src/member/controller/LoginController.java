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
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
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
	      request.setCharacterEncoding("EUC-KR");
	        response.setContentType("text/html; charset=EUC-KR");
	        response.setCharacterEncoding("EUC-KR");
	        
	        // 로그인은 잘 되는데 틀렸을 경우 메세지가 안나옴.
	        
	        HttpSession session = request.getSession();

	        JoinService service = new JoinServicempl();
	        
	        String id = request.getParameter("id");
	        String password = request.getParameter("password");

	        Member m = service.getMember(id);

	        // 로그인 성공 여부를 확인하기 위한 변수
	        boolean loginSuccess = false;

	        // ID가 DB에 있는지 확인
	        if (m != null) {
	            // ID가 DB에 존재하는 경우, 비밀번호 확인
	            if (password.equals(m.getPassword())) {
	                // 로그인 성공
	                loginSuccess = true;
	                // 로그인 성공한 ID를 세션에 저장
	                session.setAttribute("id", id);
	            } else {
	                // 비밀번호가 틀렸음을 사용자에게 알림
	                request.setAttribute("errorMessage", "비밀번호가 틀렸습니다.");
	            }
	        } else {
	            // ID가 DB에 없음을 사용자에게 알림
	            request.setAttribute("errorMessage", "아이디가 없습니다.");
	        }

	        // 세션에 로그인 성공 여부를 저장
	        session.setAttribute("flag", loginSuccess);

	        if (loginSuccess) {
	            // 로그인 성공 시 메인 페이지로 이동
	            RequestDispatcher dispatcher = request.getRequestDispatcher("/common/main.jsp");
	            if (dispatcher != null) {
	                dispatcher.forward(request, response);
	            }
	        } else {
	            // 로그인 실패 시 로그인 폼 페이지로 이동
	        	request.setAttribute("errorMessage", "비밀번호나 아이디가 틀렸습니다.");
	            RequestDispatcher dispatcher = request.getRequestDispatcher("/member/loginForm.jsp");
	            if (dispatcher != null) {
	                dispatcher.forward(request, response);
	            }
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
