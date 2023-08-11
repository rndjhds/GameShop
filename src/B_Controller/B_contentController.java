package B_Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import B_model.B_ProductContent;
import B_service.ServiceContent;
import B_service.ServiceImplContent;

/**
 * Servlet implementation class B_contentController
 */
@WebServlet("/B_contentController")
public class B_contentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public B_contentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
	     response.setContentType("text/html; charset=UTF-8");
	     response.setCharacterEncoding("UTF-8");
		ServiceContent service = new ServiceImplContent();
		B_ProductContent c = new B_ProductContent();
		
		try {
			c.setContent(request.getParameter("content"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		service.addcontent(c);
		response.sendRedirect(request.getContextPath()+"/B_board/B_list");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
