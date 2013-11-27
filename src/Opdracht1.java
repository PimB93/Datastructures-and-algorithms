import java.util.ArrayList;
import java.util.Arrays;
import java.util.DuplicateFormatFlagsException;
import java.util.Random;


public class Opdracht1 
{
	int[] collectie;
	ArrayList<Integer> collectieList;
	
	public Opdracht1()
	{
		collectieList = new ArrayList<Integer>();
	}
	
	
	public long measureRunningTimeAlg1(int i)
	{
		long startTime = System.currentTimeMillis();		
		alg1(i);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		return duration;
	}
	public long measureRunningTimeAlg2(int i)
	{
		long startTime = System.currentTimeMillis();		
		alg2(i);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		return duration;
	}
	
	public long measureRunningTimeAlg3(int i)
	{
		long startTime = System.currentTimeMillis();		
		alg3(i);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		return duration;
	}
	
	private int randInt(int max)	
	{
		Random random = new Random();
		//return min + (int)(Math.random() * (max));  // 2 statements??
		return random.nextInt(max);
	}
	
	
	
	public void alg3(int aantal)
	{
		int[] sortedArray = new int[aantal];
		
		for(int i = 0; i < aantal; i++)
		{
			sortedArray[i] = i;		
			
						
		}
		for(int i = 0; i < aantal; i++)
		{
			int randomPos = randInt(aantal);
			int temp = sortedArray[i];
			sortedArray[i] = sortedArray[randomPos];
			sortedArray[randomPos] = temp; 
			
			
		}
		
//		for(int j = 0; j < aantal ; j++)
//		{	
//			System.out.println(sortedArray[j]);
//		}
	}
		
	public void alg2(int aantal)
	{		
		int[] sortedArray = new int[aantal];	//1 	1 statement
		boolean[] used = new boolean[sortedArray.length+1]; //2 statement
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
									sortedArray[j] = getal;
									used[getal] = true;
									placed = true;
								}
						}				
				}
			done = true;		//1 statement
		}
			
		
		
	}
	
	public void alg1(int i)
	{
		
		boolean done = false;  //1 statement
		
		
		while(!done)    //2  1 statement + 1 check
		{
			int getal = randInt(i);    // 1 statement??
			
			if(!collectieList.contains(getal)) //2  1 statement + 1 check
			{
				collectieList.add(getal);     //1  1 statement
			//	System.out.println("Collectie2 " + getal);		
			}
			
			if(collectieList.size() == i)  //2  1 statement + 1 check
			{
				done = true;               //1  1 statement
			}
		}    
			
		
	}

}
