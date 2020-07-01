package java8task;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import taskthree.TaskThreeJava;

class TaskThreeTest {

	static TaskThreeJava taskthreejavaobject;
	@BeforeAll
	static void objectcreation()
	{
		taskthreejavaobject=new TaskThreeJava();
	}

	@Test
	void test1() {
		List<String> listobject=Arrays.asList("a","abc","aa","aaa","abcdeff","ffabgbaff");
		List<String> output=Arrays.asList("a","aa","aaa","ffabgbaff");
		assertEquals(output,taskthreejavaobject.checkPalindrome(listobject));
	}
	@Test
	void test2()
	{
		List<String> listobj = null;
		assertEquals(null,taskthreejavaobject.checkPalindrome(listobj));
	}


}
