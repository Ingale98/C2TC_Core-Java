package com.Client;

import com.vaishali.application.MMBankFactory;
import com.vaishali.application.MMCurrentAcc;
import com.vaishali.application.MMSavingAcc;
import com.vaishali.framework.BankFactory;
import com.vaishali.framework.CurrentAcc;
import com.vaishali.framework.SavingAcc;

public class Client {
	public static void main(String[] args) {
		BankFactory bf =new MMBankFactory();
		SavingAcc sa =new MMSavingAcc(1,"Vaishali",5000,true,1100);
		sa.withdraw(sa.getAccBal(), sa.getWithdrawAmt());
		sa.toString();
		CurrentAcc ca =new MMCurrentAcc(2,"Shrutika",2500,7000,500);
		ca.withdraw(ca.getCreditLimit(),ca.getWithdrawAmt());
		ca.toString();
	}

}
