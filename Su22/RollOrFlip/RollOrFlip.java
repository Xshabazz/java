public class RollOrFlip {
    private boolean flip;
    private int roll;
    private String head = "Heads",
    tail = "tails";

    public void flip(boolean flip) {
        this.flip = flip;
        
    }
    public String getCF(){
        if(flip==true){return head;}else{return tail;}
    }
    public void roll(int roll){
        this.roll = roll;

    }
    public int getRoll(){
        return roll;
    }
} 