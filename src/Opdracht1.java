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
		Alg1(i);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		return duration;
	}
	public long measureRunningTimeAlg2(int i)
	{
		long startTime = System.currentTimeMillis();		
		Alg2(i);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		return duration;
	}
	
	private int randInt(int min,int max)	
	{
		return min + (int)(Math.random() * max);
		
	}
	public void Alg2(int aantal)
	{		
		int[] sortedArray = new int[aantal];	
		boolean[] used = new boolean[sortedArray.length + 1];
		boolean done = false;	
		while(!done)
		{
									
				for(int j = 0; j < aantal ; j++)
				{		
				boolean placed = false;
				while(!placed){
				int getal = randInt(0, aantal + 1);
				
				if(!used[getal] )
				{
					sortedArray[j] = getal;
					used[getal] = true;
					placed = true;
				}
				
				}				
					}
				
			done = true;		
		}
			
		
		
	}
	
	public void Alg1(int i)
	{
		
		boolean done = false;
		
		
		while(!done)
		{
			int getal = randInt(0,i);
			
			if(!collectieList.contains(getal))
			{
				collectieList.add(getal);
				//System.out.println("Collectie2 " + getal);		
				
			}
			
			if(collectieList.size() == i)
			{
				done = true;
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
