package com.java.stream.practice;

public class ConnectionSingleton {
	private static ConnectionSingleton INSTANCE;
	
	private ConnectionSingleton() {}
	/**
	 * This implementation uses lazy initialization, 
	 * which means that the instance is created only when it is needed. 
	 * The first time the getInstance() method is called, 
	 * it creates an instance of the Singleton class and stores it in the instance variable.
	 *  Subsequent calls to the getInstance() method simply return the stored instance.

		Note that this implementation is not thread-safe, 
		which means that if multiple threads call the getInstance() method simultaneously, 
		it is possible for multiple instances of the Singleton class to be created.
	 * @return
	 */
	
	public static ConnectionSingleton getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new ConnectionSingleton();
		}
		
		return INSTANCE;
	}

}
