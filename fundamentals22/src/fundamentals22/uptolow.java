package fundamentals22;

public class uptolow {

	public static void main(String[] args) {
		char ch='B',ch1='b';
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.println(ch1+"->"+ch);
		}

		else if((ch1>='a'&&ch1<='z')||(ch1>='A'&&ch1<='Z')) {
			System.out.println(ch+"->"+ch1);
		}

	}

}
