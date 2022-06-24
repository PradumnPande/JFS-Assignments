package assignment6Collection;

import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedList;

public class Date1{

	public static void main(String[] args) throws ParseException {
		LinkedList<Date> ll=new LinkedList<Date>();
		//String sd="2022";
		//java.util.Date d=new SimpleDateFormat("yyyy").parse(sd);
		ll.add(new Date(2000 ,05 ,23));
		ll.add(new Date(2001 ,04 ,20));
		//int res=(int)d;
		Iterator<Date> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Date dd=new Date();
	//	System.out.println(dd.compareTo(dd.getYear()));
		
	}



}
