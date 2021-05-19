package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class productDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public productDAO(){
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

    
    public ArrayList<productVO> getList() throws IOException{
        String SQL = "SELECT * FROM product WHERE productID>0";

        ArrayList<productVO> list = new ArrayList<productVO>();

        try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);

            rs = pstmt.executeQuery();

        } catch (Exception e) {
            
        }
        return list;
    }

    
    public int productWrite(int productID, String Oid, int productNumber, String productName) throws IOException {
        String SQL = "INSERT INTO product VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);

            pstmt.setInt(1, productID);
            pstmt.setString(2, Oid);
            pstmt.setInt(3, productNumber);
            pstmt.setString(4, productName);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
}