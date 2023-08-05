package G_SellerController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import G_Service.Service;
import G_Service.ServiceImpl;
import model.Goods;

/**
 * Servlet implementation class EditController
 */
@WebServlet(name ="GEditController", urlPatterns = { "/seller/Edit" })
public class GEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GEditController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Service service = new ServiceImpl();

		Goods g = new Goods();

		g.setProduct_name(request.getParameter("name"));
		g.setPrice(Integer.parseInt(request.getParameter("price")));
		g.setContent(request.getParameter("content"));

		service.editProduct(g);
		response.sendRedirect("/GameShop/seller/List");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
