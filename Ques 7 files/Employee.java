
class Employee
{
    private int id;
	private String name;
	private String department;

    Employee(int id, String name, String department)
    {
        this.id=id;
        this.name=name;
        this.department=department;
    }

    public int getEmpId()
    {
        return id;
    }

    public String getEmpName()
    {
        return name;
    }

    public String getEmpDept()
    {
        return department;
    }

    public String toString()
    {
        return id+" "+name+" "+department;
    }
}



