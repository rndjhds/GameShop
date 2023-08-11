package B_Controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import B_model.B_Product;
import B_service.Service;
import B_service.ServiceImpl;

/**
 * Servlet implementation class B_delController
 */
@WebServlet("/B_board/B_del")
public class B_delController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public B_delController() {
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
		int num = Integer.parseInt(request.getParameter("num"));
		Service service = new ServiceImpl();
		B_Product p = service.getB_product(num);
		String uploadPath = "C:\\Users\\simse\\OneDrive\\바탕 화면\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\GameShop_img";
		String[] arr = p.getUrl().split("/");
		String fname = arr[arr.length-1];
		File f = new File(uploadPath+fname);
		f.delete();
		service.del(num);
		response.sendRedirect("/GameShop/B_board/B_list");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
