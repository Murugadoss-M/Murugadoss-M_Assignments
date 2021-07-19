package co.mmdoss;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Assignment_5_Trader {
	public static void main(String[] args) {
		
		List<Trader> traderList=new LinkedList<Trader>();
		
		traderList.add(new Trader("doss", "Chennai"));
		traderList.add(new Trader("mmdoss", "Mumbai"));
		traderList.add(new Trader("muthu", "Indore"));
		traderList.add(new Trader("kamal", "Bangalore"));
		traderList.add(new Trader("usha", "Pune"));
		traderList.add(new Trader("venky", "Delhi"));
		traderList.add(new Trader("sree", "Chennai"));
		traderList.add(new Trader("gandhi", "Delhi"));
		traderList.add(new Trader("raja", "Indore"));
		traderList.add(new Trader("kannan", "Pune"));
		
		System.out.println("Traders List : \n");
		traderList.forEach(System.out::println);
		
		/*System.out.println("\n---------------------\n");
		System.out.println("Unique cities where traders work : \n");
		
		traderList.stream()
		.distinct()
		.forEach(a->System.out.println(a.getCity()));
		*/
		System.out.println("\n---------------------\n");
		System.out.println("Traders from Pune sorted by name alphabetically : \n");
		
		traderList.stream()
		.filter(a->a.getCity().equalsIgnoreCase("pune"))
		.sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
		.forEach(System.out::println);
		
		/*System.out.println("\n---------------------\n");
		System.out.println("String of all traders name sorted alphabetically : \n");
		
		traderList.stream()
		.sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
		.
		*/
		
		System.out.println("\n---------------------\n");
		System.out.println("Traders from Indore : \n");
		
		traderList.stream()
		.filter(a->a.getCity().equalsIgnoreCase("Indore"))
		.forEach(System.out::println);
		
	}
}
