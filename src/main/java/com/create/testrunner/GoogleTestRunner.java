package com.create.testrunner;

import com.create.threadclasses.GoogleFeatureThread;

public class GoogleTestRunner {
	
	public static void main(String args[]) {
		
//		Thread t1 = new GoogleFeatureThread("chrome thread", "chrome");
//		Thread t2 = new GoogleFeatureThread("firefox thread" , "firefox");
//		
//		System.out.println("Thread starts here................");
//		t1.start();
//		t2.start();
//		
		int chromeCount = Integer.parseInt(System.getProperty("chrome"));
		int firefoxCount = Integer.parseInt(System.getProperty("firefox"));
		
		System.out.println("Chrome count: "+chromeCount+" and Firefox count: "+firefoxCount);
		
		for(int i =0, j=0; i<chromeCount || j< firefoxCount ; i++, j++) {
			
			System.out.println("**************Thread starts***********************");
			
			 new GoogleFeatureThread("chrome thread", "chrome").start();
			 new GoogleFeatureThread("firefox thread" , "firefox").start();
			 
			 System.out.println("*****************Thread Ends*****************");
					
		}
		
		
	}

}
