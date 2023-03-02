import java.util.Arrays;
import java.util.Comparator;

public class WeakestRows1337 {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] weakestRows = new int[k];
        int[][] solidersNumber = new int[mat.length][2];
        for (int i = 0; i < solidersNumber.length; i++) {
            solidersNumber[i][0] = i;
            for (int j = 0; j < mat[i].length; j++) {
                solidersNumber[i][1] += mat[i][j];
            }
        }
        Arrays.sort(solidersNumber, Comparator.comparingInt(a -> a[1]));
        for (int i = 0; i < weakestRows.length; i++) {
            weakestRows[i] = solidersNumber[i][0];
        }
        return weakestRows;
    }
}
