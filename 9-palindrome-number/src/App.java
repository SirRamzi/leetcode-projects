public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome(123));
    }

    public static boolean isPalindrome(int x) {
        try {
            return x == Integer.parseInt(new StringBuilder(Integer.toString(x)).reverse().toString());
        } catch (Exception e) {
            return false;
        }
    }
}
