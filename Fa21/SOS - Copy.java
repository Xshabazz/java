public class SOS
{
	pivate int distance;

	public SOS(int distance)
	{
		distance = 0.0;
	}

	public void setDistance(int distance)
	{
		distance = 0.0;
	}
	public int getSpeedInAir()
	{
		return distance / 1100;
	}
	public int getSpeedInWater()
	{
		return distance / 4900;
	}
	public int getSpeedInSteel()
	{
		return distance / 16400;
	}
}