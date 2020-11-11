/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rushank Shah
 */
public class Testing2 {
    public static void main(String[] args) {
        try {
            DBConnection connect = new DBConnection();
            Connection conn = connect.createConnection();
            Statement stmt = conn.createStatement();
            String name ="ABCD";
            String fname ="ABCDEF";
            String dob="1990-05-31";
            int num=1;
            String sql =  "delete from `voters` where `voterid` like (?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,num);
            
            int r = ps.executeUpdate();
            if(r>0){
                System.out.print("Successful");
            }
           conn.close();
        }
        catch(SQLException e){
            System.out.print(e);
        }
            
    }
}