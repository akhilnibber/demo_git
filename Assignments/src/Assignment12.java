
public class Assignment12 {

	public static String  concat1(String s1) 
    { 
        s1 = s1 + "forgeeks"; 
        return s1;
    } 
  
    // Concatenates to StringBuilder 
    public static void concat2(StringBuilder s2) 
    { 
        s2.append("forgeeks"); 
    } 
  
    public static void concat3(StringBuffer s3) 
    { 
        s3.append("forgeeks"); 
    } 
  
    public static void main(String[] args) {
		
		 String s1 = "Geeks"; 
		
	        s1 = concat1(s1);  // s1 is not changed 
	        System.out.println("String: " + s1); 
	  
	        StringBuilder s2 = new StringBuilder("Geeks"); 
	        concat2(s2); // s2 is changed 
	        System.out.println("StringBuilder: " + s2); 
	  
	        StringBuffer s3 = new StringBuffer("Geeks"); 
	        concat3(s3); // s3 is changed 
	        System.out.println("StringBuffer: " + s3);
  
}
	
	
		
	}
//		String a = "one";
//		String b = "one";
//		
//		String d = new String("one");
//		String e = new String("one");
//		boolean c,f;
//		c = (a==b);
//		
//		System.out.println(a.hashCode());
//		System.out.println(b.hashCode());
//		System.out.println(c);

		
