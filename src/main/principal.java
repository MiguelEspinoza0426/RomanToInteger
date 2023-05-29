package main;

import java.util.HashMap;

// ROMAN TO INTEGER
/*Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/
public class principal {
	

	public static void main(String[] args) {
		String s= "MCMXCIV";                                     
		Solution se = new Solution();
		
		System.out.println(se.romanToInteger(s));
	}
	
}
