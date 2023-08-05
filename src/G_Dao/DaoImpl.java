package G_Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.DBConnect;
import model.Goods;

public class DaoImpl implements Dao {
	
	private DBConnect db;
	
	public DaoImpl() {
		db = DBConnect.getInstance();
	}

	@Override
	public int selectNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(Goods g) {
		// TODO Auto-generated method stub
		
		Connection conn = db.getConnection();
		
		String sql = "insert into G_Goods(seq,  product_name, price, content, register) values(G_Goods_seq.nextval, ?, ?, ?, ?) ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, g.getProduct_name());
			pstmt.setInt(2, g.getPrice());
			pstmt.setString(3, g.getContent());
			pstmt.setString(4, g.getRegister());
			
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
	public ArrayList<Goods> selectAllByname(String s_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goods select(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Goods g) {
		Connection conn = db.getConnection();
		
		String sql = "update G_GOODS set Product_name=?,"
				+ " price=?, content=? where num=?";
		
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, g.getProduct_name());
			pstmt.setInt(2, g.getPrice());
			pstmt.setString(3, g.getContent());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//  ڿ    ȯ
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
		
	}

	@Override
	public ArrayList<Goods> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Goods> Goodss = new ArrayList<Goods>();
		ResultSet rs = null;
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "select * from Game_shop";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Goodss.add(new Goods(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),
						rs.getString(7),rs.getString(8), rs.getString(9), rs.getString(10)));
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
}
