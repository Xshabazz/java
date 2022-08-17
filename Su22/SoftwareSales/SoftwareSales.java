//Date: 8/14/2022
//Author: Darien Shabazz
public class SoftwareSales {
    private int sales;
    final double price = 99.0;
    public SoftwareSales(int quantity){
        sales = quantity;
    }
    public double getPrice()
    {
        double discount = 0.0;
        if(sales>10&&sales<19)
        {
            discount = .2;
        }
        else if(sales>19&&sales<49)
        {
            discount = .3;
        }
        else if(sales>49&&sales<99)
        {
            discount = .4;
        }
        else if(sales>99)
        {
            discount = .5;
        }
        return (price*sales)-(sales*price*discount);
    }
    public int getSales()
    {
        return sales;
    }

} 