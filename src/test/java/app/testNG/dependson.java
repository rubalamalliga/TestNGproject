package app.testNG;

import org.testng.annotations.Test;

public class dependson {

	@Test(enabled = false)		
	public void highschool() {
		System.out.println("10th");
	}
@Test(dependsOnMethods ="highschool")
		public void highersec() {
			System.out.println("12th");
			
			
			}

@Test(dependsOnMethods = "highersec")	
		public void eng() {
			System.out.println("degree");
		}
		
		
		
	}

