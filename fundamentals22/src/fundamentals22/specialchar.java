package fundamentals22;

public class specialchar {

	public static void main(String[] args) {
		char ch='a';
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.println("Alphabet");
		}
		else if(ch<='0'&&ch<='9') {
			System.out.println("Digits");	
		}
		else {
			System.out.println("Special characters");	
		}

	}

}
