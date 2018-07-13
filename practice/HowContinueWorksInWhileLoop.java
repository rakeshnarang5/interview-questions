package practice;

import java.util.ArrayList;
import java.util.List;

public class HowContinueWorksInWhileLoop {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		
		a.add(-10);
		a.add(-20);
		a.add(-30);
		a.add(40);
		
		int i = 0;
		
		while(i < a.size()) {
			
			if (a.get(i) < 0) {
				i++;
				continue;
			}
			
			System.out.println(a.get(i));
			
			i++;
			
		}
		
	}

}
