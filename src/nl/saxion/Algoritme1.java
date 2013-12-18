package nl.saxion;
import java.util.ArrayList;


public class Algoritme1 extends ListPrint
{
    private ArrayList<Integer> collectie;
	public Algoritme1()
	{
		collectie = new ArrayList<>();
	}
	/**
	 * 
	 * @param i Het ingevoerde getal waarmee het algoritme gestart wordt
	 * @return De gemeten tijd van algoritme 1
	 */
	public long measureRunningTimeAlg1(int i)
	{
		long startTime = System.currentTimeMillis();		
		alg1(i);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		return duration;
	}
	/**
	 * 
	 * @param aantal Het ingevoerde getal waar het algoritme mee moet werken
	 */
	public void alg1(int aantal)
	{
		assert aantal >0 : "ongeldig getal";
		boolean done = false;  //1 statement
		while(!done)    //2  1 statement + 1 check
		{
			int getal = TrekGetal.randInt(aantal);    // 1 statement??
			if(!collectie.contains(getal)) //2  1 statement + 1 check
			{
				collectie.add(getal);     //1  1 statement
			}
			if(collectie.size() == aantal)  //2  1 statement + 1 check
			{
				done = true;               //1  1 statement
			}
		}    
	}
	public ArrayList<Integer> getLijst()
	{
		return this.collectie;
	}
	
}
