package co.mmdoss;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Orders{
	int order_id;
	double price;
	String status;
	public Orders(int order_id, double price, String status) {
		this.order_id = order_id;
		this.price = price;
		this.status = status;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", price=" + price + ", status=" + status + "]";
	}
	
}
public class Assignment_4_2 {
	public static void main(String[] args) {
		List<Orders> list=Arrays.asList(new Orders(101,1000,"ACCEPTED"),
				new Orders(102,2300,"CANCELLED"),
				new Orders(103,9999,"ACCEPTED"),
				new Orders(104,10001,"COMPLETED"),
				new Orders(105,10005,"ACCEPTED"),
				new Orders(106,12000,"ACCEPTED"),
				new Orders(107,11000,"CANCELLED"),
				new Orders(108,3500,"ACCEPTED"),
				new Orders(109,5500,"COMPLETED"),
				new Orders(110,1200,"ACCEPTED")
				);
		System.out.println("Order price more than 10000 : ");
		print(list,a->a.getPrice()>10000);
		System.out.println("Order status ACCEPTED or COMPLETED : ");
		print(list,a->a.getStatus().equalsIgnoreCase("accepted")||a.getStatus().equalsIgnoreCase("completed"));
		
	}
	private static void print(List<Orders> list,Predicate<Orders> predicate) {
		list.stream()
		.filter(predicate)
		.forEach(System.out::println);
	}
}
