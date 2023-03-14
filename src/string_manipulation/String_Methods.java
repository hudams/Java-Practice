package string_manipulation;

public class String_Methods {
	public static void main(String[] args) {
		
		String str = "John, Jennie, Jim, Jack, Joe";
		System.out.println("Str is: " + str);
		
		int len = str.length();
		System.out.println("Length of the str is: " + len);
		System.out.println(str.charAt(0) + " | " + str.charAt(len - 1));
		
		String s1 = str.toUpperCase();
		System.out.println("String after uppper case is: " + s1);
		
		String s2 = str.toLowerCase();
		System.out.println("String after lower case is: " + s2);
		
		if(str.contains("Jim")) {
			System.out.println("Jim is in the string.");
		}
		
		String s3 = str.substring(5);
		System.out.println("S3 is: " + s3);
		
		String s4 = str.substring(6, 9); // last index is (N-1) (10-1) = 9;
		System.out.println("S4 is: " + s4);
		
		String s5 = str.replace('J', 'K');
		System.out.println("S5 is: " + s5);
		
		char[] chArr = str.toCharArray();
		for(char ch: chArr) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		String[] strArr = str.split(",");
		for(String st: strArr) {
			System.out.println(st.trim());
		}
	}

}
