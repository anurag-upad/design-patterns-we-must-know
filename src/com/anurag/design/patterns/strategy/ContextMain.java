package com.anurag.design.patterns.strategy;

public class ContextMain {
	
	public static void main(String[] args) {
		Context context=new Context(new AddOperation());
		int result=context.executeStrategy(5, 12);
		System.out.println("Adding 5 and 12 = "+result);
		
		Context context2=new Context(new SubtractOperation());
		int result2=context2.executeStrategy(5, 12);
		System.out.println("Subtracting 5 and 12 = "+result2);
		
		Context context3=new Context(new MultiplyOperation());
		int result3=context3.executeStrategy(5, 12);
		System.out.println("Multiplying 5 and 12 = "+result3);
	}
}
