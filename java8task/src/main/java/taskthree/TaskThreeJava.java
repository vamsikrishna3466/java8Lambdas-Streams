package taskthree;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskThreeJava {
	public List<String> checkPalindrome(List<String> elements)
	{
		final Logger log=LogManager.getLogger("TaskTwoJava.class");
		log.info("In Third task");
		List<String> list=null;
		Optional<List<String>> p=Optional.ofNullable(elements);
		log.info("checking list is empty or not");
		if(p.isPresent())
		{
			log.info("list is not empty");
			list=elements.stream()
			.filter(PalindromeCheck::check)
			.collect(Collectors.toList());
			log.debug("The size of list is {}",list.size());
		}
		return list;
		
	}

}
