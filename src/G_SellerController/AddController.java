package G_SellerController;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import G_Service.Service;
import G_Service.ServiceImpl;
import model.Goods;

/**
 * Servlet implementation class AddController
 */
@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Service service = new ServiceImpl();
		
		HttpSession session = request.getSession(false);
		String s_id=(String) session.getAttribute("id");
		Goods g = new Goods();
		g.setProduct_name(s_id);
		g.setSeq(service.makeSeq());
		
		String img="";
		
		int maxSize = 1024*1024*10;
		MultipartRequest multi = null;
		String uploadPath = "C:\\Users\\simse\\OneDrive\\바탕 화면\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\Game_img";
		
		try {
			multi= new MultipartRequest(request, uploadPath, maxSize, "utf-8", new DefaultFileRenamePolicy());
			g.setProduct_name(multi.getParameter("name"));
			g.setPrice(Integer.parseInt(multi.getParameter("price")));
			g.setContent(multi.getParameter("content"));
			
			Enumeration files = multi.getFileNames();
			
			while(files.hasMoreElements()) {
				String file1= (String) files.nextElement();
				img=multi.getOriginalFileName(file1);
				File file = multi.getFile(file1);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		g.setImg("/Game_img/"+img);
		service.add(g);
		response.sendRedirect("/");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
