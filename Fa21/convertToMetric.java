public class convertToMetric
	{
		private double standard;

	public convertToMetric()
	{
		standard = 0.0;
	}
	public convertToMetric(double length)
	{
		standard = length;
	}

	public void setStandard(double length)
	{
		standard = length;
	}


	public double getStandard()
	{
		return standard;
	}




	public double getMeters()
	{
		return standard * .3048;
	}

	public double getCentimeters()
	{
		return standard * 3048;
	}
	public double getMiles(){
		return (standard/5280);
	}
	public double getKilometers(){
		return (standard * .3048)/1000; 
	}



}