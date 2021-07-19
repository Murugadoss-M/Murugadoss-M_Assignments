package co.mmdoss;

import java.util.LinkedList;
import java.util.List;

class Assignment_5_Fruit {

	public static void main(String[] args) {
		
		List<Fruit> fruitList=new LinkedList<>();
				
		fruitList.add(new Fruit("Apple", 175, 150, "Red"));
		fruitList.add(new Fruit("Mango", 60, 70, "Yellow"));
		fruitList.add(new Fruit("Banana", 95, 30, "Yellow"));
		fruitList.add(new Fruit("Strawberry", 90, 170, "Red"));
		fruitList.add(new Fruit("Orange", 120, 90, "Orange"));
		fruitList.add(new Fruit("Guava", 200, 70, "Green"));
		fruitList.add(new Fruit("Lemon", 50, 30, "Green"));
		
		System.out.println("Fruit List : \n");
		
		fruitList.forEach(System.out::println);
		
		System.out.println("\n-------------------------------\n");
		
		System.out.println("Print low calory fruit names (calories < 100) in descending order of calories :\n");
		
		fruitList.stream()
		.filter(a->a.getCalories()<100)
		.sorted((o1,o2)->o2.getCalories()-o1.getCalories())
		.forEach(a->System.out.println(a.getName()));
		
		System.out.println("\n-------------------------------\n");
		
		System.out.println("Print color wise list of fruit names :\n");
		
		fruitList.stream()
		.sorted((o1,o2)->o1.getColor().compareTo(o2.getColor()))
		.forEach(a->System.out.println(a.getName()+"\t"+a.getColor()));
		
		System.out.println("\n-------------------------------\n");
		
		System.out.println("Print RED color fruits sorted by ascending order of price :\n");
		
		fruitList.stream()
		.filter(a->a.getColor().equalsIgnoreCase("red"))
		.sorted((o1,o2)->o1.getPrice()-o2.getPrice())
		.forEach(System.out::println);
	}

}
