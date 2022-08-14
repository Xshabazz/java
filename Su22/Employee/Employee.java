public class Employee {
    private String name, //employee name
                    department, //employee department
                    position; //employee position 
    private int employeeId; //employee id 

    //set employee name 
    public void setName(String name)
    {
        this.name = name;
    }
    //return employee name 
    public String getName()
    {
        return name;
    }
    //set employee department 
    public void setDepartment(String dep)
    {
        department = dep;
    }
    //return employee department 
    public String getDepartment()
    {
        return department;
    }

    //set employee position
    public void setPosition(String pos)
    {
        position = pos;
    }
    //get employee position 
    public String getPosition()
    {
        return position;
    }

    //set employee Id 
    public void setEmployeeId(int id)
    {
        employeeId = id;
    }
    //get employee Id 
    public int getEmployeeId()
    {
        return employeeId;
    }

}