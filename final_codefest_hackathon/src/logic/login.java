package logic;

import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class login {
   public boolean checkuser(String username,String password) throws SQLException{
       DBConnection con = new DBConnection();
       String sql = "SELECT password from login where user_name=?";
       
       try {
           PreparedStatement p = con.getConnection().prepareStatement(sql);
           p.setString(1,username);
           ResultSet r = p.executeQuery();
           String storedPassword="";
           if(r.next())
              storedPassword = r.getString("password");
           
           if(storedPassword.equals(password)){
               return true;
           }
           else{
               return false;
           }
           } 
       catch (SQLException ex) {
           return false;
       }
    }
}