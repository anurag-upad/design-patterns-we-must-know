package com.anurag.design.patterns.prototype;

public class Album implements Prototype {

	@Override
	public Album clone() throws CloneNotSupportedException {
		System.out.println("Cloning Album object...");
		return (Album) super.clone();
	}
	
	@Override
	public String toString() {
		return ModelType.ALBUM.name();
	}
}
