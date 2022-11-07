package easy.romantointeger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(romanToInt("III")); // Expected: 3
        System.out.println(romanToInt("LVIII")); // Expected: 58
        System.out.println(romanToInt("MCMXCIV")); // Expected: 1994
    }

    @SuppressWarnings("squid:S127")
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int total = 0;
        for (int i = 0; i < chars.length; i++) {
            int left =  singleRomanToInt(chars[i]);
            int right;

            if (i + 1 < chars.length) {
                right = singleRomanToInt(chars[i + 1]);
            } else {
                total += left;
                break;
            }

            if (left < right) {
                total += right - left;
                i++;
            } else {
                total += left;
            }
        }
        return total;
    }

    public static int singleRomanToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Invalid roman numeral: " + c);
        };
    }
}
