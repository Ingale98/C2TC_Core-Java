package com.vaishali.application;

import com.vaishali.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL=1000;
	
	public static float getMinbal() {
		return MINBAL;
	}
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried, float withdrawAmt) {
		super(accNo, accNm, accBal,withdrawAmt);
		
	}

	@Override
	public void withdraw(float accBal, float withdrawAmt) 
	
	{
		if(accBal < MINBAL) {
			System.out.println("Can't withdraw, minimum balance needs to be maintained");
		}
		else if(accBal> MINBAL) {
			this.accBal = this.accBal - this.withdrawAmt;
			System.out.println(withdrawAmt +" amount withdrawn successfully. Your acoount balance is :" +this.accBal);
		}
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accBal=" + accBal + ", withdrawAmt=" + withdrawAmt + ", getAccBal()=" + getAccBal()
				+ ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getWithdrawAmt()=" + getWithdrawAmt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}


	
}