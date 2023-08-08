package B_Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import B_model.B_Product;
import B_service.Service;
import B_service.ServiceImpl;

/**
 * Servlet implementation class B_detailController
 */
@WebServlet("/B_board/B_detail")
public class B_detailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public B_detailController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = "";
		int num = Integer.parseInt(request.getParameter("num"));
		System.out.println("num : " + num);
		Service service = new ServiceImpl();
		B_Product p = service.getB_product(num);
		
		System.out.println("p.getSeq() : " + p.getSeq());
		System.out.println("p.getTitle(): " + p.getTitle());
		
		
		request.setAttribute("p", p);
		path = "/B_board/B_detail.jsp";
		
		
		 RequestDispatcher rd = request.getRequestDispatcher(path);
		 rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
