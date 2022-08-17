//Date: 8/16/2022
//Author: Darien Shabazz
public class FatGramClass {
    private double calories,
                    grams;
    public FatGramClass(double cal, double grams)
    {
        calories = cal;
        this.grams = grams;
    }
    public double getFatCal(){
        double fatCal = grams * 9;
        fatCal = fatCal / calories;
        return fatCal;
    }
} 