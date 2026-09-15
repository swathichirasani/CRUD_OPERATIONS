import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createTable {
   public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ login_schema ", "root", "admin");
            System.out.println("dbConnected");
            Statement st=con.createStatement();
            st.executeUpdate("CREATE TABLE cse(id INT,name VARCHAR(20),marks INT)");
            System.out.println("Table Created");
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}