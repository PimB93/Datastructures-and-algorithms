package nl.saxion;
import java.util.ArrayList;


public class Algoritme2 
{
	  private ArrayList<Integer> collectie;
	  public Algoritme2()
	  {
		  collectie = new ArrayList<>();
	  }
	  /**
		 * 
		 * @param aantal Het ingevoerde getal waar het algoritme mee moet werken
		 */
		public void alg2(int aantal)
		{		
			boolean[] used = new boolean[collectie.size()]; //2 statement
			boolean done = false;	// 1 statement
			while(!done) //2 1 check + 1 statement
			{					
					for(int j = 0; j < aantal ; j++) //11  8statements and 3 check
					{		
							boolean placed = false;
							while(!placed)
							{
								int getal = TrekGetal.randInt(aantal);
								
									if(!used[getal] )
									{
										collectie.set(j, getal);
										used[getal] = true;
										placed = true;
									}
							}				
					}
				done = true;		//1 statement
			}
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
		public ArrayList<Integer> getLijst()
		{
			return this.collectie;
		}
}
