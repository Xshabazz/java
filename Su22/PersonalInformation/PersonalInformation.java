public class PersonalInformation {
    String name,
            address;
    byte age;
    long number = 0L;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setAge(byte age)
    {
        this.age = age;
    }
    public void setNumber(long number)
    {
        this.number = number;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public byte getAge()
    {
        return age;
    }
    public long getNumber()
    {
        return number;
    }
    
}