import java.util.Random;


/**
 * 
 * @author Pim Beuwer en Ralph de Groot
 * Deze class runned de Opdracht 1 class
 */
public class apl 
{
   private static Opdracht1 opdracht1Obj = new Opdracht1();
  
	public static void main(String args[])
	{
		
		//measureAlg1();
		//measureAlg2();
		//measureAlg3();

	}
	/**
	 * Meet algoritme 1 met de meegegeven N waarden
	 */
	public static void measureAlg1()
	{
	    
			long runningTimeAlg15000 = opdracht1Obj.measureRunningTimeAlg1(5000);
			System.out.println("Running time algorithm 1, N = 5000: " + runningTimeAlg15000);
			
			long runningTimeAlg110000 = opdracht1Obj.measureRunningTimeAlg1(10000);
			System.out.println("Running time algorithm 1, N = 100000: " + runningTimeAlg110000);
		
			long runningTimeAlg120000 = opdracht1Obj.measureRunningTimeAlg1(20000);
			System.out.println("Running time algorithm 1, N = 20000: " + runningTimeAlg120000);
		
			long runningTimeAlg150000 = opdracht1Obj.measureRunningTimeAlg1(50000);
			System.out.println("Running time algorithm 1, N = 50000: " + runningTimeAlg150000);
			
			long runningTimeAlg1100000 = opdracht1Obj.measureRunningTimeAlg1(100000);
			System.out.println("Running time algorithm 1, N = 100000: " + runningTimeAlg1100000);
		    System.out.println("done");	
	    
	}
	/**
	 * Meet algoritme 2 met de meegegeven N waarden
	 */
	public static void measureAlg2()
	{
		long runningTimeAlg2100000 = opdracht1Obj.measureRunningTimeAlg2(100000);
		System.out.println("Running time algorithm 2, N = 100000: " + runningTimeAlg2100000);
		
		long runningTimeAlg2500000 = opdracht1Obj.measureRunningTimeAlg2(500000);
		System.out.println("Running time algorithm 2, N = 500000: " + runningTimeAlg2500000);
		
		long runningTimeAlg21000000 = opdracht1Obj.measureRunningTimeAlg2(1000000);
		System.out.println("Running time algorithm 2, N = 1000000: " + runningTimeAlg21000000);
		
		long runningTimeAlg25000000 = opdracht1Obj.measureRunningTimeAlg2(5000000);
		System.out.println("Running time algorithm 2, N = 5000000: " + runningTimeAlg25000000);
		
		long runningTimeAlg210000000 = opdracht1Obj.measureRunningTimeAlg2(10000000);
		System.out.println("Running time algorithm 2, N = 10000000: " + runningTimeAlg210000000);
	}
	/**
	 * Meet algoritme 3 met de meegegeven N waarden
	 */
	public static void measureAlg3()
	{
		long runningTimeAlg35000000 = opdracht1Obj.measureRunningTimeAlg3(5000000);
		System.out.println("Running time algorithm 3, N = 5000000: " + runningTimeAlg35000000);
		
		
		long runningTimeAlg310000000 = opdracht1Obj.measureRunningTimeAlg3(10000000);
		System.out.println("Running time algorithm 3, N = 10000000: " + runningTimeAlg310000000);
		
		long runningTimeAlg320000000 = opdracht1Obj.measureRunningTimeAlg3(20000000);
		System.out.println("Running time algorithm 3, N = 20000000: " + runningTimeAlg320000000);
		
		long runningTimeAlg340000000 = opdracht1Obj.measureRunningTimeAlg3(40000000);
		System.out.println("Running time algorithm 3, N = 40000000: " + runningTimeAlg340000000);
		
		long runningTimeAlg380000000 = opdracht1Obj.measureRunningTimeAlg3(80000000);
		System.out.println("Running time algorithm 3, N = 80000000: " + runningTimeAlg380000000);
	}
	
	
}
