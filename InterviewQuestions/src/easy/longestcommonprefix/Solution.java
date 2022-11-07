package easy.longestcommonprefix;

public class Solution {
    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // Expected: "fl"
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"})); // Expected: ""

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String lexographicallyFirst = strs[0];
        String lexographicallyLast = strs[0];
        for (String string : strs) {
            if (lexographicallyFirst.compareTo(string) > 0) {
                lexographicallyFirst = string;
            }
            if (lexographicallyLast.compareTo(string) < 0) {
                lexographicallyLast = string;
            }
        }

        int count = 0;
        for (int i = 0; i < lexographicallyFirst.length(); i++) {
            if (lexographicallyFirst.charAt(count) == lexographicallyLast.charAt(count)) {
                count++;
            }
        }
        return count == 0 ? "" : lexographicallyFirst.substring(0, count);
    }
}
