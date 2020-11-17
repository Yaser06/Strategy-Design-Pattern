package com.yaser.program;

import com.yaser.domain.Context;
import com.yaser.domain.Division;
import com.yaser.domain.Multiply;
import com.yaser.domain.Sum;
// Kendi istegimize göre instance alip , metodu kullandik.
public class DriverStrategy {
	public static void main(String[] args) {
		Context context =new Context(new Division());
		System.out.println("Division : " + context.executeStrategy(10.0, 2.5));
		
		Context context2 =new Context(new Sum());
		System.out.println("Sum :" + context2.executeStrategy(5.0, 7.5));
		
		Context context3 =new Context(new Multiply());
		System.out.println("Multiply : " + context3.executeStrategy(10.2, 3.7));
	}

}
