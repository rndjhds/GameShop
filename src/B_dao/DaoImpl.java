package B_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import B_model.B_Product;
import conn.DBConnect;

public class DaoImpl implements DAO{
	
	private DBConnect db;
	
	public DaoImpl() {
		db = DBConnect.getInstance();
	}


	@Override
	public B_Product select(int num) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		B_Product B_product = null;
		String sql = "select gb.seq,  gb.title, gb.content, gb.register, "
				+ "to_char(gb.reg_date, 'yyyy/MM/dd') reg_date , "
				+ "gb.modifier, to_char(gb.mod_date, 'yyyy/MM/dd') mod_date,  "
				+ "gb.delete_yn, gi.url, gb.category from G_Board gb, G_Img gi "
				+ "where gb.seq = gi.g_board_seq and seq=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				B_product = new B_Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),
						rs.getString(8),rs.getString(9),rs.getInt(10));
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
		return B_product;
	}

	@Override
	public void inset(B_Product p) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		String sql = "insert into G_Board(seq,title,content,register,category) values(?,?,?,?,?)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, p.getSeq());
			pstmt.setString(2, p.getTitle());
			pstmt.setString(3, p.getContent());
			pstmt.setString(4, p.getRegister());
			pstmt.setInt(5, p.getCategory());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void update(B_Product p) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		String sql = "update G_Board set title=?, content=?, modifier=?, mod_date=sysdate, category=? where seq=?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getTitle());
			pstmt.setString(2, p.getContent());
			pstmt.setString(3, p.getModifier());
			pstmt.setInt(4, p.getCategory());
			pstmt.setInt(5, p.getSeq());
			pstmt.executeUpdate();
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
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		String sql = "update G_Board  set delete_yn = 'Y' where seq = ? ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public ArrayList<B_Product> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<B_Product> B_Products = new ArrayList<B_Product>();
		ResultSet rs = null;
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		String sql = "select seq, title, content, register, to_char(reg_date,'yyyy/MM/dd') as reg_date from G_Board where delete_yn = 'N' ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				B_Products.add(new B_Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)));
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
		return B_Products;
	}


	@Override
	public void insertImg(B_Product p) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		String sql = "insert into G_Img(G_board_seq,url) values(?,?)";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, p.getSeq());
			pstmt.setString(2, p.getUrl());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}


	@Override
	public int selectGBoardSeq() {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select G_Board_seq.nextval  from dual";
		int seq = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				seq = rs.getInt(1);
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
		return seq;
	}


	@Override
	public void updateImg(B_Product p) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		String sql = "update g_img set url = ? where g_board_seq =? ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getUrl());
			pstmt.setInt(2, p.getSeq());
			pstmt.executeUpdate();
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
	}



	
}
