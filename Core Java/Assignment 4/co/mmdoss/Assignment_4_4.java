package co.mmdoss;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

public class Assignment_4_4 {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Orders> list=new CopyOnWriteArrayList<>();
		list.add(new Orders(101,1000,"ACCEPTED"));
		list.add(new Orders(102,2300,"CANCELLED"));
		list.add(new Orders(103,9999,"ACCEPTED"));
		list.add(new Orders(104,10001,"COMPLETED"));
		list.add(new Orders(105,10005,"ACCEPTED"));
		list.add(new Orders(106,12000,"ACCEPTED"));
		list.add(new Orders(107,11000,"CANCELLED"));
		list.add(new Orders(108,3500,"ACCEPTED"));
		list.add(new Orders(109,5500,"COMPLETED"));
		list.add(new Orders(110,1200,"ACCEPTED"));
		
		Predicate<Orders> filter=a->a.getStatus().length()%2!=0;
		System.out.println("Odd length status removed : ");
		list.removeIf(filter);
		list.forEach(System.out::println);
		
	}
	

}
