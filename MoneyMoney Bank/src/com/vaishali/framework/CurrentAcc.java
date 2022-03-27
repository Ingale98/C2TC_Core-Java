package com.vaishali.framework;

public abstract class CurrentAcc extends BankAcc {

	public CurrentAcc(int accNo, String accNm, float accBal, float isSalaried, float withdrawAmt) {
		super(accNo, accNm, accBal, isSalaried);
		this.creditLimit = isSalaried;
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	private final float  creditLimit;
	public  void withdraw(float creditLimit, float withdrawAmt) {
		if(accBal > creditLimit) {
			System.out.println("Can't withdraw.");
		}
		else if(accBal> creditLimit && creditLimit > (accBal - withdrawAmt)) {
			this.accBal = this.accBal - this.withdrawAmt;
			System.out.println("Amount withdrawn successfully. Your acoount balance is :" +accBal);
		}
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", accBal=" + accBal + ", withdrawAmt=" + withdrawAmt
				+ ", getCreditLimit()=" + getCreditLimit() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", getWithdrawAmt()=" + getWithdrawAmt() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}