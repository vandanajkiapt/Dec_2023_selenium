package SileniumPractice;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //reverse a string 
			String str = "Hello, World!";
            String reversed2 = "";
	      
	        for (int l = str.length() - 1; l >= 0; l--) {
	            reversed2 += str.charAt(l);
	        }
	        System.out.println(reversed2);
		
		
	String msg = "This is my first java code i m happy  12345";  
	
	System.out.println(msg.indexOf("java"));
	
	System.out.println(msg.indexOf("i"));
	
	System.out.println(msg.indexOf("i" , 3));
	
	//System.out.println(msg.indexOf("i" , msg.indexOf("i")+1))
	        
	  String pop = "javaScript;java;ruby;python"; 
	  
	  String arr[] = pop.split(";");
	  
	  for(int j =0;j< arr.length ; j++ ) {
		  
	  System.out.println(arr[j]);
	  
	}

	  
   String ran = msg.replaceAll("\\D+","");
   
   String ran1 = msg.replaceAll("\\s+","");
   
   System.out.println(ran1);
 
   
   String s = "kaavaya";

   String sb ="" ;
   
   boolean[] seen = new boolean [256];

   // Traverse through all characters
   for (int l = 0; l < s.length(); l++) {
       char d = s.charAt(l);

       // Check if s[i] is present before it  
       
       if (!seen[d]) {
       
    	   sb += d ;
           seen[d] = true;
       }
   }	
   
   
   System.out.println(sb);
   
	}
}
