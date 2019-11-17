package com.nt.service;

//target class
public class BankService {
	
	//simpleIntrestAmount
	public float calcSimpleInterestAmount(float pAmount,float rate,float time) {
		System.out.println("BankService.calSimpleInterestAmount(---)");
		return (pAmount*rate*time)/100.0f;		
	}
	//compoundInterestAmount
	public float calcCompoundInterestAmount(float pAmount,float rate,float time) {
		System.out.println("BankService.calcCompoundInterestAmount(---)");
		return (float) ((pAmount*Math.pow(1+(rate/100),time))-pAmount);
		
	}

}
