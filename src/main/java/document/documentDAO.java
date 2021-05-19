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
		System.out.print("User Table ���� : ");
		try {
		    Class.forName(JDBC_DRIVER);
		    conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		    if(conn!= null) {System.out.print("����");}
		} catch (Exception e) {
		    System.out.println("Class Not Found Exection");
		    e.printStackTrace();
		}
	}
	
	//���� ���� ��ȸ
	public Document getdoc(String Oid) {
		String SQL = "SELECT * FROM orgDocument WHERE Oid = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			
			pstmt.setString(1, Oid);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Document Document = new Document();
				
				Document.setDocumentID(rs.getInt(1));
				Document.setDocumentURL(rs.getString(3));
				Document.setDocumentStatement(rs.getString(4));
				System.out.println(Document.getDocumentStatement());
				return Document;
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	
	//���� ���� �ۼ�
	public int write(int documentID, String Oid, String documentURL, String documentStatement) {
		return -1;
	}
}
