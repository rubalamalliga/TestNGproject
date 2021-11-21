package com.Testngworking;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Enabled_testng {
	


	@Test(enabled = true)		
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
		
	


