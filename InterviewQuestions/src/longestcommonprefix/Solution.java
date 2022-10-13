package longestcommonprefix;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // Expected: "fl"
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"})); // Expected: ""

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == 0) {
                return "";
            }

            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < strs[i].length(); j++) {
                set.add(strs[j].charAt(i));
            }

        }

        return "";
    }
}
