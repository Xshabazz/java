//Date: 8/19/2022
//Author: Darien Shabazz
public class MobileServiceProvider {
    private char pack;
    private double minutes;

    public MobileServiceProvider(){
        minutes = 0.0;
    }
    public MobileServiceProvider(char choice, double minutes){
        pack = choice;
        this.minutes = minutes;
    }
    public void setPackage(char choice){
        pack = choice;
    }
    public void setMinutes(double minutes){
        this.minutes = minutes;
    }
   
  
    public double getCharges(){
       
        if(pack=='A'){
            if(minutes>450)
                return ((minutes -450 )*.45)+39.99;
            else {
                return 39.99;
            }
        }
        else if(pack=='B'){
            if(minutes>900)
                return ((minutes -900 )*.40)+59.99;
            else {
                return 59.99;
            }
        }
        else if(pack=='C'){
                return 69.99;
        }
        else return 0.0;
    }
} 