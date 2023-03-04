import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] digits = { 4, 3, 2, 1 };
        System.out.println(Arrays.toString(Solution.plusOne(digits)));
    }
}

class Solution {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
