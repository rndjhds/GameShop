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
	public void join(Member m) {
		// TODO Auto-generated method stub
		Connection conn = null;

		PreparedStatement pstmt = null;
		
		String sql = "SELECT * FROM G_member m JOIN G_img img ON m.Id = img.g_member_id";
		
		
		
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);

			
			
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
	public void insertImg(Member m) {
		// TODO Auto-generated method stub
		
			Connection conn = null;
		
		String sql = "insert into G_img(G_member_id, url) values(?, ?)";
		
		PreparedStatement pstmt = null;
		
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getUrl());
			
			
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
		PreparedStatement pstmt = null;
		
		String sql = "select * from G_Member where id=?";
		try {
			// Ŀ�ؼ� ��ü ȹ��
			conn = db.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) { 
			m = new Member(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
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
		return m;
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		String sql = "update G_Member set password=?, email=?, birth=?, tel=?, address=?, type=? where id=?";

		PreparedStatement pstmt = null;
		try {

			conn = db.getConnection();


			pstmt = conn.prepareStatement(sql);


			pstmt.setString(1, m.getPassword());
			pstmt.setString(2, m.getEmail());
			pstmt.setString(3, m.getBirth());
			pstmt.setString(4, m.getTel());
			pstmt.setString(5, m.getAddress());
			pstmt.setInt(6, m.getType());
			pstmt.setString(7, m.getId());
			
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
		
		Connection conn = null;
		
		String sql = "delete G_Member where id=?";
		
		PreparedStatement pstmt = null;
		
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	    @Override
	    public String selectUrlById(String id) {
	        Connection conn = null;
	        ResultSet rs = null;
	        String url = null;
	        PreparedStatement pstmt = null;
	        
	        String sql = "SELECT url FROM G_img WHERE G_Member_id=?";
	        try {
	            conn = db.getConnection();
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setString(1, id);
	            rs = pstmt.executeQuery();
	            if (rs.next()) {
	                url = rs.getString("url");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                rs.close();
	                pstmt.close();
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        
	        return url;
	    }
	    
	    
	    @Override
	    public void deleteImage(String memberId) {
	        Connection conn = null;
	        PreparedStatement pstmt = null;
	        String sql = "DELETE FROM G_Img WHERE G_Member_id = ?";

	        try {
	            conn = db.getConnection();
	            pstmt = conn.prepareStatement(sql);
	            pstmt.setString(1, memberId);
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (pstmt != null) {
	                    pstmt.close();
	                }
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }


		@Override
		public void findid(String password) {
			// TODO Auto-generated method stub
			Connection conn = null;
		    ResultSet rs = null;
		    String id = null; // 결과로 찾은 아이디를 저장할 변수
		    PreparedStatement pstmt = null;

		    String sql = "SELECT id FROM G_Member WHERE password=?";
		    try {
		        conn = db.getConnection();
		        pstmt = conn.prepareStatement(sql);
		        pstmt.setString(1, password); // 매개변수로 받은 password를 설정
		        rs = pstmt.executeQuery();
		        if (rs.next()) {
		            id = rs.getString("id"); // 결과에서 id 값을 가져옴
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            if (rs != null) rs.close();
		            if (pstmt != null) pstmt.close();
		            if (conn != null) conn.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		}
	    
	    
	}


