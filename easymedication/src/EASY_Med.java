
package easy_med;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.*;
public class EASY_Med {
    public static void main(String[] args)
    {
        try
        {
          
          Class.forName("com.mysql.jdbc.Driver");
          
          Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","system");
          Statement stmt = conn.createStatement();
          
        }
        catch(Exception ex)
        {
            
        }
        // TODO code application logic here
    
    }
    
    
}
