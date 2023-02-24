
public class Test1 {
	/**
	 * 
	 * Find the longest common prefix.
		String arr[] = {“flower”, “flow”, “flight”};
		Output: “fl”

	 */
	
	public static void main(String[] args) {
		String[] strArray = {"flower", "flow", "flight"};
		String commanPrefix = "";
		int count = 0;
		
	    String shortestString = strArray[0];;
	    
	    for(int i = 1; i< strArray.length; i++) {
	    	if(strArray[i].length() < shortestString.length()) {
	    		shortestString = strArray[i];
	    	}
	    }
	    
	    
	  //  System.out.println(shortestString);
		
		for(int i = 0; i<shortestString.length(); i++) {
				count = 0;
			   for(int j = 0 ; j< strArray.length; j++) {
				   if(shortestString.charAt(i) == strArray[j].charAt(i)) {
						count++;
					}		
			   }
			   if(count == strArray.length) {
				   commanPrefix += shortestString.charAt(i);
			   }
			   
		}
		 System.out.println(commanPrefix);
		
		
		
		//System.out.println(commanPrefix);
	}

}
