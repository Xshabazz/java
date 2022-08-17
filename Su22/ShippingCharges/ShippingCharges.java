//Date: 8/14/2022
//Author: Darien Shabazz
public class ShippingCharges {
    private double weight;

    public ShippingCharges(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public double getRate(){
        if(weight<2){
            return 1.10;
        }
        else if(weight>2&&weight<=6){
            return 2.20;
        }
        else if(weight>6&&weight<=10){
            return 3.7;
        }
        else if(weight>10){
            return 4.8;
        }
        else return 0;
    }
} 