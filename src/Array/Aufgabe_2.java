package Array;

public class Aufgabe_2 {

	public static void main(String[] args) {
		
		String[] signs1 = {"F","DO","MO","MO","MO","MO","WES"};
		System.out.println(isProbablyApproaching(signs1));

	}
	
	public static boolean isProbablyApproaching(String[] signs) {
		
		for(int i = 0; i < signs.length;i++) {
				if(signs[i].equals(signs[i+1]) && signs[i+1].equals(signs[i+2]) && signs[i+2].equals(signs[i+3])) {
					return true;	
			}
		}
		return false;
	}
	

}
