package G_SellerController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import G_Service.Service;
import G_Service.ServiceImpl;
import model.Goods;

/**
 * Servlet implementation class AddFormController
 */
@WebServlet("/AddFormController")
public class AddFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFormController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=EUC-KR");
		response.setCharacterEncoding("euc-kr");
		
		Service service = new ServiceImpl();
		
		String Product_name = request.getParameter("Product_name");
		int price = Integer.parseInt(request.getParameter("price"));
		String Content = request.getParameter("Content");
		String Register = request.getParameter("Register");
		
		Goods g = new Goods(price, Product_name, price, Content, Register, Register, Register, Product_name, Content, Register);
		
		service.add(g);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/G.view/seller/list.jsp");
		if (dispatcher != null) {
			dispatcher.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
