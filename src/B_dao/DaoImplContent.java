package B_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import B_model.B_ProductContent;
import conn.DBConnect;

public class DaoImplContent implements DaoContent{
	
	private DBConnect db;
	
	public DaoImplContent() {
		db = DBConnect.getInstance();
	}

	@Override
	public void inset(B_ProductContent c) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		String sql = "insert into G_Board_Comment(seq,content,register) values(?,?,'SEOK')";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, c.getSeq());
			pstmt.setString(2, c.getContent());
			pstmt.setString(3, c.getRegister());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	

	@Override
	public void update(B_ProductContent c) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		String sql = "update G_Board_Comment set  content=?, modifier=?, mod_date=sysdate,  where seq=?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getContent());
			pstmt.setString(2, c.getModifier());
			pstmt.setInt(3, c.getSeq());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void delete(int seq) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		String sql = "update G_Board_Comment  set delete_yn = 'Y' where seq = ? ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public ArrayList<B_ProductContent> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<B_ProductContent> B_ProductContents = new ArrayList<B_ProductContent>();
		ResultSet rs = null;
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		String sql = "select seq, content, register, to_char(reg_date,'yyyy/MM/dd')as reg_date from G_Board_Comment where deletr_yn = 'N'";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				B_ProductContents.add(new B_ProductContent(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return B_ProductContents;
	}
}
