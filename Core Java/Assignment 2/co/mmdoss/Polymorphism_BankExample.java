package co.mmdoss;

public class Polymorphism_BankExample {

	public Polymorphism_BankExample() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		double balance=30000;
		double credit=10000;
		int deposit=15000;
		System.out.println(getTotalCash(balance, credit));
		System.out.println(getTotalCash(balance, deposit));
	}
	public static double getTotalCash(double balance,int deposit) {
		System.out.print("In savings account : ");
		return balance+deposit;
	}
	public static double getTotalCash(double balance,double credit) {
		System.out.print("In current account : ");
		return balance+credit;
	}
}
