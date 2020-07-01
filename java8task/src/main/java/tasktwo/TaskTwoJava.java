package tasktwo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskTwoJava
{
	public List<String> findValidStrings(List<String> listobject)
	{
		final Logger log=LogManager.getLogger("TaskTwoJava.class");
		log.info("In second task");
		List<String> list=null;
		Optional<List<String>> p=Optional.ofNullable(listobject);
		log.info("checking list is empty or not");
		if(p.isPresent())
		{
			log.info("list is not empty");
		 list=listobject.stream()
		.filter(value->(value.startsWith("a"))&&(value.length()==3))
		.collect(Collectors.toList());
		 log.debug("The length of list is {}",list.size());
		}
		return list;
		
	}

}
