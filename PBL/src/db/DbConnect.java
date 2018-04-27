package db;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Ashwani
 */
public class DbConnect {
    public static Statement st;
    public static Connection con;
     public static void  DbConnect() {
          
         try {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","PBL_LAB","PBL_LAB");
             st=con.createStatement();
             
             
         }
         catch(Exception e){
             System.out.println(e);
         }
    }
}
