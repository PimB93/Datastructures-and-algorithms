package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import nl.saxion.*;

public class Algoritme2Test {

	@Test
	public void testAlgoritme2() 
	{
		Algoritme2 alg1 = new Algoritme2();
		alg1.alg2(1000);
		ArrayList<Integer> lijstje = alg1.getLijst();
		HashMap<Integer,Integer> lijstje2 = new  HashMap<>();;
		for(int i =0; i< lijstje.size(); i++)
		{
			lijstje2.put(i, lijstje.get(i));
		}
	    assertTrue(lijstje.size() == lijstje2.size());
	}
	@Test (expected = AssertionError.class)
	public void testAlgoritme2Foutief1() 
	{
		Algoritme2 alg1 = new Algoritme2();
		alg1.alg2(-1);
		ArrayList<Integer> lijstje = alg1.getLijst();
		HashMap<Integer,Integer> lijstje2 = new  HashMap<>();;
		for(int i =0; i< lijstje.size(); i++)
		{
			lijstje2.put(i, lijstje.get(i));
		}
		
	    if(lijstje2.size() < lijstje.size())
	    {
	    	  assertTrue(lijstje.size() == lijstje2.size());
	    }
	}

}
