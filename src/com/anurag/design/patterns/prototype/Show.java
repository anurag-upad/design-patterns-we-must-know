package com.anurag.design.patterns.prototype;

public class Show implements Prototype {

	@Override
	public Show clone() throws CloneNotSupportedException {
		System.out.println("Cloning Show object...");
		return (Show) super.clone();
	}
	
	@Override
	public String toString() {
		return ModelType.SHOW.name();
	}

}
