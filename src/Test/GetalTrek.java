package Test;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import nl.saxion.TrekGetal;

import org.junit.Test;


public class GetalTrek
{
	@Test 
	public void GoedGetal()
	{
		for(int i=1; i< 1000; i++)
		{
			int getal = TrekGetal.randInt(i);
			//System.out.println(getal);
		}
	
	}
	@Test (expected= AssertionError.class)
	public void foutGetal()
	{
		for(int i=-1; i< 1000; i--)
		{
			int getal = TrekGetal.randInt(i);
			System.out.println("fail ");
		}
	}
}
