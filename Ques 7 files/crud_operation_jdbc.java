import java.util.Scanner;


public class crud_operation_jdbc {
    public static void main(String args[])
    {
        
        int ch;
        Scanner s= new Scanner(System.in);
        Scanner s1= new Scanner(System.in);
        do
        {
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Delete");
            System.out.println("5.Update");
            System.out.println("Enter your choice: ");
            ch=s.nextInt();

            switch (ch) 
            {
                case 1:
                System.out.println("Enter employee id");
                int eid = s.nextInt();

                System.out.println("Enter employee name");
                String ename = s1.nextLine();

                System.out.println("Enter employee department");
                String edep = s1.nextLine();

                Employee emp = new Employee(eid, ename, edep);

                boolean flag =emp_data.insertData(emp);
                if(flag == true)
                {
                    System.out.println("Data inserted successfully in the database");
                    System.out.println(emp);
                }
                else
                {
                    System.out.println("Something went wrong data not saved ...");
                }

                break;

                case 2:
                emp_data.display_details();
                break;
                
                case 3:
                int search_id;
                System.out.println("Enter the employee id, which details you want to see: ");
                search_id=s.nextInt();
                
                flag=false;
                flag=emp_data.search_emp(search_id);
                if(flag==true)
                {
                    System.out.println("Successfully fetch information..");
                }
                else
                System.out.println("Something went wrong...");
                break;

                case 4:
                System.out.println("Enter employee id that you want to delete: ");
                int empid= s.nextInt();
                boolean f=emp_data.deleteEmp(empid);
                if(f==true)
                {
                    System.out.println("Emp deteails deleted successfully..");
                }
                else
                System.out.println("Something went wrong ...");
                break;

                case 5:
                System.out.println("Enter the employee id which details you want to chnage");
                empid=s.nextInt();
                System.out.println("Enter updated name: ");
                String up_name = s1.nextLine();
                System.out.println("Enter updated department: ");
                String up_dept = s1.nextLine();
                f=false;

                f=emp_data.UpdateEmpDetails(empid,up_name,up_dept);
                
                if(f==true)
                {
                    System.out.println("Emp deteails Updated successfully..");
                }
                else
                System.out.println("Something went wrong ...");
                break;

            
                default:
                    System.out.println("You have enter the wrong choice...");
                    break;
            }

        }while(ch!=0);
    }
}


