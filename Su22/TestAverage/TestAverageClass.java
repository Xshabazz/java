//Date: 8/13/2022
//Author: 8/13/2022
public class TestAverageClass {
    private double testOne,
                    testTwo,
                    testThree;
    private String exclaim = "c";
    public Classy(double testOne, double testTwo, double testThree)
    {
        this.testOne = testOne ;
        this.testTwo = testTwo ;
        this.testThree = testThree ;
    }
    public double getTestOne()
    {
        return testOne;
    }
    public double getTestTwo()
    {
        return testTwo;
    }
    public double getTestThree()
    {
        return testThree;
    }
    public double getAverage()
    {
        return (testOne+testTwo+testThree)/3.0;
    }
    public char getGrade()
    {
        double average = (testOne+testTwo+testThree)/3.0;
        if(average>90)
        {
            return 'A';
        }
        else if(average>80)
        {
            return 'B'; 
        }
        else if(average>70)
        {
            return 'C'; 
        }
        else if(average>60)
        {
            return 'D'; 
        }
        else if(average<60)
        {
            return 'F'; 
        }
        else
        {
            return 'F';
        }
    }

} 