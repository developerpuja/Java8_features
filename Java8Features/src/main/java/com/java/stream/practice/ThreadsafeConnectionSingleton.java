package com.java.stream.practice;

public class ThreadsafeConnectionSingleton {
	private static ThreadsafeConnectionSingleton INSTANCE;
	private static Object lock = new Object(); 
	
	private ThreadsafeConnectionSingleton() {}
	
	public static ThreadsafeConnectionSingleton getInstance() {
		if(INSTANCE == null) {
			synchronized (lock) {
				if(INSTANCE == null) {
					INSTANCE = new ThreadsafeConnectionSingleton();
				}
			}
		}
		
		return INSTANCE;
	}

}
