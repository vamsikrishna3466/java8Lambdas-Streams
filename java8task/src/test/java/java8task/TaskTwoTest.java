package java8task;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import tasktwo.TaskTwoJava;

class TaskTwoTest {
	static TaskTwoJava tasktwojavaobject;
	@BeforeAll
	static void objectcreation()
	{
		tasktwojavaobject=new TaskTwoJava();
	}

	@Test
	void test1() {
		List<String> listobject=Arrays.asList("ang","abgty","gth","aaa","acdffaa");
		List<String> output=Arrays.asList("ang","aaa");
		assertEquals(output,tasktwojavaobject.findValidStrings(listobject));
	}
	@Test
	void test2()
	{
		List<String> listobj = null;
		assertEquals(null,tasktwojavaobject.findValidStrings(listobj));
	}

}
