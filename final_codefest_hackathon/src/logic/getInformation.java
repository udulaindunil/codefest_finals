/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAMOD LAKMAL
 */
public class getInformation {
    public int  gettotasum(){
      DBConnection myconnection =new DBConnection();
      String sql="SELECT SUM(good) FROM production WHERE sid=1";
      int sum=0;
      PreparedStatement st;
        try {
            st = (PreparedStatement) myconnection.getConnection().prepareStatement(sql);
             
          ResultSet rs = st.executeQuery();
           while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(getInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      return sum;
     
  }  
    
    
    public int  gettotasumcount(){
      DBConnection myconnection =new DBConnection();
      String sql="SELECT COUNT(good) FROM production WHERE sid=1";
      int sum=0;
      PreparedStatement st;
        try {
            st = (PreparedStatement) myconnection.getConnection().prepareStatement(sql);
             
          ResultSet rs = st.executeQuery();
           while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(getInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      return sum;
     
  }  
    
    
    
    public int  gettotasum2(){
      DBConnection myconnection =new DBConnection();
      String sql="SELECT SUM(good) FROM production_2 WHERE sid=2";
      int sum=0;
      PreparedStatement st;
        try {
            st = (PreparedStatement) myconnection.getConnection().prepareStatement(sql);
             
          ResultSet rs = st.executeQuery();
           while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(getInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      return sum;
     
  }  
    
    
    public int  gettotasumcount2(){
      DBConnection myconnection =new DBConnection();
      String sql="SELECT COUNT(good) FROM production_2 WHERE sid=2";
      int sum=0;
      PreparedStatement st;
        try {
            st = (PreparedStatement) myconnection.getConnection().prepareStatement(sql);
             
          ResultSet rs = st.executeQuery();
           while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(getInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      return sum;
     
  }  
    
    
    
     public int  gettotasum3(){
      DBConnection myconnection =new DBConnection();
      String sql="SELECT SUM(good) FROM production_3 WHERE sid=3";
      int sum=0;
      PreparedStatement st;
        try {
            st = (PreparedStatement) myconnection.getConnection().prepareStatement(sql);
             
          ResultSet rs = st.executeQuery();
           while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(getInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      return sum;
     
  }  
    
    
    public int  gettotasumcount3(){
      DBConnection myconnection =new DBConnection();
      String sql="SELECT COUNT(good) FROM production_3 WHERE sid=3";
      int sum=0;
      PreparedStatement st;
        try {
            st = (PreparedStatement) myconnection.getConnection().prepareStatement(sql);
             
          ResultSet rs = st.executeQuery();
           while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(getInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      return sum;
     
  }  
    
    
    
     public int  gettotasum4(){
      DBConnection myconnection =new DBConnection();
      String sql="SELECT SUM(good) FROM production_4 WHERE sid=4";
      int sum=0;
      PreparedStatement st;
        try {
            st = (PreparedStatement) myconnection.getConnection().prepareStatement(sql);
             
          ResultSet rs = st.executeQuery();
           while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(getInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      return sum;
     
  }  
    
    
    public int  gettotasumcount4(){
      DBConnection myconnection =new DBConnection();
      String sql="SELECT COUNT(good) FROM production_4 WHERE sid=4";
      int sum=0;
      PreparedStatement st;
        try {
            st = (PreparedStatement) myconnection.getConnection().prepareStatement(sql);
             
          ResultSet rs = st.executeQuery();
           while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(getInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      return sum;
     
  } 
    
    
    
    
    
    ////////////////////////////////////////////////////
    public int  gettotasumbad(){
      DBConnection myconnection =new DBConnection();
      String sql="SELECT SUM(bad) FROM production WHERE sid=1";
      int sum=0;
      PreparedStatement st;
        try {
            st = (PreparedStatement) myconnection.getConnection().prepareStatement(sql);
             
          ResultSet rs = st.executeQuery();
           while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(getInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      return sum;
     
  }  
    
    
    
    public int  gettotasumbad2(){
      DBConnection myconnection =new DBConnection();
      String sql="SELECT SUM(bad) FROM production_2 WHERE sid=2";
      int sum=0;
      PreparedStatement st;
        try {
            st = (PreparedStatement) myconnection.getConnection().prepareStatement(sql);
             
          ResultSet rs = st.executeQuery();
           while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(getInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      return sum;
     
  }  
    
    
    
    public int  gettotasumbad3(){
      DBConnection myconnection =new DBConnection();
      String sql="SELECT SUM(bad) FROM production_3 WHERE sid=3";
      int sum=0;
      PreparedStatement st;
        try {
            st = (PreparedStatement) myconnection.getConnection().prepareStatement(sql);
             
          ResultSet rs = st.executeQuery();
           while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(getInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      return sum;
     
  }  
    
     public int  gettotasumbad4(){
      DBConnection myconnection =new DBConnection();
      String sql="SELECT SUM(bad) FROM production_4 WHERE sid=4";
      int sum=0;
      PreparedStatement st;
        try {
            st = (PreparedStatement) myconnection.getConnection().prepareStatement(sql);
             
          ResultSet rs = st.executeQuery();
           while (rs.next()) {
                sum = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(getInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
      return sum;
     
  }  
}
