package com.anurag.design.patterns.singleton;

import java.io.Serializable;

public class LazySingleton {
	
	private static LazySingleton INSTANCE;
	
	private LazySingleton(){}
	
	public static LazySingleton getInstance(){
		if(INSTANCE == null)
			INSTANCE = new LazySingleton();
		return INSTANCE;
	}

}

class LazySingleton2 {
	
	private static LazySingleton2 INSTANCE;
	
	private LazySingleton2(){}
	
	public static synchronized LazySingleton2 getInstance(){
		if(INSTANCE == null)
			INSTANCE = new LazySingleton2();
		return INSTANCE;
	}
}

class LazySingleton3 {
	
	private static LazySingleton3 INSTANCE;
	
	private LazySingleton3(){}
	
	public static LazySingleton3 getInstance(){
		if(INSTANCE == null){
			synchronized (LazySingleton3.class) {
				INSTANCE = new LazySingleton3();
			}
		}
		return INSTANCE;
	}
}


class LazySingleton4 {
	
	private static LazySingleton4 INSTANCE;
	
	private LazySingleton4(){}
	
	/* Double-checked locking design pattern*/
	public static LazySingleton4 getInstance(){
		if(INSTANCE == null){
			synchronized (LazySingleton4.class) {
				if(INSTANCE == null)
				INSTANCE = new LazySingleton4();
			}
		}
		return INSTANCE;
	}
}

class LazySingleton5 {
	
	private boolean flag = false;
	
	private static volatile LazySingleton5 INSTANCE;
	
	private LazySingleton5(boolean flag){
		this.flag=flag;
	}
	
	/* Double-checked locking design pattern*/
	public static LazySingleton5 getInstance(){
		if(INSTANCE == null){
			synchronized (LazySingleton5.class) {
				if(INSTANCE == null)
				INSTANCE = new LazySingleton5(true);
			}
		}
		return INSTANCE;
	}
}

class LazySingleton6 implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private boolean flag = false;
	
	private static volatile LazySingleton6 INSTANCE;
	
	private LazySingleton6(boolean flag){
		this.flag=flag;
	}
	
	/* Double-checked locking design pattern*/
	public static LazySingleton6 getInstance(){
		if(INSTANCE == null){
			synchronized (LazySingleton6.class) {
				if(INSTANCE == null)
				INSTANCE = new LazySingleton6(true);
			}
		}
		return INSTANCE;
	}
	
	protected Object readResolve(){
		return getInstance();
	}
}