package G_SellerController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import G.model.SellerMember;
import G_SellerService.Service;
import G_SellerService.ServiceImpl;

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
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		Service service = new ServiceImpl();
		
		int seq = Integer.parseInt(request.getParameter("seq"));
		String Product_name = request.getParameter("Product_name");
		int price = Integer.parseInt(request.getParameter("price"));
		String Content = request.getParameter("Content");
		String Register = request.getParameter("Register");
		String reg_date = request.getParameter("reg_date");
		String modifier = request.getParameter("modifier");
		String mod_date = request.getParameter("mod_date");
		String delete_yn = request.getParameter("delete_yn");
		
		SellerMember g = new SellerMember(seq, Product_name, price, Content, Register, reg_date, modifier, mod_date, delete_yn );
		
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
