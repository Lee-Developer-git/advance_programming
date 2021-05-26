package document;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.Org;

import product.productVO;

public class documentDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public documentDAO(){
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
	
	//���� ���� ��ȸ //�� ���ٸ� ��ȸ
	public Document getdoc(String Oid) {
		String SQL = "SELECT * FROM orgDocument WHERE Oid = ? AND ROWNUM = 1";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			
			pstmt.setString(1, Oid);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Document Document = new Document();
				
				Document.setDocumentID(rs.getInt(1));
				Document.setProductName(rs.getString(3));
				Document.setDocumentStatement(rs.getString(4));
				return Document;
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	
	//���� ���� �ۼ�
	public int write(int documentID, String Oid, String productName, String documentStatement) {
		String SQL = "INSERT INTO orgDocument(documentID, Oid, productName, documentStatement) VALUES (?, ?, ?, ?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			
			pstmt.setInt(1, 1); //���������� �ۼ��ϸ� ������ documentID�� 1�̵ȴ�.
			pstmt.setString(2, Oid);
			pstmt.setString(3, productName);
			pstmt.setString(4, documentStatement);
			
			return pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int delete(String productName) {
		String SQL = "DELETE FROM orgDocument WHERE productName = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			
			pstmt.setString(1, productName);
			
			return pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}
