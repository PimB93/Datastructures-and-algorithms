import java.util.ArrayList;
import java.util.Arrays;
import java.util.DuplicateFormatFlagsException;


public class Opdracht1 
{
	int[] collectie;
	ArrayList<Integer> collectieList;
	
	public Opdracht1()
	{
		collectieList = new ArrayList<Integer>();
	}
	
	public void Fill(int aantal)
	{
		collectie = new int[aantal];
		for(int i=0; i< aantal; i++)
		{
			collectie[i] = randInt(0,aantal);
			
			
			System.out.println("collectie1 " + collectie[i]);
		}
		
	
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
	
	private int randInt(int min,int max)	
	{
		return min + (int)(Math.random() * (max+1));  // 2 statements??
		
	}
	
	public int[] swap(int [] a, int arrayPos, int getal )//4 statements
	{
		int temp = arrayPos;		 //1 statement
		a[arrayPos] = getal;         //1 statement
		a[getal] = temp;			 //1 statement
		
		return a;					 //1 statement
	}
	
	//algoritme 3 wel of niet zelfde getallen? staat niet expliciet in de opdracht..
	public void alg3(int aantal)
	{
		int[] sortedArray = new int[aantal]; //1  1 statement
		
		for(int i = 0; i < aantal; i++) //4	 3 statement + 1 check
		{
			sortedArray[i] = i;			
		}
		for(int i = 0; i < aantal; i++) //6 5 statement + 1 check
		{
			int getal = randInt(0, aantal);
			sortedArray = swap(sortedArray, sortedArray[i], getal);	
		}
		
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
							int getal = randInt(0, aantal );
							
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
			int getal = randInt(0,i);    // 1 statement??
			
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
//	public void Alg1(int[] collectie)
//	{
//		System.out.println("new");
//		for(int i : collectie)
//		{
//			System.out.println("collectie " + i);
//		}
//		
//		boolean gevonden = false;
//		int[] sortedCollectie = collectie;
//		System.out.println("nieuwe array");
//		for(int i=0; i< sortedCollectie.length; i++)
//		{
//			do
//			{
//				    int getal = randInt(0,collectie.length+1);
//					for(int j =0; j < sortedCollectie.length; j++)
//					{
//						if(getal == sortedCollectie[j])
//						{
//							gevonden =true;
//							break;
//						}
//						if(!gevonden)
//						{
//							sortedCollectie[i] = getal;
//						}
//					}
//			}
//			while(!gevonden);
//			System.out.println("nieuwe array cijfer: " +sortedCollectie[i]); 
//				
//		}
//				
//	}
}
