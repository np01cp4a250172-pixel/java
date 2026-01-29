package week12;

public class Student
{
    // instance variables
    private String name;
    private String phone;
    private String group;

    // constructor
    public Student(String name, String group, String phone)
    {
        this.name = name;
        this.group = group;
        this.phone = phone;
    }

    // getters
    public String getName()
    {
        return name;
    }

    public String getGroup()
    {
        return group;
    }

    public String getPhone()
    {
        return phone;
    }

    // setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
}
