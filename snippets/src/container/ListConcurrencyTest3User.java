package container;

import java.util.Random;

public class ListConcurrencyTest3User 
{
	public static void main(String[] args) 
	{
		final ListConcurrencyTest3 test = new ListConcurrencyTest3();
		fill(test, 10000000);
		Thread con1 = new Thread() { public void run() { try { test.sort(); } catch (Exception e) {e.printStackTrace(); throw e; } } }; 
		Thread con2 = new Thread() { public void run() { try { printall(test); } catch (Exception e) {e.printStackTrace(); throw e; } } };
		con1.start();
		con2.start();
	}
	
	public static void printall(final ListConcurrencyTest3 test)
	{
		test.iterateAll(x -> System.out.println(x));
	}
	
	public static void fill(final ListConcurrencyTest3 test, int n)
	{
		final Random rnd = new Random();
		for (int i=0; i<n; i++)
		{
			final int rndI = rnd.nextInt(1000000);
			test.listAdd(Integer.valueOf(rndI));
		}
	}
	
}
