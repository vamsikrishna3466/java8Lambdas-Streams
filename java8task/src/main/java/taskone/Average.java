package taskone;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Average {
public double averageCalculation(List<Integer> values)
{
	double average=0.0;
	final Logger log=LogManager.getLogger("Average.class");
	log.info("checking whether the given list is empty or not");
	if(!(values.isEmpty()))
	{
		log.info("list is not empty");
	ListInterface listinterfaceobject=listelements->
	{
		int count=0;
		int sum=0;
		double averagevalue;
		Iterator<Integer> iteratorobject=listelements.iterator();
		while(iteratorobject.hasNext())
		{
			sum=sum+(Integer)iteratorobject.next();
			count++;
		}
		averagevalue=(double)sum/count;
		log.debug("sum of all elements in list is {}",sum);
		log.debug("Total number of elements is {}",count);
		log.debug("Average is {} ",averagevalue);
		return averagevalue;
	};
	average=listinterfaceobject.calculateaverage(values);
	}
	else
	{
		log.debug("list is empty so average is 0");
	}
	return average;
}
}
