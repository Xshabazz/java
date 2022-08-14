public class Bill {
    private double tip = .18, 
    tax = .075, 
    charge, 
    total;
//set charge
    public void setCharge(double charge) {
        this.charge = charge ;
    }
//return tax 
    public double getTax() {
        return (charge*tax);
    }
//return tip
    public double getTip(){
        return charge*tip;
    }
//return charge 
    public double getCharge(){
        return charge;
    }
//compute total 
    public void sumTotal(){
        total = (charge*tip)+(charge*tax)+(charge);
    }
//return total 
    public double getTotal(){
        return total;
    }

} 