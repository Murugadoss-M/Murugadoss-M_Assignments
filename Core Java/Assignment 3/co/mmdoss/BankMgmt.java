package co.mmdoss;

import java.util.Set;
import java.util.TreeSet;

class SavingAccount implements Comparable<SavingAccount>{
	private double acc_balance;
	private long acc_ID;
	private String accountHoldername;
	private boolean isSalaryAccount;
	public SavingAccount(long acc_ID, String accountHoldername, double acc_balance, boolean isSalaryAccount) {
		super();
		this.acc_ID = acc_ID;
		this.accountHoldername = accountHoldername;
		this.acc_balance = acc_balance;
		this.isSalaryAccount = isSalaryAccount;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public long getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(long acc_ID) {
		this.acc_ID = acc_ID;
	}
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	@Override
	public int compareTo(SavingAccount o) {
		if(this.getAcc_ID()>o.getAcc_ID())
			return 1;
		else if(this.getAcc_ID()<o.getAcc_ID())
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHoldername="
				+ accountHoldername + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	
}

class BankAccountList{
	private static Set<SavingAccount> treeset=new TreeSet<>();
	public static void add(SavingAccount s)
	{
		treeset.add(s);
	}
	public static void remove(SavingAccount s) {
		treeset.remove(s);
	}
	public static void view() {
		for (SavingAccount savingAccount : treeset) {
			System.out.println(savingAccount);
		}
	}
}

public class BankMgmt {
	public static void main(String[] args) {
		BankAccountList.add(new SavingAccount(1,"Doss",1000,true));
		BankAccountList.add(new SavingAccount(2,"Bob",2000,false));
		BankAccountList.add(new SavingAccount(5,"Carl",3000,false));
		BankAccountList.add(new SavingAccount(3,"Alex",500,true));
		BankAccountList.add(new SavingAccount(4,"Ross",200,true));
		BankAccountList.add(new SavingAccount(6,"Joey",2500,false));
		BankAccountList.add(new SavingAccount(2,"Winston",4000,true));
		BankAccountList.add(new SavingAccount(9,"Zoey",1000,true));
		
		BankAccountList.view();
	}

}
