
public class A {
	static void hello(){System.out.println("a");};

	{System.out.println("abc");}
	
	static int x;
	
	static {
		
		x++;

		System.out.println(x);
		
	}


	public static void main(String[] args) {
		
		A a = new B();
		
		a.hello();
	}

}

