public class App {
    public static void main(String[] args) throws Exception {
        String s = "   fly me   to   the moon  ";
        System.out.println(Solution.lengthOfLastWord(s));
    }
}

class Solution {
    public static int lengthOfLastWord(String s) {
        int wordLength = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                wordLength++;
            } else if(wordLength == 0) {
                continue;
            } else {
                break;
            }
        }
        return wordLength;
    }
}
