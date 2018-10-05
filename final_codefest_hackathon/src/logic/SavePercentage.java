/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import db.DBConnection;

/**
 *
 * @author CHAMOD LAKMAL
 */
public class SavePercentage {
    public boolean SaveInformation(int sid,int eid,float perce,float percebad){
        boolean result = false;
        String qeury = "INSERT job (eid,sid,performance,bad_performance) VALUES(?,?,?,?)";
        DBConnection myConnection = new DBConnection();
        try {
            java.sql.PreparedStatement st  =  myConnection.getConnection().prepareStatement(qeury);
            st.setInt(1, eid);
            st.setInt(2,sid);
            st.setFloat(3,perce);
            st.setFloat(4,percebad);
            
           
            st.execute();
            result=true;
          
        } catch (Exception ex) {
            
            result = false;
        }
        
        return result;
        
    }
    
}
