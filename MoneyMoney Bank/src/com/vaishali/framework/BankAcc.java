package com.vaishali.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	protected float accBal;
	protected float withdrawAmt;
	
	public int getAccNo() {
		return accNo;
	}
	
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	
	public float getWithdrawAmt() {
		return withdrawAmt;
	}
	
	public BankAcc(int accNo, String accNm, float accBal,float withdrawAmt ) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
		this.withdrawAmt= withdrawAmt;
	}
	
	public abstract void withdraw(float accBal, float withdrawAmt);
	public void deposite(float accBal) {
		System.out.println(withdrawAmt + "Money deposited successfully " + accBal);
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", withdrawAmt=" + withdrawAmt
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getWithdrawAmt()=" + getWithdrawAmt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	
}