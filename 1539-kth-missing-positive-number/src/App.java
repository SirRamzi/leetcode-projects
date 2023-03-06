public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {8, 11, 13, 18, 21, 22};
        System.out.println(Solution.findKthPositive(arr, 15));
    }
}

class Solution {
    public static int findKthPositive(int[] arr, int k) {
        int i = 0;
        int elem = 1;
        int missingCount = 0;
        while (missingCount != k) {
            if (i < arr.length) {
                if (elem != arr[i]) {
                    missingCount++;
                    elem++;
                } else {
                    i++;
                    elem++;
                }
            } else {
                missingCount++;
                elem++;
            }
        }
        return --elem;
    }
}