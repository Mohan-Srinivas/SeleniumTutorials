package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCase 
{
	@Test(priority=0)
	public void startTheCar()
	{
		System.out.println("Start the car");
	}
	@Test(priority = 5,enabled = false)
	public void turnOnMusic()
	{
		System.out.println("Turn on the music");
	}
	@Test(priority=1)
	public void putFirstGear()
	{
		//System.out.println("First Gear");
		throw new SkipException("Skipping / Ignoring - Script not Ready for Execution ");
	}
	@Test(priority=2)
	public void putSecondGear()
	{
		System.out.println("Second Gear");
	}
	@Test(priority=3)
	public void putThirdGear()
	{
		System.out.println("Third Gear");
	}
	@Test(priority=4)
	public void putFourthGear()
	{
		System.out.println("Fourth Gear");
	}

}
