public class RemoveSpaces{
	public static void main(String[] args){
		String s= "I live in India";
		System.out.println(RemoveSpaces.removeSpaces(s));
	}
	
	public static String removeSpaces(String s){
		
		String[] splitString = s.split(" ");
		StringBuilder str = new StringBuilder();
		int i=0;
		while(i<splitString.length){
			str.append(splitString[i]);
			i++;
		}
		
		return str.toString();
	}
}