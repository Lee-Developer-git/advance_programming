package point;

import java.sql.*;

public class pointDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public pointDAO(){
		String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver"; // jdbc ����̹� �ּ�
		String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe"; // DB ���� �ּ�
		String USERNAME = "orgteam"; // DB ID
		String PASSWORD = "orgteam"; // DB Password
		try {
		    Class.forName(JDBC_DRIVER);
		    conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		} catch (Exception e) {
		    System.out.println("Class Not Found Exection");
		    e.printStackTrace();
		}
	}
	
	//��ü - �ʿ��� ����Ʈ ���(��ι��� ���� ����)
	public int insertPoint(String Oid, int point, String pointproduct) {
		String SQL = "INSERT INTO orgPoint(Oid, MPid, point, pointproduct) VALUES (?, ?, ?, ?)";
		
		try{
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, Oid); //���̵� ��������
			pstmt.setString(2, null);
			pstmt.setInt(3, point);
			pstmt.setString(4, pointproduct);
			
			return pstmt.executeUpdate();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return 0;
	}
	
	//��ü - ����� ����Ʈ�� ���� ��ȸ
	public Point getpoint(String Oid) {
		String SQL = "SELECT * FROM orgPoint WHERE Oid = ?";
		
		try {
			pstmt = conn.prepareStatement(SQL);
			
			pstmt.setString(1, Oid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Point Point = new Point();
				
				Point.setOid(rs.getString(1));
				Point.setMPid(rs.getString(2));
				Point.setPoint(rs.getInt(3));
				Point.setPointproduct(rs.getString(4));
				return Point;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}