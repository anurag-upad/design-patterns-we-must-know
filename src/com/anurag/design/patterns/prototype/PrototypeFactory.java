package com.anurag.design.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	
	public static Map<ModelType,Prototype> prototypes=new HashMap<>();
	
	static{
		prototypes.put(ModelType.MOVIE, new Movie()); // Prototype instances
		prototypes.put(ModelType.ALBUM, new Album());
		prototypes.put(ModelType.SHOW, new Show());
	}
	
	public static Prototype getInstance(ModelType modelType) throws CloneNotSupportedException{
		return ((Prototype)prototypes.get(modelType)).clone();
	}

}
