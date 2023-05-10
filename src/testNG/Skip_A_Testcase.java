package testNG;

import org.testng.annotations.Test;

public class Skip_A_Testcase {
	@Test(priority=0)
	public void startTheCar() {
		System.out.println("Car is getting satarted...");
	}
	
	@Test(priority=1)
	public void putSecondGear() {
		System.out.println("Put Second Gear...");
	}
	
	@Test(priority=2)
	public void putThirdGear() {
		System.out.println("Put Third Gear...");
	}
	
	@Test(priority=3,enabled=false)
	public void putFourthGear() {
		System.out.println("Put Fourth Gear...");
	}
	
	@Test(priority=4)
	public void putBreak() {
		System.out.println("Stop the Car...");
	}
}
