package teamProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;;

public class Oder{
	public void getDate(){
		Vector<Vector> data = new Vector<Vector>();
		Connection conn= null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
	
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","AI","1234");
			System.out.println("데이터베이스 연결 성공");
			pstmt=conn.prepareStatement("SELECT * FROM BUYING");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Vector<String> row= new Vector<String>();
				row.add(rs.getString(1));
				row.add(rs.getString(2));
				row.add(rs.getString(3));
				row.add(rs.getString(4));
				row.add(rs.getString(5));
				row.add(rs.getString(6));
				Orderlist.data.add(row);
				


				
			}
			
		}catch(Exception exc){
			exc.printStackTrace();
		}finally{
			try{
				if(pstmt != null)pstmt.close();
				if(conn!=null)conn.close();
				if(rs != null)rs.close();
			}catch(Exception clo){}
//			return data;
		}
	}

}
