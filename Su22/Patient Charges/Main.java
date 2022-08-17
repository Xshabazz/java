//Date: 8/14/2022
//Author: Darien Shabazz
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {

    public static void main(String[] args)  {
        double one, two, three; // test scores 
        //formatting 
        String divBar = "--------------------------------------------------------------------------------",
                patientInfo = "Patient Information:",
                fNameFormat = "First Name:",
                mNameFormat = "Mid. Name:",
                lNameFormat = "Last Name:",
                phoneNumberFormat = "Cell Number:",
                zipFormat = "ZIP Code:",
                addressFormat = "Address:",
                cityFormat = "City:",
                stateFormat = "State:",
                emergencyNameFormat = "Emergency Contact:",
                emergencyNumberFormat = "Emergency No:";
        //patient information 
        String      fName = "Darien",
                    mName = "Robert",
                    lName = "Shabazz",
                    address = "114 N 2nd St",
                    city = "Groton",
                    state = "South Dakota",
                    emergencyName = "Cheri";
        int zip = 57445;
        long phoneNumber = 16052160640L,
                emergencyNumber = 16052165326L;
        
        Scanner keyboard = new Scanner(System.in);
        Random ex = new Random();

        PatientClass exOne = new PatientClass(fName, mName, lName, address, city,
                                    state, emergencyName, zip, phoneNumber, emergencyNumber);
        
//create three instances of the procedure class with sample data

//first instance
        String procedureName = "Physical Exam",
                date = "Today's Date",
                practitionerName = "Dr. Irvine";
        double charges = 250.0;
        ProcedureClass exTwo = new ProcedureClass(procedureName, date, practitionerName, charges);    

//second instance 
        procedureName = "X-ray";
                date = "Today's Date";
                practitionerName = "Dr. Jamison";
        charges = 500.0;
        ProcedureClass exThree = new ProcedureClass(procedureName, date, practitionerName, charges);    


//third instance
        procedureName = "Blood Test";
                date = "Today's Date";
                practitionerName = "Dr. Smith";
        charges = 200.0;
        ProcedureClass exFour = new ProcedureClass(procedureName, date, practitionerName, charges);    
//get total 
        double total = (exTwo.getCharges()+exThree.getCharges()+exFour.getCharges());
//display 
        //patient information format
        System.out.printf("%s\n%48s\n%s\n|%-15s%-15s%-15s%-20s%-15s|\n%s\n",divBar,patientInfo,divBar,fNameFormat,mNameFormat,
        lNameFormat, phoneNumberFormat, zipFormat,divBar);
        //patient information
        System.out.printf("|%-15s%-15s%-15s%-20s%-15s|\n",exOne.getFirstName(),exOne.getMiddleName(),exOne.getLastName()
                        ,exOne.getPhoneNumber(),exOne.getZip());
        //more patient information format
        System.out.printf("%s\n|%-15s%-15s%-15s%-20s%-15s|\n%s\n",divBar,addressFormat,cityFormat,
        stateFormat, emergencyNameFormat, emergencyNumberFormat,divBar);
        //patient information
        System.out.printf("|%-15s%-15s%-15s%-20s%-15s|\n%s\n",exOne.getAddress(),exOne.getCity(),exOne.getState()
                        ,exOne.getEmergencyName(),exOne.getEmergencyNumber(),divBar);
//procedure 1 information
        System.out.println("Procedure #1:  "+exTwo.getProcedureName());
        System.out.println("Date:  "+exTwo.getDate());
        System.out.println("Practitioner:  "+exTwo.getPractitionerName());
        System.out.println("Charges:  "+exTwo.getCharges());
        System.out.printf("%s\n",divBar);
        //procedure 2
        System.out.println("Procedure #2:  "+exThree.getProcedureName());
        System.out.println("Date:  "+exThree.getDate());
        System.out.println("Practitioner:  "+exThree.getPractitionerName());
        System.out.println("Charges:  "+exThree.getCharges());
        System.out.printf("%s\n",divBar);
        //procedure 3 
        System.out.println("Procedure #3:  "+exFour.getProcedureName());
        System.out.println("Date:  "+exFour.getDate());
        System.out.println("Practitioner:  "+exFour.getPractitionerName());
        System.out.println("Charges:  "+exFour.getCharges());
        System.out.println(divBar);
        System.out.printf("%s\nTotal: $%,.2f\n%s",divBar,total,divBar);
    }
}