import java.sql.Connection;
import java.sql.DriverManager;

public class connection_provider 
{
    static Connection con;
    public static Connection createC()
    {
        try
        {
            //Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/employeee_db";
            String username = "root";
            String password = "iMshray@64";

            con = DriverManager.getConnection(url, username, password);

            if(con.isClosed())
            {
                System.out.println("Connection is still closed");
            }
            else
            {
                System.out.println("Connection is created.......");
            }


        }catch(Exception e)
        {
            e.printStackTrace();
        }

        return con;
    }    
}
