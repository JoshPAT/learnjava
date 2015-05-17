
public class Operatortest1 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		print("a  ",a);	
		
	}
	static void print(String prefix, int n) {
		String s = Integer.toBinaryString(n);
		s = prefix + ":" + s;
		while(s.length() < 4) s = "0" +s;
		System.out.println(s);
	}
}
