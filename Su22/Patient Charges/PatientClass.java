//Date: 8/14/2022
//Author: Darien Shabazz
public class PatientClass {
    private String fName,
                    mName,
                    lName,
                    address,
                    city,
                    state,
                    emergencyName;
    private int zip;
    private long phoneNumber,
                    emergencyNumber;
    public PatientClass(String firstName, String middleName, String lastName,
                        String addy, String city, String state, String emergencyName,
                        int zip, long phoneNumber, long emergencyNumber)
    {
        fName = firstName;
        mName = middleName;
        lName = lastName;
        address = addy;
        this.city = city;
        this.state = state;
        this.emergencyName = emergencyName;
        this.zip=zip;
        this.phoneNumber = phoneNumber;
        this.emergencyNumber = emergencyNumber;
    }
//setters 
    public void setFirstName(String firstName){
        fName = firstName;
    }
    public void setMiddleName(String middleName){
        mName = middleName;
    }
    public void setLastName(String lastName){
        lName = lastName;
    }
    public void setAddress(String addy){
        address = addy;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String State){
        this.state = state;
    }
    public void setEmergencyName(String emergencyName){
        this.emergencyName = emergencyName;
    }
    public void setZip(int zip){
        this.zip = zip;
    }
    public void setEmergencyNumber(long emergencyNumber){
        this.emergencyNumber = emergencyNumber;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
//getters 
    public String getFirstName(){
        return fName;
    }
    public String getMiddleName(){
        return mName;
    }
    public String getLastName(){
        return lName;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getEmergencyName(){
        return emergencyName;
    }
    public int getZip(){
        return zip;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public long getEmergencyNumber(){
        return emergencyNumber;
    }
} 