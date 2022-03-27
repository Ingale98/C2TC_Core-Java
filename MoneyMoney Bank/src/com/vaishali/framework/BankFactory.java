package com.vaishali.framework;

public abstract class BankFactory {
	public abstract SavingAcc getNewSAvingAccount(int AccNo, String accNm,float accBal, boolean isSalaried, float withdrawAmt);
	public abstract CurrentAcc getNewCurrentAccount(int AccNo, String accNm,float accBal,float creditLimit, float withdrawAmt);	

}

