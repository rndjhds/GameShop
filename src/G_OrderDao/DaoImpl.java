package G_OrderDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import G.model.SellerMember;
import conn.DBConnect;

public class DaoImpl  implements Dao{
	
	
	private DBConnect db;
	
	public DaoImpl() {
		db = DBConnect.getInstance();
	}


	@Override
	public ArrayList<SellerMember> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<SellerMember> Goodss = new ArrayList();
		SellerMember sellerMember = null;
		ResultSet rs = null;
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "select gg.seq, gg.product_name, gg.price, gi.url from G_Goods gg, G_Img gi where gg.seq = gi.g_goods_seq and gg.delete_yn = 'N'";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				sellerMember = new SellerMember();
				sellerMember.setSeq(rs.getInt(1));
				sellerMember.setProduct_name(rs.getString(2));
				sellerMember.setPrice(rs.getInt(3));
				sellerMember.setImg(rs.getString(4));
				Goodss.add(sellerMember);
			}
			rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return Goodss;
	}

}
