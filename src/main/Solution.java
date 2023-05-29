package main;
//ROMAN TO INTEGER
/*Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/
public class Solution {
	
	int values(String s) {
		
		if(s.equals("I"))
			return 1;
		if(s.equals("V"))
			return 5;
		if(s.equals("X"))
			return 10;
		if(s.equals("L"))
			return 50;
		if(s.equals("C"))
			return 100;
		if(s.equals("D"))
			return 500;
		if(s.equals("M"))
			return 1000;
		return -1;
	}
	
	int romanToInteger(String s) {
		int result = 0;
		

		for (int i = 0; i < s.length(); i++) {

			int valor1 = values(String.valueOf(s.charAt(i)));// obtengo el primer valor

			if (i + 1 < s.length()) {
				int valor2 = values(String.valueOf(s.charAt(i + 1)));

				if (valor1 >= valor2) {
					result += valor1;
				} else {
					result += valor2 - valor1;
					i++;
				}
			} else {
				result += valor1;
			}
			

		}

		return result;

	}
}
