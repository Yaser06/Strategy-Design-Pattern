package com.yaser.domain;

public class Sum implements Strategy {

	@Override
	public double doCalculate(double number, double number2) {
		return number+number2;
	}

}
