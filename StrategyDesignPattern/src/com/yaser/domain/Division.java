package com.yaser.domain;

public class Division implements Strategy{

	@Override
	public double doCalculate(double number, double number2) {
		
		return number/number2;
	}

}
