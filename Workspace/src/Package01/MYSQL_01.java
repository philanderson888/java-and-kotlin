package Package01;

import java.sql.*;

public class MYSQL_01 {

	public static void main(String[] args) {
		DBConnect connect = new DBConnect();
		connect.getData();
	}

}

class DBConnect{
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Test JDBC ");
			
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/DB01","root","root");
			st = con.createStatement();
		
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void getData(){
		try{
			String query = "select * from persons";
			rs = st.executeQuery(query);
			System.out.println("Records from database");
			while(rs.next()){
				String id = rs.getString("id");
				String name = rs.getString("name");
				String age = rs.getString("age");
				System.out.println("ID is " + id + " and Name is " + name + " and age is " + age);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
