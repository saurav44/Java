import java.sql.*;  

public class MySqlCon{  
public static void main(String args[]){ 
 
 try{  
Class.forName("com.mysql.jdbc.Driver");  
 
//Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_sql","root","12345678");
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from java_sql.employee");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  