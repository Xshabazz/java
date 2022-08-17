//Date: 8/16/2022
//Author: Darien Shabazz
public class RunningRaceClass {
    private double r1sec, r2sec, r3sec, p1sec, p2sec, p3sec;
    private String r1name, r2name, r3name, p1name, p2name, p3name;

    public void setR1(double sec, String name){
        r1sec = sec;
        r1name = name;
    }
    public void setR2(double sec, String name){
        r2sec = sec;
        r2name = name;
    }
    public void setR3(double sec, String name){
        r3sec = sec;
        r3name = name;
    }
    public void setPosition(){
        if(r1sec < r2sec && r1sec < r3sec)
        {
            p1name = r1name;
            p1sec = r1sec;
            if(r2sec<r3sec){
                p2name = r2name;
                p2sec = r2sec;
                p3name = r3name;
                p3sec = r3sec;
            }
                else{
                    p3name = r2name;
                    p3sec = p2sec;
                    p2name = r3name;
                    p2sec = r2sec;
                }
            
        }
        else if(r1sec>r2sec&&r1sec>r3sec)
        {
            p3name = r1name;
            p3sec = r1sec;
            if(r2sec>r3sec){
                p2name = r2name;
                p2sec = r2sec;
                p1name = r3name;
                p1sec = r3sec;
            }
            else {
                p1name = r2name;
                p1sec = r2sec;
                p2name = r3name;
                p2sec = r3sec;

            }
        }
        else if((r1sec>r2sec&&r1sec<r3sec)||(r1sec<r2sec&&r1sec>r3sec)){
            p2name = r1name;
            p2sec = r1sec;
            if(r2sec>r3sec){
                p3sec = r2sec;
                p3name = r2name;
                p1sec = r3sec;
                p1name = r2name;
            }
            else {
                p1sec = r2sec;
                p1name = r2name;
                p3sec = r3sec;
                p3name = r3name;
            }

        }
    }
    public String getPositionOneName(){
        return p1name;
    }
    public double getPositionOneSeconds(){
        return p1sec;
    }
    public String getPositionTwoName(){
        return p2name;
    }
    public double getPositionTwoSeconds(){
        return p2sec;
    }
    public String getPositionThreeName(){
        return p3name;
    }
    public double getPositionThreeSeconds(){
        return p3sec;
    }
}

