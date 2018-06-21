package problems2;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gcp = sc.next();
		sc.close();
		ArrayList<String> list = new ArrayList<>();
		String[] L = gcp.split("");
		int num = L.length;
		for(int i = 0;i < num;i++) {
			list.add(L[i]);
		}
		
		ListIterator<String> it = list.listIterator();
		String now = it.next();
		String next;
		while(it.hasNext()){
			int i = 0;
			next = it.next();
			if(now.equals("G")&&next.equals("C")) {
				it.remove();
				it.previous();
				it.remove();
				next = it.toString();
				i = 1;
			
			}else if(now.equals("C")&&next.equals("P")) {
					it.remove();
					it.previous();
					it.remove();
					next = it.toString();
				i = 1;
			}else if(now.equals("P")&&next.equals("G")) {
					it.remove();
					it.previous();
					it.remove();
					next = it.toString();
					i = 1;
			}
			if (i == 1)while(it.hasPrevious())it.previous();
			
			now = next;
			
		}
		int i = list.size();
		System.out.println(i);
		
	}

}

