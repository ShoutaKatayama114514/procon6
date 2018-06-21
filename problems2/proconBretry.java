package problems2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class proconBretry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gcp = sc.nextLine();
		sc.close();
		Deque<Character> q = new ArrayDeque<Character>();
		
		int count=0;
		while(count<gcp.length()) {
			
			if(q.size()==0) { 
				q.push(gcp.charAt(count));
			}else if(q.getFirst()=='G'&&gcp.charAt(count)=='C') {
				q.pop();
			}else if(q.getFirst()=='C'&&gcp.charAt(count)=='P') {
				q.pop();
			}else if(q.getFirst()=='P'&&gcp.charAt(count)=='G') {
				q.pop();
			}else {
				q.push(gcp.charAt(count));
			}
			
			count++;
		}
		
		System.out.println(q.size());
		
	}
}
