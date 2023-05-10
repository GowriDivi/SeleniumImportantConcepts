package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {

	@Test(enabled=true)
	public void highSchool() {
		System.out.println("State Board with good marks...");
	}
	
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("Biology Group with Maths...");
	}
	
	@Test(dependsOnMethods="higherSecondary")
	public void college() {
		System.out.println("Completed Graduation...");
	}
	
	@Test(dependsOnMethods="college")
	public void job() {
		System.out.println("Degree Needed...");
	}
}
