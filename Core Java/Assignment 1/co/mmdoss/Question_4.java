package co.mmdoss;

public class Question_4 {

	public Question_4() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		double marks[]=new double[3];
		int counter=0;
		for (int i=0;i<3;i++) {
			marks[i]=KeyboardUtil.getDouble("Enter marks for subject " + (i+1) + " : ");
			if(marks[i]>60)
				counter++;
		}
		switch (counter) {
		case 1:
			System.out.println("Student failed");
			break;
		case 2:
			System.out.println("Student promoted");
			break;
		case 3:
			System.out.println("Student passed");
			break;
		default:
			System.out.println("Student failed");
		}
	}

}
