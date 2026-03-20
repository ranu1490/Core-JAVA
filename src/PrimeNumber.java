public class PrimeNumber{
	public static void main(String[] args){
		int x=2,n=10;
		PrimeNumber.primeNum(x,n);
	}
	
	public static void primeNum(int x,int n) {

		for (int i = x; i <= n; i++) {

			if (PrimeNumber.calculatePrime(i)) {
				System.out.println(i);
			}
		}
    }
	
	public static boolean calculatePrime(int x){
		int count=0;
		for(int i=1;i<=x;i++){
			if(x%i==0){
				count++;
			}
		}
		if(count==2)
			return true;
		else 
			return false;
	}

}