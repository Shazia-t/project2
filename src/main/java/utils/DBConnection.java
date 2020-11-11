/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import java.sql.*;
public class DBConnection {
    public Connection createConnection(){
        try{
            
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/election?user=root&password=12345");
            return conn;
        } catch(SQLException e) {
            System.err.println(e);
            return null;
        }
    }
}
//jdbc:mysql://localhost:3306/election?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
//root@localhost:3306