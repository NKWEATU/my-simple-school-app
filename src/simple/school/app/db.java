/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simple.school.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class db {
      public static Connection mycon(){
    Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
          
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user_registeration_database","root","");
            
        }catch (ClassNotFoundException | SQLException e ) {
        System.out.println(e);
        }
        
        return con;
    }
    
}
