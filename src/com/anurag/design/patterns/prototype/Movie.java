package com.anurag.design.patterns.prototype;

public class Movie implements Prototype {

	@Override
	public Movie clone() throws CloneNotSupportedException {
		System.out.println("Cloning Movie object...");
		return (Movie) super.clone();
	}
	
	@Override
	public String toString() {
		return ModelType.MOVIE.name();
	}
}
