package java8task;
import org.junit.jupiter.api.Test;
import taskone.Average;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import java.util.*;
class TaskOneTestfile {
	static Average averageobject;
	@BeforeAll
	static void creation()
	{
		averageobject=new Average();
	}
	@Test
	void test1()
	{
		Integer []array= {1,2,3,4,6};
		List<Integer> listobject=new ArrayList<Integer>();
		listobject=Arrays.asList(array);
		assertEquals(3.2,averageobject.averageCalculation(listobject),0.1);
	}
	@Test
	void test2()
	{
		List<Integer> listobject=new ArrayList<Integer>();
		assertEquals(0.0,averageobject.averageCalculation(listobject),0.001);
		
	}

}
