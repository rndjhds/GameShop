package B_Controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

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
 * Servlet implementation class B_addController
 */
@WebServlet("/B_board/B_add")
public class B_addController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public B_addController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Service service = new ServiceImpl();
		
		B_Product p = new B_Product();
		
		String img = "";
		
		int maxSize = 1024*1024*10;
		MultipartRequest multi = null;
		String uploadPath = "C:\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\GameShop_img";
		
		try {
			multi = new MultipartRequest(request,uploadPath,maxSize,"utf-8",new DefaultFileRenamePolicy());
			p.setTitle(multi.getParameter("title"));
			p.setContent(multi.getParameter("content"));
			p.setCategory(Integer.parseInt(multi.getParameter("category")));
			Enumeration files = multi.getFileNames()	;
			
			while(files.hasMoreElements()) {
				String file1 = (String) files.nextElement();
				img = multi.getFilesystemName(file1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		p.setUrl("GameShop_img"+img);
		service.add(p);
		response.sendRedirect("GameShop/B_board/B_list");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
