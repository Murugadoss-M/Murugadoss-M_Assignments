package co.mmdoss;

import java.util.ArrayList;

abstract class DessertItem{
	abstract double getCost();
	abstract String getName();
}
class Candy extends DessertItem{
	double price;
	String name;
	public Candy(String name,double price) {
		this.name=name;
		this.price=price;
	}
	@Override
	double getCost() {
		return price*60;
	}
	@Override
	String getName() {
		return name;
	}
}
class Cookie extends DessertItem{
	double price;
	String name;
	public Cookie(String name,double price) {
		this.name=name;
		this.price=price;
	}
	@Override
	double getCost() {
		return price*70;
	}
	@Override
	String getName() {
		return name;
	}
}
class IceCream extends DessertItem{
	double price;
	String name;
	public IceCream(String name,double price) {
		this.name=name;
		this.price=price;
	}
	@Override
	double getCost() {
		return price;
	}
	@Override
	String getName() {
		return name;
	}
	
}
public class DessertShop {

	public static void main(String args[]) {
				ArrayList<DessertItem> items=new ArrayList<DessertItem>();
				items.add(new Candy("5 Star",0.5));
				items.add(new Candy("Milky bar",0.6));
				items.add(new Candy("Dairy Milk",0.8));
				items.add(new Cookie("Dark Fantasy",1));
				items.add(new Cookie("Milano",1.2));
				items.add(new Cookie("Bourbon",1.1));
				items.add(new IceCream("Vanilla Ice Cream",70));
				items.add(new IceCream("Chocolate Ice Cream",80));
				items.add(new IceCream("ButterScotch Ice cream",90));
				while(true) {
					System.out.println("--------Dessert Shop-------------");
					System.out.println("1.Admin Login");
					System.out.println("2.Customer Login");
					System.out.println("Press any other key to exit");
					int choice=KeyboardUtil.getInt("Enter choice : ");
					switch (choice) {
					case 1: 
						outer:
						while(true) {
							System.out.println("1.View items");
							System.out.println("2.Add items");
							System.out.println("Press any other key to exit admin mode");
							int option=KeyboardUtil.getInt("Enter option : ");
							switch (option) {
								case 1:
									for (DessertItem d:items) {
										System.out.println("Name : "+ d.getName() + " Price : "+d.getCost());
									}
									break;
								case 2:
									System.out.println("1.Candy");
									System.out.println("2.Cookie");
									System.out.println("3.Ice Cream");
									int itemchoice=KeyboardUtil.getInt("Enter option : ");
									String name=KeyboardUtil.getString("Enter name  : ");
									double price=KeyboardUtil.getDouble("Enter price : ");
									switch (itemchoice) {
									case 1:
										items.add(new Candy(name,price));
										break;
									case 2:
										items.add(new Cookie(name,price));
										break;
									case 3:
										items.add(new IceCream(name,price));
										break;
									default:
										System.out.println("Exiting from admin mode");
										break outer;
									}
									break;
								default:
									System.out.println("Exiting from admin mode");
									break outer;
									
							}
						}
						break;
					case 2:
						for (int i=0;i<items.size();i++) {
							System.out.println((i+1)+"   Name : "+ items.get(i).getName() + " Price : "+items.get(i).getCost());
						}
						double total=0;
						while(true) {
							int num=KeyboardUtil.getInt("Enter item number you want to order (0 to quit): ");
							if (num==0)
								break;
							int qty=KeyboardUtil.getInt("Enter quantity : ");
							total+=qty*items.get(num-1).getCost();
						}
						System.out.println("Total order amount (in rupees) : "+total);
						
						break;
					default:
						System.out.println("Exiting !!!");
						System.exit(0);
					}
				}
	}

}
