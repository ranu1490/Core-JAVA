public class CheckAnagram{
	public static void main(String[] args){
		String s1= "anagram";
		String s2= "nagramp";
		System.out.println(CheckAnagram.checkAnagram(s1,s2));
	}
	
	public static boolean checkAnagram(String s1, String s2){
		
		if(s1.length() !=s2.length()){
			return false;
		}
		
		boolean res= false;

			for(int j=0;j<s2.length();j++){
				if(s1.contains(String.valueOf(s2.charAt(j))))
						res=true;
				else
					return false;
			}
		return res;
	}
}