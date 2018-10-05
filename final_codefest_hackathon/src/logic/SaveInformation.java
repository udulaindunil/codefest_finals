
package logic;

import db.DBConnection;
import java.sql.Date;



public class SaveInformation {
    public boolean SaveInformation(saveBean bean){
        boolean result = false;
        String qeury = "INSERT production (sid,eid,good,bad,date,time) VALUES(?,?,?,?,?,?)";
        DBConnection myConnection = new DBConnection();
        try {
            java.sql.PreparedStatement st  =  myConnection.getConnection().prepareStatement(qeury);
            st.setInt(1, bean.getsId());
            st.setInt(2,bean.getEid());
            st.setInt(3, bean.getG_prod());
            st.setInt(4, bean.getB_prod());
            java.sql.Date sqldate;
            sqldate = new java.sql.Date(bean.getDate().getTime());
            java.sql.Time sqltime;
            sqltime = new java.sql.Time(bean.getTime().getTime());

            st.setDate(5,sqldate);
            st.setTime(6,sqltime);
            st.execute();
            result=true;
          
        } catch (Exception ex) {
            
            result = false;
        }
        
        return result;
        
    }
    
    public boolean SaveInformation2(saveBean bean){
        boolean result = false;
        String qeury = "INSERT production_2 (sid,eid,good,bad,date,time) VALUES(?,?,?,?,?,?)";
        DBConnection myConnection = new DBConnection();
        try {
            java.sql.PreparedStatement st  =  myConnection.getConnection().prepareStatement(qeury);
            st.setInt(1, bean.getSid2());
            st.setInt(2,bean.getEid2());
            st.setInt(3, bean.getG2());
            st.setInt(4, bean.getB2());
            java.sql.Date sqldate;
            sqldate = new java.sql.Date(bean.getDate().getTime());
            java.sql.Time sqltime;
            sqltime = new java.sql.Time(bean.getTime().getTime());

            st.setDate(5,sqldate);
            st.setTime(6,sqltime);
            st.execute();
            result=true;
          
        } catch (Exception ex) {
            
            result = false;
        }
        
        return result;
        
    }
    
    
    public boolean SaveInformation3(saveBean bean){
        boolean result = false;
        String qeury = "INSERT production_3 (sid,eid,good,bad,date,time) VALUES(?,?,?,?,?,?)";
        DBConnection myConnection = new DBConnection();
        try {
            java.sql.PreparedStatement st  =  myConnection.getConnection().prepareStatement(qeury);
            st.setInt(1, bean.getSid3());
            st.setInt(2,bean.getEid3());
            st.setInt(3, bean.getG3());
            st.setInt(4, bean.getB3());
            java.sql.Date sqldate;
            sqldate = new java.sql.Date(bean.getDate().getTime());
            java.sql.Time sqltime;
            sqltime = new java.sql.Time(bean.getTime().getTime());

            st.setDate(5,sqldate);
            st.setTime(6,sqltime);
            st.execute();
            result=true;
          
        } catch (Exception ex) {
            
            result = false;
        }
        
        return result;
        
    }
    
    
    public boolean SaveInformation4(saveBean bean){
        boolean result = false;
        String qeury = "INSERT production_4 (sid,eid,good,bad,date,time) VALUES(?,?,?,?,?,?)";
        DBConnection myConnection = new DBConnection();
        try {
            java.sql.PreparedStatement st  =  myConnection.getConnection().prepareStatement(qeury);
            st.setInt(1, bean.getSid4());
            st.setInt(2,bean.getEid4());
            st.setInt(3, bean.getG4());
            st.setInt(4, bean.getB4());
            java.sql.Date sqldate;
            sqldate = new java.sql.Date(bean.getDate().getTime());
            java.sql.Time sqltime;
            sqltime = new java.sql.Time(bean.getTime().getTime());

            st.setDate(5,sqldate);
            st.setTime(6,sqltime);
            st.execute();
            result=true;
          
        } catch (Exception ex) {
            
            result = false;
        }
        
        return result;
        
    }
}
