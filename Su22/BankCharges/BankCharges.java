//Date: 8/14/2022
//Author: Darien Shabazz
public class BankCharges {
    private double endBal;
    private int checks;
    public BankCharges(int checks, double bal){
        this.checks = checks;
        endBal = bal;
    }

    public double getFee(){
        double checkFee,
                balFee = 0;
        if(checks>0&&checks<20){
            checkFee = (checks*.1);
        }
        else if(checks>19&&checks<40){
            checkFee = (checks*.08);
        }
        else if(checks>39&&checks<60){
            checkFee = (checks*.06);
        }
        else if(checks>59){
            checkFee = (checks*.04);
        }
        else{
            checkFee = 0.0;
        }
        if (endBal<400)
        {
            balFee = 15;
        }
        else {balFee=0;}
        return balFee+checkFee;
    }
    public double getBal(){
        return endBal;
    }
} 