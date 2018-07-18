import java.util.HashSet;
import java.util.Set;

public class FirstRecurringCharacter {

	public static void main(String[] args) {
		String s = "ABCDEFGHIJ";
		
		
		System.out.println(findFirstRecurringCharacter(s));
		
	}

	private static Character findFirstRecurringCharacter(String s) {
		Character firstRecurring = null;
		Set<Character> set = new HashSet<>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			if (set.contains(s.charAt(i))) {
				firstRecurring = s.charAt(i);
				break;
			} else {
				set.add(s.charAt(i));
			}
		}
		
		return firstRecurring;
	}

}
