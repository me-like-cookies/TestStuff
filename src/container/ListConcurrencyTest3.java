package container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ListConcurrencyTest3 
{
	private List<Integer> list;

	public ListConcurrencyTest3() {
		list = new ArrayList<>();
	}
	
	// not public, not private, not package!
	// nobody outside will care that   for (int x : getList())   is a bad idea!
	private synchronized List<Integer> getList() { return list; }
	
	// instead provide size and iteration for a "functor" / "functional interface"
	public int getListSize() {return getList().size();}

	public synchronized void iterateAll(Consumer<Integer> functor)
	{
		if (functor == null) return;
		for (Integer curInt : getList())
		{
			functor.accept(curInt);
		}
	}
	
	public synchronized void sort()
	{
		System.out.println("sort start");
		List<Integer> tmpList = new ArrayList<>(list);
		Collections.sort(tmpList);
		list = tmpList;
		System.out.println("sort done");
	}

	public synchronized void listAdd(int newInt)
	{
		list.add(Integer.valueOf(newInt));
	}
	
}
