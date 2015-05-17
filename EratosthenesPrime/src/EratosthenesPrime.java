
public class EratosthenesPrime {
	public static void main(String[] args) { 
		
		boolean prime[] = new boolean[100];
		prime[0]=prime[1]=false;
                for(int i=2;i<100;i++){prime[i] = true;}
		//Build an array stores info of array

		for(int n=0;n< Math.sqrt(100)+1;n++){
			if (prime[n] == true)
				for(int x=n*n;x<100;x+=n){
					prime[x]=false;
				}		
		}
		//filter out the number which is not prime
                
		for (int j=0;j<100;j++){
		     if (prime[j]==true) System.out.print(" "+j);
		}
        // print out all the primes
	}
}