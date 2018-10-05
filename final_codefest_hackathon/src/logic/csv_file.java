package logic;

import db.DBConnection;
import interfaces.viewdatabse;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class csv_file {
    
    public void deletetabledata(String tablename){
        DBConnection con = new DBConnection();
        String sql = "DELETE FROM " + tablename;
        try {
            PreparedStatement st = con.getConnection().prepareStatement(sql);
            int rs = st.executeUpdate();
         
            
        } catch (SQLException ex) {
            Logger.getLogger(viewdatabse.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean save(String filepath) {
        
          String path = filepath;
          
          DBConnection conn = new DBConnection();
          Connection con = conn.getConnection();
          
          

          FileWriter fw ;
          try{
            Statement st = con.createStatement();

            //this query gets all the tables in your database(put your db name in the query)
            ResultSet res = st.executeQuery("SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = 'codefestfinal' ");

            //Preparing List of table Names
            List <String> tableNameList = new ArrayList<String>();
            while(res.next())
            {
                tableNameList.add(res.getString(1));
            }

            //path to the folder where you will save your csv files
            String filename = path+"\\";

            //star iterating on each table to fetch its data and save in a .csv file
            for(String tableName:tableNameList)
            {
                int k=0;

                int j=1;

             //   System.out.println(tableName);

                List<String> columnsNameList  = new ArrayList<String>();

                //select all data from table
                
                res = st.executeQuery("select * from "+tableName);
                //deletetabledata(tableName);
                

                //colunm count is necessay as the tables are dynamic and we need to figure out the numbers of columns
                int colunmCount = getColumnCount(res);

                try {
                   fw = new FileWriter(filename+""+tableName+".csv");


                   //this loop is used to add column names at the top of file , if you do not need it just comment this loop
                   for(int i=1 ; i<= colunmCount ;i++)
                   {
                     fw.append(res.getMetaData().getColumnName(i));
                     fw.append(",");

                   }

                   fw.append(System.getProperty("line.separator"));

                   while(res.next())
                   {
                      for(int i=1;i<=colunmCount;i++)
                      {

                        //you can update it here by using the column type but i am fine with the data so just converting 
                        //everything to string first and then saving
                        if(res.getObject(i)!=null)
                        {
                           String data= res.getObject(i).toString();
                           fw.append(data) ;
                           fw.append(",");
                        }
                        else
                        {
                           String data= "null";
                           fw.append(data) ;
                           fw.append(",");
                        }

                      }
                          //new line entered after each row
                          fw.append(System.getProperty("line.separator"));
                   }

                      fw.flush();
                      fw.close();

                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            con.close();
            return true;
          }
          
          catch(SQLException ex){
          System.err.println("SQLException information");
          return false;
          }
          
 }
    
//    public boolean autosave(String filepath,int val) {
//        
//          String path = filepath;
//          
//          DBConnection conn = new DBConnection();
//          Connection con = conn.getConnection();
//          
//          
//
//          FileWriter fw ;
//          try{
//            Statement st = con.createStatement();
//
//            //this query gets all the tables in your database(put your db name in the query)
//            ResultSet res = st.executeQuery("SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = 'codefestfinal' ");
//
//            //Preparing List of table Names
//            List <String> tableNameList = new ArrayList<String>();
//            while(res.next())
//            {
//                tableNameList.add(res.getString(1));
//            }
//
//            //path to the folder where you will save your csv files
//            String filename = path+"\\";
//
//            //star iterating on each table to fetch its data and save in a .csv file
//            for(String tableName:tableNameList)
//            {
//                int k=0;
//
//                int j=1;
//
//                //System.out.println(tableName);
//
//                List<String> columnsNameList  = new ArrayList<String>();
//
//                //select all data from table
//                res = st.executeQuery("select * from "+tableName);
//                
//              
//
//                //colunm count is necessay as the tables are dynamic and we need to figure out the numbers of columns
//                int colunmCount = getColumnCount(res);
//
//                try {
//                   fw = new FileWriter(filename+""+tableName+val+".csv");
//
//
//                   //this loop is used to add column names at the top of file , if you do not need it just comment this loop
//                   for(int i=1 ; i<= colunmCount ;i++)
//                   {
//                     fw.append(res.getMetaData().getColumnName(i));
//                     fw.append(",");
//
//                   }
//
//                   fw.append(System.getProperty("line.separator"));
//
//                   while(res.next())
//                   {
//                      for(int i=1;i<=colunmCount;i++)
//                      {
//
//                        //you can update it here by using the column type but i am fine with the data so just converting 
//                        //everything to string first and then saving
//                        if(res.getObject(i)!=null)
//                        {
//                           String data= res.getObject(i).toString();
//                           fw.append(data) ;
//                           fw.append(",");
//                        }
//                        else
//                        {
//                           String data= "null";
//                           fw.append(data) ;
//                           fw.append(",");
//                        }
//
//                      }
//                          //new line entered after each row
//                          fw.append(System.getProperty("line.separator"));
//                   }
//
//                      fw.flush();
//                      fw.close();
//
//                } catch (IOException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//
//            }
//
//            con.close();
//            return true;
//          }
//          
//          catch(SQLException ex){
//          System.err.println("SQLException information");
//          return false;
//          }
//          
// }
     
    public static int  getRowCount(ResultSet res) throws SQLException
    {
          res.last();
          int numberOfRows = res.getRow();
          res.beforeFirst();
          return numberOfRows;
    }
 
     
    public static int  getColumnCount(ResultSet res) throws SQLException
    {
        return res.getMetaData().getColumnCount();
    }
}