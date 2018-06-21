package problems1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sp = sc.next();
		sc.close();
		String[] st = new String [3];
		st = sp.split("");
		if(sp.length() > 2) {
			st[1]= st[1]+st[2];	
		}
		int sum = Integer.parseInt(st[1]);
		
		
		switch(st[0]) {
		case "M":
			sum = sum + 1867;
			System.out.println(sum);
			break;
		case "T":
			sum = sum + 1911;
			System.out.println(sum);
			break;
		case "S":
			sum = sum + 1925;
			System.out.println(sum);
			break;
		case "H":
			sum = sum + 1988;
			System.out.println(sum);
			break;
		default:
			sum = sum + 2018;
			System.out.println(sum);
		}
	}
 
}