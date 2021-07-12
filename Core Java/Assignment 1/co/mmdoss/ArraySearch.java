package co.mmdoss;

public class ArraySearch {

	private ArraySearch() {
		// TODO Auto-generated constructor stub
	}
	public static void searchArray(int arr[],int key) {
		boolean flag=false;
		for (int num : arr) {
			if(num==key) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println(key + " is present in the given array.");
		}
		else {
			System.out.println(key + " is not present in the given array");
		}
		
	}
}
