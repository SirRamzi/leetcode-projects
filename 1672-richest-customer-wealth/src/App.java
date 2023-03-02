public class App {
    public static void main(String[] args) throws Exception {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(Solution.maximumWealth(accounts));
    }
}

class Solution {
    public static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int tempWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                tempWealth += accounts[i][j];
            }
            if (tempWealth > wealth) {
                wealth = tempWealth;
            }
            tempWealth = 0;
        }
        return wealth;
    }
}