package co.mmdoss;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class DateClass{
	int date,month,year;
	@SuppressWarnings("deprecation")
	public DateClass(Date d) {
		date=d.getDate();
		month=d.getMonth()+1;
		year=d.getYear();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + date;
		result = prime * result + month;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DateClass other = (DateClass) obj;
		if (date != other.date)
			return false;
		if (month != other.month)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DateClass [date=" + date + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
public class EmployeeDOB {

	public static void main(String[] args) throws Exception {
		
		Map<DateClass,String> hashmap=new HashMap<>();
		
		Date d=new SimpleDateFormat("dd-MM-yyyy").parse("24-11-1998");
		DateClass key1=new DateClass(d);
		hashmap.put(key1, "Doss");
		
		d=new SimpleDateFormat("dd-MM-yyyy").parse("24-10-1998");
		DateClass key2=new DateClass(d);
		hashmap.put(key2, "Muruga");
		
		d=new SimpleDateFormat("dd-MM-yyyy").parse("24-11-1999");
		DateClass key3=new DateClass(d);
		hashmap.put(key3, "Muthu");
		
		Set<Entry<DateClass, String>> entrySet = hashmap.entrySet();
		for (Entry<DateClass, String> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue() );
		}
		
		
	}

}
