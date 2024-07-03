import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

public class emp_data 
{
    public static boolean insertData(Employee emp)
    {
        boolean f=false;
        //jdbc code to insert data
        try
        {

            Connection con = connection_provider.createC();

            String q = "Insert into emp_data(id,ename,edept) values(?,?,?)";

            PreparedStatement pstmt =con.prepareStatement(q);
            
            //set the value of paramaters

            pstmt.setInt(1, emp.getEmpId());
            pstmt.setString(2, emp.getEmpName());
            pstmt.setString(3, emp.getEmpDept());

            //execute query
            pstmt.executeUpdate();
            f=true;


        }catch(Exception e)
        {
            e.printStackTrace();
        }

        return f;
    }

    public static boolean deleteEmp(int empid) 
    {
        boolean f=false;
        //jdbc code to delete data
        try
        {

            Connection con = connection_provider.createC();

            String q = "delete from emp_data where id=?";

            PreparedStatement pstmt =con.prepareStatement(q);
            
            //set the value of paramaters

            pstmt.setInt(1, empid);

            //execute query
            pstmt.executeUpdate();
            f=true;


        }catch(Exception e)
        {
            e.printStackTrace();
        }

        return f;    
    }

    public static void display_details() 
    {
        boolean f=false;
        //jdbc code to dislay data
        try
        {

            Connection con = connection_provider.createC();

            String q = "select * from emp_data";

            java.sql.Statement stmt = con.createStatement();
            
            ResultSet set =stmt.executeQuery(q);
            
            while (set.next()) 
            {
                System.out.println("Id: "+set.getInt(1));
                System.out.println("Name: "+set.getString(2));
                System.out.println("Departemnt: "+set.getString(3));    
            }


        }catch(Exception e)
        {
            e.printStackTrace();
        } 
    }

    public static boolean search_emp(int search_id) 
    {
        boolean f=false;
        //jdbc code to dislay data
        try
        {

            Connection con = connection_provider.createC();

            String q = "select * from emp_data where id=?";

            PreparedStatement pstmt =con.prepareStatement(q);
            
            //set the value of paramaters

            pstmt.setInt(1, search_id);

            //execute query
            ResultSet result =pstmt.executeQuery();
            while (result.next()) 
            {
                 System.out.println("Id: "+result.getInt(1));
                 System.out.println("Name: "+result.getString(2));
                 System.out.println("Department: "+result.getString(3));   
                 f=true;
            }
            

        }catch(Exception e)
        {
            e.printStackTrace();
        } 

        return f;
    }

    public static boolean UpdateEmpDetails(int empid, String up_name, String up_dept) 
    {
        boolean f=false;
        //jdbc code to insert data
        try
        {

            Connection con = connection_provider.createC();

            String q = "update emp_data set ename=?,edept=? where id=?";

            PreparedStatement pstmt =con.prepareStatement(q);
            
            //set the value of paramaters

            pstmt.setString(1, up_name);
            pstmt.setString(2, up_dept);
            pstmt.setInt(3, empid);

            //execute query
            pstmt.executeUpdate();
            f=true;


        }catch(Exception e)
        {
            e.printStackTrace();
        }

        return f;
    }    
}
