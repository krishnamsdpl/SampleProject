
public class ReversString {

	
	public static void main(String[] args) {
		
		String str="Krishna";
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length()-1;i++){
			sb.append(str.charAt(i));
			System.out.println("sb "+sb);
		}
	}
}
