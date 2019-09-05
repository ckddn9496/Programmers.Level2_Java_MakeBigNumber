import java.util.Collections;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
//		String number = "1924";
//		int k = 2; // return 94
		
		String number = "9999";
		int k = 2;
		
//		String number = "1231234";
//		int k = 3; // return 3234
		
//		String number = "4177252841";
//		int k = 4; // return 775841
		
		System.out.println(new Solution().solution(number, k));
	}

}

class Solution {
    public String solution(String number, int k) {
    	Stack<Character> s = new Stack<>();
    	int finalIdx = 0;
    	for (int i = 0; i < number.length(); i++) {
    		char tok = number.charAt(i);
    		finalIdx = i;
    		if (s.isEmpty())
    			s.push(tok);
    		else { // !s.isEmpty()
    			if (s.peek() < tok) {
    				s.pop();
    				k--;
    				if (k == 0) break;
    				while (!s.isEmpty() && s.peek() < tok) {
						s.pop();
						k--;
						if (k == 0) break;
    				}
    				
    				if (k == 0) break;

    				s.push(tok);
    			} else {
    				s.push(tok);
    			}
    		}
    	}
    	if (k == 0) {
    		Collections.reverse(s);
	    	String str = "";
	    	while (!s.isEmpty()) {
	    		str += s.pop();
	    	}
	    	
	        return str+number.substring(finalIdx);
    	} else {
    		for (int i = 0; i < k; i++)
    			s.pop();
    		Collections.reverse(s);
    		String str = "";
	    	while (!s.isEmpty()) {
	    		str += s.pop();
	    	}
	    	return str;
    	}
    	
    }
}