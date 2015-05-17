
public class PrintPrimes {
	public static void main(String[] args) {
		int n = 0;
		System.out.println("Print primes from 100 - 200");
		outer: for (int i=101; i<200; i+=2){
			for (int j=2; j<i ; j++){
				if (i%j==0)
					continue outer;	
			}
			System.out.print(" "+i);
			n++;
			if (n<10)
				continue;
			System.out.println("");
			n=0;
		}
	}

}
