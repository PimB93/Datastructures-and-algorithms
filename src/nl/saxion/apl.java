package nl.saxion;
import java.util.Random;


/**
 * 
 * @author Pim Beuwer en Ralph de Groot
 * Deze class runned de Opdracht 1 class
 */
public class apl 
{
   
	private static Algoritme1 alg1;
	private static Algoritme2 alg2;
	private static Algoritme3 alg3;

	public static void main(String args[])
	{
	    measureAlg1();
	    measureAlg2();
	    measureAlg3();
	}
	/**
	 * Meet algoritme 1 met de meegegeven N waarden
	 */
	public static void measureAlg1()
	{
		   alg1 = new Algoritme1();
	       for(int i =0; i<10; i++)
	       {
	        System.out.println("Running time algorithm 1 time" +" run: "+i +", N = 5000: " +  alg1.measureRunningTimeAlg1(5000));
	        System.out.println("algoritme1 lijst printen");
	        //opdracht1Obj.alg1.printArray(opdracht1Obj.alg1.getLijst());
	        System.out.println("Running time algorithm 1, N = 10000: "+" run: "+i +", N = 5000: " +  alg1.measureRunningTimeAlg1(100000));
	        System.out.println("Running time algorithm 1, N = 20000: "+" run: "+i +", N = 5000: " +  alg1.measureRunningTimeAlg1(20000));
	        System.out.println("Running time algorithm 1, N = 50000: "+" run: "+i +", N = 5000: " +  alg1.measureRunningTimeAlg1(50000));
	        System.out.println("Running time algorithm 1, N = 100000: "+" run: "+i +", N = 5000: " +  alg1.measureRunningTimeAlg1(100000));
	       }
	}
	/**
	 * Meet algoritme 2 met de meegegeven N waarden
	 */
	public static void measureAlg2()
	{
		    alg2 = new Algoritme2();
			System.out.println("Running time algorithm 2, N = 100.000: " +  alg2.measureRunningTimeAlg2(100000));
	        System.out.println("Running time algorithm 2, N = 500.000: " +  alg2.measureRunningTimeAlg2(500000));
	        System.out.println("Running time algorithm 2, N = 1.000.000: " +  alg2.measureRunningTimeAlg2(1000000));
	        System.out.println("Running time algorithm 2, N = 5.000.000: " +  alg2.measureRunningTimeAlg2(5000000));
	        System.out.println("Running time algorithm 2, N = 10.000.000: " +  alg2.measureRunningTimeAlg2(10000000));
	}
	/**
	 * Meet algoritme 3 met de meegegeven N waarden
	 */
	public static void measureAlg3()
	{
		alg3 = new Algoritme3();
		System.out.println("Running time algorithm 3, N = 5.000.000: " +   alg3.measureRunningTimeAlg3(100000));
        System.out.println("Running time algorithm 3, N = 10.000.000: " +  alg3.measureRunningTimeAlg3(500000));
        System.out.println("Running time algorithm 3, N = 1.000.000: " +   alg3.measureRunningTimeAlg3(1000000));
        System.out.println("Running time algorithm 3, N = 20.000.000: " +  alg3.measureRunningTimeAlg3(5000000));
        System.out.println("Running time algorithm 3, N = 40.000.000: " +  alg3.measureRunningTimeAlg3(10000000));
        System.out.println("Running time algorithm 3, N = 80.000.000: " +  alg3.measureRunningTimeAlg3(10000000));
	}
	
	
}
