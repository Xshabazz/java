//Date: 8/18/2022
//Author: Darien Shabazz
public class FreezeBoil {
    private double temperature;

    public FreezeBoil(){
        temperature = 0.0;
    }

    public FreezeBoil(double temp){
        temperature = temp;
    }

    public void setTemp(double temp){
        temperature = temp;
    }
    public double getTemp(){
        return temperature;
    }

    public boolean isEthylFreezing(){
        if(temperature<=-173){
            return true;
        }    
        else return false;
    }
    public boolean isEthylBoiling(){
        if(temperature>=172){
            return true;
        }        
        else return false;
    }
    public boolean isOxygenFreezing(){
        if(temperature<=-362){
            return true;
        }        
        else return false;
    }
    public boolean isOxygenBoiling(){
        if(temperature>=-306){
            return true;
        }        
        else return false;
    }
    public boolean isWaterFreezing(){
        if(temperature<=32){
            return true;
        }        
        else return false;
    }
    public boolean isWaterBoiling(){
        if(temperature>=212){
            return true;
        }        
        else return false;
    }


} 