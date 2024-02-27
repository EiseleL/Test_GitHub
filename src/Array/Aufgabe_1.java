package Array;

public class Aufgabe_1 {
	
	
	
	public static void main(String[] args) {
		
		int[] dailyGains = { 1000, 2000, 500, 9000, 9010};
		System.out.println("Es gab: " + count5PercentJumps(dailyGains) + "5% Jamps" );
		}
	
		private static int count5PercentJumps(int[] dailyGains) {
			if(dailyGains == null) {
				System.err.println("Array ist LEER");
				return -1;
			}else {
				int sum = 0;
				for(int i = 0; i < dailyGains.length; i++) {
					double a = dailyGains[i];
					double b = dailyGains[i+1];
					
					 if(b > (a*0.05)) {
						 sum += 1;
					 }	
				}
				return sum;
			}
		}
		
		
}
