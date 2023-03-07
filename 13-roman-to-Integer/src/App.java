public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Solution.romanToInt("LVIII"));
    }
}

class Solution {
    public static int romanToInt(String s) {
        int sum = 0;
        int leftNum;
        int rightNum = convertRomanToNumber(s.charAt(0));
        for (int i = 0; i < s.length() - 1; i++) {
            leftNum = rightNum;
            rightNum = convertRomanToNumber(s.charAt(i + 1));
            if (rightNum <= leftNum) {
                sum += leftNum;
            } else {
                sum -= leftNum;
            }
        }
        sum += rightNum;
        return sum;
    }

    private static int convertRomanToNumber(char ch) {
        int number = -1;
        switch (ch) {
            case 'I':
                number = 1;
                break;
            case 'V':
                number = 5;
                break;
            case 'X':
                number = 10;
                break;
            case 'L':
                number = 50;
                break;
            case 'C':
                number = 100;
                break;
            case 'D':
                number = 500;
                break;
            case 'M':
                number = 1000;
                break;
            default:
                break;
        }
        return number;
    }
}
