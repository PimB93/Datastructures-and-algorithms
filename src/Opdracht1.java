import java.util.ArrayList;

import java.util.Random;


/**
 * 
 * @author Pim Beuwer en Ralph de Groot
 * In deze class is opdracht 1 van het vak Datastructuren en Algoritmiek uitgewerkt. 
 * In deze opdracht is het de bedoeling dat we met behulp van een aantal random gegenereerde getallen een array vullen volgens een algoritme.
 * Vervolgens moeten we een schatting maken van de ingenomen tijd van het algoritme waarna we die schatting moeten vergelijken met de werkelijke metingen.
 */

public class Opdracht1 
{
	
	ArrayList<Integer> collectieList;
	/**
	 * Constructor die een arraylist initialiseert.
	 */
	public Opdracht1()
	{
		collectieList = new ArrayList<Integer>();
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
	 * @param i Het ingevoerde getal waarmee het algoritme gestart wordt
	 * @return De gemeten tijd van algoritme 2
	 */
	public long measureRunningTimeAlg2(int i)
	{
		long startTime = System.currentTimeMillis();		
		alg2(i);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		return duration;
	}
	/**
	 * 
	 * @param i Het ingevoerde getal waarmee het algoritme gestart wordt
	 * @return De gemeten tijd van algoritme 3
	 */
	public long measureRunningTimeAlg3(int i)
	{
		long startTime = System.currentTimeMillis();		
		alg3(i);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		return duration;
	}
	
	/**
	 * 
	 * @param max Het ingevoerde getal die als grenst geldt bij het genereren van een random getal
	 * @return	Een random getal tussen de 0 en max -1 
	 */
	private int randInt(int max)	
	{
		Random random = new Random();
		//return min + (int)(Math.random() * (max));  // 2 statements??
		return random.nextInt(max);

	}
	
	/**
	 * 
	 * @param array De array die geprint moet worden
	 */
	private void printArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	/**
	 * 
	 * @param aantal Het ingevoerde getal waar het algoritme mee moet werken
	 */
	public void alg3(int aantal )
	{
		int[] array = new int[aantal];
		
		for(int i = 0; i < aantal; i++)
		{
			array[i] = i;		
			
						
		}
		for(int i = 0; i < aantal; i++)
		{

			int randomPos = randInt(aantal);
			int temp = array[i];
			array[i] = array[randomPos];
			array[randomPos] = temp; 

			
			
		}
		
		//printArray(array);

	}
	/**
	 * 
	 * @param aantal Het ingevoerde getal waar het algoritme mee moet werken
	 */
	public void alg2(int aantal)
	{		
		int[] array = new int[aantal];	//1 	1 statement
		boolean[] used = new boolean[array.length ]; //2 statement
		boolean done = false;	// 1 statement
		while(!done) //2 1 check + 1 statement
		{					
				for(int j = 0; j < aantal ; j++) //11  8statements and 3 check
				{		
						boolean placed = false;
						while(!placed)
						{
							int getal = randInt(aantal );
							
								if(!used[getal] )
								{
									array[j] = getal;
									used[getal] = true;
									placed = true;
								}
						}				
				}
			done = true;		//1 statement
		}
			
		//printArray(array);
		
	}
	/**
	 * 
	 * @param aantal Het ingevoerde getal waar het algoritme mee moet werken
	 */
	public void alg1(int aantal)
	{
		
		boolean done = false;  //1 statement
		
		
		while(!done)    //2  1 statement + 1 check
		{
			int getal = randInt(aantal);    // 1 statement??
			
			if(!collectieList.contains(getal)) //2  1 statement + 1 check
			{
				collectieList.add(getal);     //1  1 statement
			}
			
			if(collectieList.size() == aantal)  //2  1 statement + 1 check
			{
				done = true;               //1  1 statement
			}
		}    
			
		
	}

}
