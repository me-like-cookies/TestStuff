package container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListConcurrencyTest2 
{
	public static void main(String[] args) 
	{
		final ListConcurrencyTest2 test = new ListConcurrencyTest2();
		test.fill(10000000);
		Thread con1 = new Thread() { public void run() { try { test.sort(); } catch (Exception e) {e.printStackTrace(); throw e; } } }; 
		Thread con2 = new Thread() { public void run() { try { test.printall(); } catch (Exception e) {e.printStackTrace(); throw e; } } };
		con1.start();
		con2.start();
	}
	
	private List<Integer> list;

	public ListConcurrencyTest2() {
		list = new ArrayList<>();
	}
	
	public synchronized List<Integer> getList() { return list; }

	public synchronized void sort()
	{
		System.out.println("sort start");
		List<Integer> tmpList = new ArrayList<>(getList());
		Collections.sort(tmpList);
		list = tmpList;
		System.out.println("sort done");
	}
	
	public void printall()
	{
		
		final List<Integer> unchangedWhileLooping = getList();
		for (final Integer curli : unchangedWhileLooping)
		{
			System.out.println(curli);
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
