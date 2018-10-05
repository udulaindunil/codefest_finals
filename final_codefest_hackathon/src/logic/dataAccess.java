package logic;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author udula indunil
 */
public class dataAccess
{
    public Connection getConnection(){
        try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/codefestfinal?zeroDateTimeBehavior=convertToNull", "root", "");
            return (Connection) con;
        } catch (SQLException sQLException) {
            return null;

        }
    }
    
    public int getgoodsum(String tablename){
        int goodsum = 0;
        db.DBConnection myconnection = new db.DBConnection();
        String sql = "Select SUM(good) from "+tablename;
        try {
            
            PreparedStatement st = myconnection.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                goodsum = rs.getInt(1);
            }
      
            
        } catch (SQLException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return goodsum;
    }
    
    public int getbadsum(String tablename){
        int badsum = 0;
        db.DBConnection myconnection = new db.DBConnection();
        String sql = "Select SUM(bad) from "+tablename;
        try {
            
            PreparedStatement st = myconnection.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                badsum = rs.getInt(1);
            }
      
            
        } catch (SQLException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return badsum;
    }
    
    public int getcount(String tablename){
        int count = 0;
        db.DBConnection myconnection = new db.DBConnection();
        String sql = "Select count(bad) from "+tablename;
        try {
            
            PreparedStatement st = myconnection.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
      
            
        } catch (SQLException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }



}


