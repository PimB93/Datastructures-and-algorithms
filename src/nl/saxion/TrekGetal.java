package nl.saxion;

import java.util.Random;


public  class TrekGetal 
{
	public TrekGetal()
    {
		 
	}
    public static int randInt(int max)	
 	{
 		Random random = new Random();
 		assert max > 0 : "ongeldig getal";
 		int getal = random.nextInt(max);
 		assert getal <= max : "ongeldig getal getrokken";
 		return getal;
 	}
}
