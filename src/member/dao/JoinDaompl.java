package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conn.DBConnect;
import member.model.Member;

public class JoinDaompl implements JoinDao{

	private DBConnect db;
	
	public JoinDaompl() {
		db = DBConnect.getInstance();
	}
	
	
	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		String sql = "insert into G_Member(id, password, email, birth, tel, address, type) values(?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement pstmt = null;
		
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);

			
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPassword());
			pstmt.setString(3, m.getEmail());
			pstmt.setString(4, m.getBirth());
			pstmt.setString(5, m.getTel());
			pstmt.setString(6, m.getAddress());
			pstmt.setInt(7, m.getType());
			
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}


	
	
	@Override
	public Member select(String id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		ResultSet rs = null;
		Member m = null;
		String sql = "select * from G_Member where id=?";
		PreparedStatement pstmt = null;
		
		try {
			// Ŀ�ؼ� ��ü ȹ��
			conn = db.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return new 
			Member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getString(5),rs.getString(6),rs.getInt(7));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// �ڿ� ��ȯ
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return null;
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		String sql = "update G_Member set password=?, email=?, birth=?, tel=?, address=? type=? where id=?";

		PreparedStatement pstmt = null;
		try {
			// Ŀ�ؼ� ��ü ȹ��
			conn = db.getConnection();

			// java���� sql�� �����ϴ� PreparedStatement��ü ����
			pstmt = conn.prepareStatement(sql);

			// sql�� ?�Ķ���� ��Ī
			pstmt.setString(1, m.getPassword());
			pstmt.setString(2, m.getEmail());
			pstmt.setString(3, m.getBirth());
			pstmt.setString(4, m.getTel());
			pstmt.setString(5, m.getAddress());
			pstmt.setInt(6, m.getType());
			
			// sql����
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// �ڿ� ��ȯ
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
