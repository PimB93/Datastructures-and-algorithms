package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;
import nl.saxion.*;

public class Algoritme3Test {

	@Test
	public void testAlgoritme3() 
	{
		Algoritme3 alg1 = new Algoritme3();
		alg1.alg3(5);
		ArrayList<Integer> lijstje = alg1.getLijst();
		HashMap<Integer,Integer> lijstje2 = new  HashMap<>();;
		for(int i =0; i< lijstje.size(); i++)
		{
			lijstje2.put(i, lijstje.get(i));
		}
	    assertTrue(lijstje.size() == lijstje2.size());
	}
	@Test (expected = AssertionError.class)
	public void testAlgoritme3Foutief1() 
	{
		Algoritme3 alg1 = new Algoritme3();
		alg1.alg3(-1);
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
