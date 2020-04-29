package prac_java8;

public class Test {

	public static void main(String[] args) {
		
		Boolean flag;
		String s = new String("Akhil");
		String s2 = "Akhil";
		String s1 = new String("Akhil");
		flag = s.equals(s2);
		
		s2 =s;
		System.out.println(flag);
		
		if(s.equals(s1))
		{
			System.out.println("hiii");
		}
		

	}

}
