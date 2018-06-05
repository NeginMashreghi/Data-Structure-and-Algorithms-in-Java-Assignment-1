package partOne.driver;

import partOne.newMethods.TestingMethods;

/**************************************************************************************************** 
* Project:               < Rocket > 
* Assignment:            < assignment 1 - Part one > 
* Author(s):             < Andrew Elliott, Kezrick Jones, Mihir Popat, Arzu Yildiz, Negin Mashreghi  >  
* Student Number:        < 100872220, 		101022808, 		101037323, 100742996, 	100973300   > 
* Description:           < driver for part 1, testing the timings of mystery methods>  
****************************************************************************************************/ 
public class TestTiming {

	public static void main(String[] args) {
		
		TestingMethods.testDaffy(30,44);
		TestingMethods.testDonald(30,44);
		TestingMethods.testMickey(1000, 8192000);
		TestingMethods.testMinnie(1000, 256000);
		TestingMethods.testGoofy(1000, 256000);
		TestingMethods.testPluto(1000, 256000);
		TestingMethods.testGyro(1000, 256000);
		TestingMethods.testFact(1000, 256000);
	}
			

}
