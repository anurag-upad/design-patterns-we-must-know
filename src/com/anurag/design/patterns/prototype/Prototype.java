package com.anurag.design.patterns.prototype;

public interface Prototype extends Cloneable{

	Prototype clone() throws CloneNotSupportedException;
	
}
