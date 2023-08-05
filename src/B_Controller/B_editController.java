package B_Controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import B_model.B_Product;
import B_service.Service;
import B_service.ServiceImpl;

/**
 * Servlet implementation class B_editController
 */
@WebServlet("/B_board/b_edit")
public class B_editController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public B_editController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Service service = new ServiceImpl();
		B_Product p = new B_Product()	;
		String path	= "";
		String img = "";
		
		int maxSize = 1024*1024*10;
		MultipartRequest multi = null;
		String uploadPath = "C:\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\GameShop_img";
		
		try {
			multi = new MultipartRequest(request,uploadPath,maxSize,"utf-8",new DefaultFileRenamePolicy());
			p.setTitle(request.getParameter("title"));
			p.setCategory(Integer.parseInt(request.getParameter("category")));
			p.setContent(request.getParameter("content"));
			p.setUrl("GameShop_img" + img);
			Enumeration files = multi.getFileNames()	;
			String file1 = (String) files.nextElement();
			img = multi.getFilesystemName(file1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		service.edit(p);
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
