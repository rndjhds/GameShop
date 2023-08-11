package G_Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import G.model.SellerMember;
import conn.DBConnect;

public class DaoImpl implements Dao {
	
	private DBConnect db;
	
	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	@Override
	public int selectNum() {
		Connection conn = db.getConnection();
		
		String sql = "select G_Goods_seq.nextval from dual";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		int num = 0;


		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				num = rs.getInt(1);
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				// 占쌘울옙 占쏙옙환
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return num;
	}

	@Override
	public void insert(SellerMember g) {
		// TODO Auto-generated method stub
		
		Connection conn = db.getConnection();
		
		String sql = "insert into G_Goods(seq,  product_name, price, content, register) values(?, ?, ?, ?, ?) ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, g.getSeq());
			pstmt.setString(2, g.getProduct_name());
			pstmt.setInt(3, g.getPrice());
			pstmt.setString(4, g.getContent());
			pstmt.setString(5, g.getRegister());
			
			pstmt.executeUpdate();
			
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}
		finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

	@Override
	public ArrayList<SellerMember> selectAllByname(String s_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SellerMember select(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(SellerMember g) {
		Connection conn = db.getConnection();
		
		String sql = "update G_GOODS set Product_name=?,"
				+ " price=?, content=?, modifier = ?, mod_date = sysdate where seq=?";
		
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, g.getProduct_name());
			pstmt.setInt(2, g.getPrice());
			pstmt.setString(3, g.getContent());
			pstmt.setString(4, g.getModifier());
			pstmt.setLong(5, g.getSeq());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//  悶    환
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		
		Connection conn = db.getConnection();
		
		String sql = "update g_goods set delete_yn = 'Y' where seq = ?";
		
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//  悶    환
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

	@Override
	public ArrayList<SellerMember> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<SellerMember> Goodss = new ArrayList<SellerMember>();
		ResultSet rs = null;
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "select * from G_Goods where delte_yn = 'N'";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Goodss.add(new SellerMember(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),
						rs.getString(7),rs.getString(8), rs.getString(9)));
			}
			rs.close();
		}catch(SQLException e){
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

	@Override
	public void insertImg(SellerMember g) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		
		String sql = "insert into G_img(G_Goods_seq, url)values(?,?)";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, g.getSeq());
			pstmt.setString(2, g.getImg());
			
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}
		finally {
			try {
				if(pstmt !=null){
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public ArrayList<SellerMember> getGoodsById(String s_id) {
		// TODO Auto-generated method stub
		ArrayList<SellerMember> Goodss = new ArrayList<SellerMember>();
		ResultSet rs = null;
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		SellerMember sellerMember = null;
		
		String sql = "select gg.seq, gg.product_name, gg.price, gi.url from G_Goods gg, G_Img gi where gg.seq = gi.g_goods_seq and gg.register = ? and gg.delete_yn = 'N'";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s_id);
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				sellerMember = new SellerMember();
				sellerMember.setSeq(rs.getInt(1));
				sellerMember.setProduct_name(rs.getString(2));
				sellerMember.setPrice(rs.getInt(3));
				sellerMember.setImg(rs.getString(4));
				Goodss.add(sellerMember);
			}
		}catch (Exception e) {
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

	@Override
	public SellerMember getProduct(int seq) {
		ResultSet rs = null;
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		SellerMember sellerMember = null;
		
		String sql = "select gg.seq, gg.product_name, gg.register, gg.price, gg.content, gi.url from G_Goods gg, G_Img gi where gg.seq = gi.g_goods_seq and gg.seq = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			rs= pstmt.executeQuery();
			
			if(rs.next()) {
				sellerMember = new SellerMember();
				sellerMember.setSeq(rs.getInt(1));
				sellerMember.setProduct_name(rs.getString(2));
				sellerMember.setRegister(rs.getString(3));
				sellerMember.setPrice(rs.getInt(4));
				sellerMember.setContent(rs.getString(5));
				sellerMember.setImg(rs.getString(6));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return sellerMember;
	}

	@Override
	public void updateImg(SellerMember g) {
		Connection conn = db.getConnection();
		
		String sql = "update g_img set url = ? where g_goods_seq = ?";
		
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, g.getImg());
			pstmt.setInt(2, g.getSeq());
			pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//  悶    환
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
	
