package validparentheses;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args){
        System.out.println(isValid("()")); // Expected: true
        System.out.println(isValid("()[]{}")); // Expected: true
        System.out.println(isValid("(]")); // Expected: false
        System.out.println(isValid("([)]")); // Expected: false
        System.out.println(isValid("{[]}")); // Expected: true
    }

    public static boolean isValid(String s) {
        Deque<Character> characterStack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                characterStack.addFirst(')');
            else if (c == '{')
                characterStack.addFirst('}');
            else if (c == '[')
                characterStack.addFirst(']');
            else if (characterStack.isEmpty() || characterStack.removeFirst() != c)
                return false;
        }
        return characterStack.isEmpty();
    }
}
