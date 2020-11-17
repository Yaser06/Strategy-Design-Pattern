package com.yaser.domain;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public double executeStrategy(double number1 , double number2) {
		
		return strategy.doCalculate(number1, number2);
	}
}
