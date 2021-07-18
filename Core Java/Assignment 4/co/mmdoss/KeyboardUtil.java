package co.mmdoss;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class KeyboardUtil {

	private KeyboardUtil() {
	
	}
	public static int getInt(String message) {
		System.out.print(message);
		Scanner scanner=new Scanner(System.in);
		int value= scanner.nextInt();
		return value;
	}
	public static String getString(String message) {
		System.out.print(message);
		Scanner scanner=new Scanner(System.in);
		String value= scanner.nextLine();
		return value;
	}
	public static double getDouble(String message) {
		System.out.print(message);
		Scanner scanner=new Scanner(System.in);
		double value= scanner.nextDouble();
		return value;
	}
	public static char getChar(String message) {
		System.out.print(message);
		Scanner scanner=new Scanner(System.in);
		char value= scanner.next().charAt(0);
		return value;
	}
	public static long getLong(String message) {
		System.out.print(message);
		Scanner scanner=new Scanner(System.in);
		long value= scanner.nextLong();
		return value;
	}
	public static short getShort(String message) {
		System.out.print(message);
		Scanner scanner=new Scanner(System.in);
		short value= scanner.nextShort();
		return value;
	}
	public static Date getDate(String message) throws Exception {
		System.out.print(message);
		Scanner scanner=new Scanner(System.in);
		String dateValue= scanner.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date value=sdf.parse(dateValue);
		return value;
	}
	public static byte getByte(String message) {
		System.out.print(message);
		Scanner scanner=new Scanner(System.in);
		byte value= scanner.nextByte();
		return value;
	}
	public static boolean getBoolean(String message) {
		System.out.print(message);
		Scanner scanner=new Scanner(System.in);
		boolean value= scanner.nextBoolean();
		return value;
	}
	

}
