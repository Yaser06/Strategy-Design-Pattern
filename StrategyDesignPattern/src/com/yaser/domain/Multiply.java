package com.yaser.domain;

public class Multiply implements Strategy {

	@Override
	public double doCalculate(double number, double number2) {
		// TODO Auto-generated method stub
		return number*number2;
	}

}
