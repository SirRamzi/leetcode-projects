public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Solution.numberOfSteps(14));
    }
}

class Solution {
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 != 0) {
                num--;
            } else {
                num /= 2;
            }
            count++;
        }
        return count;
    }
}