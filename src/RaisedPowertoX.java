public class RaisedPowertoX{
	public static void main(String[] args){
		int x=2,n=3;
		System.out.println(RaisedPowertoX.raisedPwr(x,n,x));
	}
	
	public static int raisedPwr(int x,int n, int y){
		
		if(n<=1)
			return x;
			
		return raisedPwr(x*y,n-1,y);	
	}

}