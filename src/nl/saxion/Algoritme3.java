package nl.saxion;
import java.util.ArrayList;
import java.util.Arrays;


public class Algoritme3 
{
	private ArrayList<Integer> collectie;
	
	public Algoritme3()
	{
		collectie = new ArrayList<>();
	}
	/**
	 * 
	 * @param aantal Het ingevoerde getal waar het algoritme mee moet werken
	 */
	public void alg3(int aantal )
	{
		
		
		for(int i = 0; i < aantal; i++)
		{
			collectie.set(i, i);		
		}
		for(int i = 0; i < aantal; i++)
		{
			int randomPos = TrekGetal.randInt(aantal);
			int temp = collectie.get(i);
			collectie.set(i, collectie.get(randomPos));
			collectie.set(randomPos,temp); 	
		}
		
	}
	public long measureRunningTimeAlg3(int i)
	{
		long startTime = System.currentTimeMillis();		
		alg3(i);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		return duration;
	}
	public ArrayList<Integer> getLijst()
	{
		return this.collectie;
	}
}
