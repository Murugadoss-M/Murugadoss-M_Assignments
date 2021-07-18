package co.mmdoss;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assingment_4_6 {
public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		UnaryOperator<String> unaryOperator=a->a.toUpperCase();
		
		list.add("Helicopter");
		list.add("East");
		list.add("Land");
		list.add("Leave");
		list.add("Oxford");
		list.add(" xford");
		list.add("Bxford");
		list.add("Oxford");
		list.add("Yxford");
		list.add("Zxford");
		
		list.replaceAll(unaryOperator);
		
		list.forEach(System.out::println);
		
	}	
}
