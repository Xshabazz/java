public class CellPhone {
    private String manufact; //to hold manufacturer string
    private String model; //hold model name string
    private double retailPrice; //hold retail price double 
//constructor will accept three arguements for the manufacturer name, model name, retail price 
    public CellPhone(String man, String mod, double price)
    {
        manufact = man;
        model = mod;
        retailPrice = price;
    }
//setManufact accepts a string and stores it in manufact field 
    public void setManufact(String man)
    {
        manufact = man;
    }
//setModel accepts a string and stores it in the model field
    public void setModel(String mod)
    {
        model = mod;
    }
//setPrice accepts a double and stores it in the retailPrice field
    public void setPrice(double price)
    {
        retailPrice = price;
    }
//getManufact returns the value stored in the manufact field 
    public String getManufact()
    {
        return manufact;
    }
//getModel returns model string
    public String getModel()
    {
        return model;
    }
//getPrice returns a double 
    public double getPrice()
    {
        return retailPrice;
    }

}