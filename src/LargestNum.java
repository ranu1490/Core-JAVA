public class LargestNum{
	public static void main(String[] args){
		int[] arr ={1, 3, 9, 7, 5};
		System.out.println(LargestNum.largestNum(arr));
	}
	
	public static int largestNum(int[] arr){

		int max = -1, secondMax=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				secondMax=max;
				max=arr[i];
			}
			if(arr[i]>secondMax && arr[i]!=max){
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
}