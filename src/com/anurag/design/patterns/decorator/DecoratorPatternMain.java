package com.anurag.design.patterns.decorator;

/**
 * Design pattern which adds new features or enhances functionality of existing objects of a class
 * dynamically as and when required.
 * There is a Component interface
 * there is a ConcreteComponent class which implements Component and
 * there is a Decorator class which implements Component too and maintains a ref to component
 * Example :BufferedOuputStream is Decorator around OutputStream; which adds Buffer feature
 * to store chunks of data and write in one go; 
 * also read operations are done from buffer and not from main memory, so it's fast.
 */
public class DecoratorPatternMain {
	
	public static void main(String[] args) {
		Message msg = new TextMessage("My name is Anurag Upadhyay");
		System.out.println(msg.getContent());
		
		Message msgDec = new MessageDecorator(msg);
		System.out.println(msgDec.getContent());
	}

}
