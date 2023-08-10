/ 
// Decompiled by Procyon v0.5.36
// 

package G_OrderController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.util.ArrayList;
import G.OrderService.Service;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import G.model.SellerMember;
import G.OrderService.ServiceImpl;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet({ "/OrderList" })
public class OrderList extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        final Service service = (Service)new ServiceImpl();
        final ArrayList<SellerMember> Goodss = (ArrayList<SellerMember>)service.orderList();
        for (int i = 0; i < Goodss.size(); ++i) {
            System.out.println(Goodss.get(i).getSeq());
        }
        request.setAttribute("Goodss", (Object)Goodss);
        final String path = "/G.view/order/list.jsp";
        final RequestDispatcher rd = request.getRequestDispatcher(path);
        rd.forward((ServletRequest)request, (ServletResponse)response);
    }
    
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}