
package swel_taw;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.concurrent.TimeUnit;
//import static java.sql.JDBCType.NULL;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
public class database {
    Connection connect;
    Statement st;
    ResultSet rs;
    String query;
   // String query2;
    int mem_status;
    int book_status;
    boolean result;
    String re;
    //PreparedStatement ps;
    database() throws ClassNotFoundException, SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            connect=DriverManager.getConnection("jdbc:mysql://localhost/swel taw library", "root", "");
            System.out.println("Connection Established");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    int memberid(int tmem_status,String tname,String tfname,String tnrc,String tpa,String tea, int tpn)throws SQLException {
        st=connect.createStatement();
 query = "insert into member values (NULL,"+tmem_status+",'"+tname+"'"+","+"'"+tfname+"'"+","+"'"+tnrc+"'"+","+"'"+tpa+"'"+","+"'"+tea+"',"+tpn+");";               
        st.executeUpdate(query);
        query= "select * from member where nrc='"+tnrc+"';";
        rs=st.executeQuery(query);
        rs.next();
        return rs.getInt(1);
}
    
  boolean borrow(int tmid,int tbid,String d1)throws SQLException{
       

        st=connect.createStatement();
        
        query= "select * from member where mid="+tmid+";";
       rs= st.executeQuery(query);
        rs.next();
        mem_status=rs.getInt(2);
        
        query="select * from book where bid="+tbid+";";
        rs=st.executeQuery(query);
        rs.next();
        book_status=rs.getInt(2);
        
        if(mem_status==0 && book_status==0){
         query="insert into borrow values(NULL,"+tmid+","+tbid+",'"+d1+"');";
        st.executeUpdate(query);
        query="update book set book_status=1 where bid="+tbid+";";
        st.executeUpdate(query);
        result=true;
        }
        
        else
        {
           result=false;
        }
       return result;
    }
    
   boolean book_add(int tbstatus,String tbname,String tbauthor,int tbtype)throws SQLException{
        st=connect.createStatement();
        query="insert into book values(NULL,"+tbstatus+",'"+tbname+"','"+tbauthor+"',"+tbtype+");";
        st.executeUpdate(query);
        return true;
    }
   
   boolean remove_book(int tbid)throws SQLException{
       st=connect.createStatement();
       query="delete from book where bid="+tbid+";";
       st.executeUpdate(query);
       result=true;
       return result;
   }
   
   /*int popular() throws SQLException{
    st=connect.createStatement();
    query="select bid,count(borrow_id) from borrow group by bid having count(borrow_id)=(select max(count(borrow_id)) from borrow group by bid);";
   // st.executeQuery(query);
    //query2="select max("+query+");";
   rs=st.executeQuery(query);
    rs.next();
    return rs.getInt(1);   
}*/
   String memlist() throws SQLException{
       st=connect.createStatement();
       re=" ";
       String query="select * from member;";
       rs=st.executeQuery(query);
        ResultSetMetaData rsmd=rs.getMetaData();
        int numFields=rsmd.getColumnCount();
         for(int i=1;i<=numFields;i++){
             if(i==6 || i==8){
                re+="\t\t"+rsmd.getColumnName(i)+"\t";
                //Formatter fmt=new Formatter();
               // fmt.format("%-100s\t",re);
                //System.out.print(fmt);
              //  re+=fmt;
             }
             else{
                 re+="\t"+rsmd.getColumnName(i)+"\t";
             }
            }   re+="\n";
            re+="\n";
        while(rs.next())
        {
           
            for(int i=1;i<=numFields;i++){
                int colType=rsmd.getColumnType(i);
                switch(colType){
                    case Types.INTEGER:
                        re+="\t"+rs.getInt(i)+"\t";
                        break;
                    default:
                        re+="\t"+rs.getString(i)+"\t";
                }
               // Formatter fmt=new Formatter();
               // fmt.format("%-100s\t",re);
                //System.out.print(fmt);
              //  re+=fmt;
            } re+="\n";
        }
        return re;
   }
   
   String book_info() throws SQLException{
       st=connect.createStatement();
       re=" ";
       String query="select * from book;";
       rs=st.executeQuery(query);
        ResultSetMetaData rsmd=rs.getMetaData();
        int numFields=rsmd.getColumnCount();
         for(int i=1;i<=numFields;i++){
             if(i==6 || i==7){
                 re+="\t"+rsmd.getColumnName(i)+"\t\t";
             }
             else{
                 re+="\t"+rsmd.getColumnName(i)+"\t";
             }
            }   re+="\n";
            re+="\n";
        while(rs.next())
        {
           
            for(int i=1;i<=numFields;i++){
                int colType=rsmd.getColumnType(i);
                switch(colType){
                    case Types.INTEGER:
                        re+="\t"+rs.getInt(i)+"\t";
                        break;
                    default:
                        re+="\t"+rs.getString(i)+"\t";
                }
            } re+="\n";
        }
        return re;
   }
   String cBlackList(String date2) throws SQLException, ParseException{
       SimpleDateFormat fd2=new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
       java.util.Date d2=fd2.parse(date2);
       st=connect.createStatement();
       re="";
       int ttmid;
       String ans=" ";
       String query="select * from borrow;";
       rs=st.executeQuery(query);
        ResultSetMetaData rsmd=rs.getMetaData();
        int numFields=rsmd.getColumnCount();
        while(rs.next()){
            for(int i=1;i<=numFields;i++){
               if(i==numFields){
                   re=rs.getString(i);
                   SimpleDateFormat fd1=new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
                   java.util.Date d1=fd1.parse(re);
                   long duration=d2.getTime()-d1.getTime();
                   long ss = TimeUnit.MILLISECONDS.toSeconds(duration);
                   long mm = TimeUnit.MILLISECONDS.toMinutes(duration);
                   long hh = TimeUnit.MILLISECONDS.toHours(duration);
                   if(ss>1){
                       ttmid=rs.getInt(2);
                       st=connect.createStatement();
                       query="update member set mem_status=1 where mid="+ttmid+";";
                       st.executeUpdate(query);
                       ans+="\n"+ttmid+"\n";
                   }
               }
        }
        }
        return ans;
   }
   boolean return_book(int tbid) throws SQLException{
    st=connect.createStatement();
    query="update book set book_status=0 where bid="+tbid+";";
    st.executeUpdate(query);
    return true;
}
      void setConnectionClose() throws SQLException {
            connect.close();
        }
    private static class ResultSetMedata {

        public ResultSetMedata() {
        }
    }

   
  
}
