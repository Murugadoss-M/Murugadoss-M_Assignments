package co.mmdoss;

public class Question_9 {

	public Question_9() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		double subA[]=new double[3];
		double subB[]=new double[3];
		double subC[]=new double[3];
		for(int i=0;i<3;i++) {
			subA[i]=KeyboardUtil.getDouble("Enter student "+ (i+1)+" mark for subject A : ");
			subB[i]=KeyboardUtil.getDouble("Enter student "+ (i+1)+" mark for subject B : ");
			subC[i]=KeyboardUtil.getDouble("Enter student "+ (i+1)+" mark for subject C : ");
		}
		double tot_A=0,tot_B=0,tot_C=0;
		for(int i=0;i<3;i++) {
			tot_A+=subA[i];
			tot_B+=subB[i];
			tot_C+=subC[i];
		}
		System.out.println("Subject A :");
		System.out.println("Total : "+tot_A+" Average : "+tot_A/3);
		System.out.println("Subject B :");
		System.out.println("Total : "+tot_B+" Average : "+tot_B/3);
		System.out.println("Subject C :");
		System.out.println("Total : "+tot_C+" Average : "+tot_C/3);
		double stu[]=new double[3]; 
		for(int i=0;i<3;i++) {
			stu[i]=subA[i]+subB[i]+subC[i];
		}
		for(int i=0;i<3;i++) {
			System.out.println("Student "+(i+1)+" :");
			System.out.println("Total : "+stu[i]+" Average : "+stu[i]/3);
		}
	}

}
