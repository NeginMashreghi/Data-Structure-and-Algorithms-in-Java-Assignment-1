package partOne.newMethods;

import java.math.BigInteger;

import partOne.methods.Timing;
import partOne.stopWatch.Stopwatch;

/**************************************************************************************************** 
* Project:               < Rocket > 
* Assignment:            < assignment 1 - Part one > 
* Author(s):             < Andrew Elliott, Kezrick Jones, Mihir Popat, Arzu Yildiz, Negin Mashreghi  >  
* Student Number:        < 100872220, 		101022808, 		101037323, 100742996, 	100973300   > 
* Description:           < Test methods for timing the mystery methods in part 1>  
****************************************************************************************************/ 
public class TestingMethods {
	
	/**
	 * test method for Daffy(); prints timings for each iteration;
	 * @param low Minimum range
	 * @param high Maximum range
	 */
	public static void testDaffy(int low, int high){
		Stopwatch timer = new Stopwatch();
		System.out.println("\n-------------------\nDaffy\n-------------------");
		for(int n = low ; n <= high ; n++){

			timer.start();
			Timing.daffy(n) ;
			timer.stop();
			
			System.out.print(n);
			System.out.print(" -> ");
			System.out.println(timer);
		}		
	}
	/** 
	 *test method for Donald(); prints timings for each iteration;
	 * @param low Minimum range
	 * @param high Maximum range
	 */
	public static void testDonald(int low, int high){
		Stopwatch timer = new Stopwatch();
		System.out.println("\n-------------------\nDonald\n-------------------");
		for(int n = low ; n <= high ; n++){
			
			timer.start();
			Timing.donald(n) ;
			timer.stop();
			
			System.out.print(n);
			System.out.print(" -> ");
			System.out.println(timer);
		}
	}
	/** 
	 *test method for Mickey(); prints timings for each iteration;
	 * @param low Minimum range
	 * @param high Maximum range
	 */
	public static void testMickey(int low, int high){
		Stopwatch timer = new Stopwatch();
		System.out.println("\n-------------------\nMickey\n-------------------");
		for(int n = low ; n <= high ; n = n * 2 ){
			
			int[] ranArray1 = Timing.randomarr(n);
			
			timer.start();
			Timing.mickey(ranArray1) ;
			timer.stop();
			
			System.out.print(n);
			System.out.print(" -> ");
			System.out.println(timer);
		
		}
	}
	/** 
	 *test method for Minnie(); prints timings for each iteration;
	 * @param low Minimum range
	 * @param high Maximum range
	 */
	public static void testMinnie(int low, int high){
		Stopwatch timer = new Stopwatch();
		System.out.println("\n-------------------\nMinnie\n-------------------");
		for(int n = low ; n <= high ; n = n * 2 ){
			
			int[] ranArray1 = Timing.randomarr(n);
			
			timer.start();
			Timing.minnie(ranArray1) ;
			timer.stop();
			
			System.out.print(n);
			System.out.print(" -> ");
			System.out.println(timer);
		
		}
	}
	/** 
	 *test method for Goofy(); prints timings for each iteration;
	 * @param low Minimum range
	 * @param high Maximum range
	 */
	public static void testGoofy(int low, int high){
		Stopwatch timer = new Stopwatch();
		System.out.println("\n-------------------\nGoofy\n-------------------");
		for(int n = low ; n <= high ; n = n * 2 ){
			
			int[] ranArray1 = Timing.randomarr(n);
			
			timer.start();
			Timing.goofy(ranArray1) ;
			timer.stop();
			
			System.out.print(n);
			System.out.print(" -> ");
			System.out.println(timer);
		
		}
	}
	/** 
	 *test method for Pluto(); prints timings for each iteration;
	 * @param low Minimum range
	 * @param high Maximum range
	 */
	public static void testPluto(int low, int high){
		Stopwatch timer = new Stopwatch();
		System.out.println("\n-------------------\nPluto\n-------------------");
		for(int n = low ; n <= high ; n = n * 2 ){
			
			int[] ranArray1 = Timing.randomarr(n);
			
			timer.start();
			Timing.pluto(ranArray1) ;
			timer.stop();
			
			System.out.print(n);
			System.out.print(" -> ");
			System.out.println(timer);
		
		}
	}
	/** 
	 *test method for Gyro(); prints timings for each iteration;
	 * @param low Minimum range
	 * @param high Maximum range
	 */
	public static void testGyro(int low, int high){
		Stopwatch timer = new Stopwatch();
		System.out.println("\n-------------------\nGyro\n-------------------");
		for(int n = low ; n <= high ; n = n * 2 ){
			
			int[] ranArray1 = Timing.randomarr(n);
			Timing.pluto(ranArray1) ;
					
			timer.start();
			Timing.gyro(ranArray1) ;
			timer.stop();
			
			System.out.print(n);
			System.out.print(" -> ");
			System.out.println(timer);
		
		}
	}
	/** 
	 *test method for Fact(); prints timings for each iteration;
	 * @param low Minimum range
	 * @param high Maximum range
	 */
	public static void testFact(int low, int high){
		Stopwatch timer = new Stopwatch();
		System.out.println("\n-------------------\nFact\n-------------------");
		for(int n = low ; n <= high ; n = n * 2 ){
			
			BigInteger bign = BigInteger.valueOf((long) n);
			//int Intbign = bign.intValue();
						
			timer.start();
			Timing.fact(bign) ;
			timer.stop();
						
			System.out.print(n);
			System.out.print(" -> ");
			System.out.println(timer);
		
		}
	}
	
}
