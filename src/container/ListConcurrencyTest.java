package container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListConcurrencyTest 
{
	public static void main(String[] args) 
	{
		final ListConcurrencyTest test = new ListConcurrencyTest();
		test.fill(10000000);
		Thread con1 = new Thread() { public void run() { try { test.sort(); } catch (Exception e) {e.printStackTrace(); throw e; } } }; 
		Thread con2 = new Thread() { public void run() { try { test.printall(); } catch (Exception e) {e.printStackTrace(); throw e; } } };
		con1.start();
		con2.start();
	}
	
	private List<Integer> list;

	public ListConcurrencyTest() {
		list = new ArrayList<>();
	}
	
	public List<Integer> getList() { return list; }

	public void sort()
	{
		System.out.println("sort start");
		Collections.sort(getList());
		System.out.println("sort done");
	}
	
	public void printall()
	{
		for (final Integer curli : getList())
		{
			System.out.println(curli);
		}
	}
	
	public void foobar()
	{
		
		int cnt = 0; 
		for (final Integer curli : list)
		{
			if (cnt % 5 == 0)
			{
				Collections.sort(list);
			}
			cnt++;
		}
		
	}

	public void fill(int n)
	{
		final Random rnd = new Random();
		for (int i=0; i<n; i++)
		{
			final int rndI = rnd.nextInt(1000000);
			list.add(Integer.valueOf(rndI));
		}
	}
	
}
