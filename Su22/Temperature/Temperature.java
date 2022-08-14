public class Temperature {
    private double ftemp;
    //constructor sets accepts double as ftemp 
        public Temperature(double temperature) {
                ftemp = temperature;
        }

    public void setTemperature(double temperature) {
        ftemp = temperature;
    }
    public double getFahrenheit() {
        return ftemp;
    }
    public double getCelsius() {
        return (5.0/9)*(ftemp-32);
    }
    public double getKelvin(){
        return ((5.0/9)*(ftemp-32))+273;
    }
} 