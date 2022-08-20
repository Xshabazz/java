public class SpeedSound
{
	private double distance;

	public SpeedSound()
	{
		distance = 0.0;
	}
	public SpeedSound(double standard)
	{
		distance = standard;
	}

	public void setDistance(double distance)
	{
		distance = standard;
	}
	public double getSpeedInAir()
	{
		return distance / 1100;
	}
	public double getSpeedInWater()
	{
		return distance / 4900;
	}
	public double getSpeedInSteel()
	{
		return distance / 16400;
	}
}