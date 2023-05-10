package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	

	@Test(groups= {"Apple"})
	public void Apple1() {
		System.out.println("Apple testing is Performed!!!");
	}

	@Test(groups= {"Apple"})
	public void Apple2() {
		System.out.println("Apple testing is Performed!!!");
	}
	
	
	@Test(groups= {"Moto"})
	public void Moto1() {
		System.out.println("Moto testing is Performed!!!");
	}
	
	@Test(groups= {"Moto"})
	public void Moto2() {
		System.out.println("Moto testing is Performed!!!");
	}
	
	@Test(groups= {"Vivo"})
	public void Vivo1() {
		System.out.println("Vivo testing is Performed!!!");
	}
	
	@Test(groups= {"Vivo"})
	public void Vivo2() {
		System.out.println("Vivo testing is Performed!!!");
	}
	
	@Test(groups= {"Lenovo"})
	public void Lenovo1() {
		System.out.println("Lenovo testing is Performed!!!");
	}
	
	@Test(groups= {"Lenovo"})
	public void Lenovo2() {
		System.out.println("Lenovo testing is Performed!!!");
	}
	
	@Test(groups= {"Max"})
	public void Max1() {
		System.out.println("Max testing is Performed!!!");
	}
	
	@Test(groups= {"Max"})
	public void Max2() {
		System.out.println("Max testing is Performed!!!");
	}
}
