package com.anurag.design.patterns.prototype;

/**
 * There are times when we have a complex object that is costly to create.
 * Say, object creation process requires some complex calculations or use of external resources.
 * In such cases, to create more instances of such class, we use an existing instance,
 * known as prototype(template), to make its copies using clone method, thereby saving us from 
 * recreating objects from scratch. 
 */
public class PrototypePatternMain {
	
	public static void main(String[] args) {
		try {
			System.out.println(PrototypeFactory.getInstance(ModelType.MOVIE));
			System.out.println(PrototypeFactory.getInstance(ModelType.SHOW));
			System.out.println(PrototypeFactory.getInstance(ModelType.ALBUM));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
