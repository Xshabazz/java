//Date: 8/x/2022
//Author: Darien Shabazz
public class ProcedureClass {
    private String procedureName, 
                    date, 
                    practitionerName;
    private double charges;
    ProcedureClass(String n, String d, String p, double c){
        procedureName = n;
        date =d;
        practitionerName = p;
        charges = c;
    }
    public void setProcedureName(String n){
        procedureName =n;
    }
    public void setDate(String d){
        date = d;
    }
    public void setPractitionerName(String p){
        practitionerName = p;
    }
    public void setCharges(double c){
        charges = c;
    }
    public String getProcedureName(){
        return procedureName;
    }
    public String getDate(){
        return date;
    }
    public String getPractitionerName(){
        return practitionerName;
    }
    public double getCharges(){
        return charges;
    }

} 