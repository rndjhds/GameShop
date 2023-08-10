package G_SellerController;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import G.model.SellerMember;
import G_SellerService.Service;
import G_SellerService.ServiceImpl;

/**
 * Servlet implementation class GoodsDelController
 */
@WebServlet("/seller/Del")
public class GoodsDelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodsDelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int seq = Integer.parseInt(request.getParameter("seq"));
		Service service = new ServiceImpl();
		SellerMember g = service.getProduct(seq);
		service.delProduct(seq);
		String uploadPath = "C:\\Users\\simse\\OneDrive\\바탕 화면\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\Game_img";
		
		String[] arr = g.getImg().split("/");
		String fname = arr[arr.length-1];
		File f = new File(uploadPath+'\\'+fname);
		System.out.println(uploadPath+'\\'+fname);
		System.out.println(f.delete());
		f.delete();
		response.sendRedirect(request.getContextPath()+"/ListController");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
