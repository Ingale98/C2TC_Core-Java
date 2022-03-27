package com.vaishali.application;

import com.vaishali.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit, float withdrawAmt) {
		super(accNo, accNm, accBal, creditLimit,withdrawAmt);
		
	}
	@Override
	public void withdraw( float creditLimit, float withdrawAmt) {
		if(accBal < creditLimit) {
			System.out.println("Can't withdraw.");
		}
		else if(accBal> creditLimit && creditLimit > (accBal - withdrawAmt)) {
			this.accBal = this.accBal - this.withdrawAmt;
			System.out.println("Amount withdrawn successfully. Your acoount balance is :" +accBal);
		}
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [accBal=" + accBal + ", withdrawAmt=" + withdrawAmt + ", getCreditLimit()="
				+ getCreditLimit() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getWithdrawAmt()=" + getWithdrawAmt()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



	


	
}