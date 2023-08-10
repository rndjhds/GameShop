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

import G.model.SellerMember;
import G_SellerService.Service;
import G_SellerService.ServiceImpl;

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
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
		
		
		Service service = new ServiceImpl();

		String img="";
		SellerMember g = new SellerMember();
		
		int maxSize = 1024*1024*10;
		MultipartRequest multi = null;
		String uploadPath = "C:\\Users\\simse\\OneDrive\\바탕 화면\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\webapps\\Game_img";
		
		try {
			multi= new MultipartRequest(request, uploadPath, maxSize, "utf-8", new DefaultFileRenamePolicy());
			
			g = service.getProduct(Integer.parseInt(multi.getParameter("seq")));
			
			String[] arr = g.getImg().split("/");
			String fname = arr[arr.length-1];
			File f = new File(uploadPath+'\\'+fname);
			System.out.println(uploadPath+'\\'+fname);
			System.out.println(f.delete());
			f.delete();
			
			g.setSeq(Integer.parseInt(multi.getParameter("seq")));
			g.setProduct_name(multi.getParameter("name"));
			g.setPrice(Integer.parseInt(multi.getParameter("price")));
			g.setContent(multi.getParameter("content"));
			g.setProduct_name(multi.getParameter("product_name"));

			
			Enumeration files = multi.getFileNames();
			
			while(files.hasMoreElements()) {
				String file1= (String) files.nextElement();
				img=multi.getOriginalFileName(file1);
				System.out.println("img : "+img);
				File file = multi.getFile(file1);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		g.setImg("/Game_img/"+img);
		HttpSession session = request.getSession(false);
		String modifier = (String)session.getAttribute("id");
		g.setModifier(modifier);
		

		service.editGoods(g);
		response.sendRedirect("/ListController");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
