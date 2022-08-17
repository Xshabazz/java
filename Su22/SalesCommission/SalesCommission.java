public class SalesCommission {
    double sales, // holds the employees monthly sales 
            rate, // holds the commission rate from method
            commission, // holds the amount returned from sales*rate
            advance, //how much the employee is taking in advance pay
            pay; // amount that the employee owes or is owed
    String err = "blank";

    public SalesCommission(double s,//pass the amount of sales the employee made
                    double a)//pass the amount the employee would like in advance
    {
        sales = s;
        advance = a;
        calculatePay();
    }
    private void setRate()
    {
        if(sales<0)
        {
            err = "Error";
        }
        else if(sales < 10000)
        {
            rate = 0.05;
        }
        else if(sales < 14999)
        {
            rate = 0.1;
        }
        else if(sales < 17999)
        {
            rate = 0.12;
        }
        else if(sales < 21999)
        {
            rate = 0.14;
        }
        else if(sales > 21999)
        {
            rate = 0.16;
        }
        else{
             err = "Error";
        }
    }
    public String getError()
    {
        return err;
    }
    private void calculatePay()
        {
            setRate();
            commission = sales * rate;
            pay = commission - advance;
        }
    public double getPay()
        {
            return pay;
        }
    public double getCommission()
        {
            return commission;
        }
    public double getRate()
        {
            return rate;
        }
    public double getAdvance()
        {
            return advance;
        }
    public double getSales()
        {
            return sales;
        }
} 