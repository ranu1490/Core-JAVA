public class CountVowelsFromString{
	public static void main(String[] args){
		String s = "I live in India";
		System.out.println(CountVowelsFromString.countVowels(s));
	}
	
	public static int countVowels(String s){
		
		String v = "aeiouAEIOU";
		int count=0;
		int i=0;
		while(i<s.length()){
			char c= s.charAt(i);
			if(v.contains(String.valueOf(c))){
				count++;
			}
			i++;
		}
		return count;
	}
}