import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int minRow = 0, maxRow = matrix.length - 1;
        int minCol = 0, maxCol = matrix[0].length - 1;

        List<Integer> list = new ArrayList<>();

        while (minRow <= maxRow && minCol <= maxCol) {

            // ✅ Top row
            for (int j = minCol; j <= maxCol; j++) {
                list.add(matrix[minRow][j]);
            }
            minRow++;

            // ✅ Right column
            for (int i = minRow; i <= maxRow; i++) {
                list.add(matrix[i][maxCol]);
            }
            maxCol--;

            // ✅ Bottom row
            if (minRow <= maxRow) {
                for (int j = maxCol; j >= minCol; j--) {
                    list.add(matrix[maxRow][j]);
                }
                maxRow--;
            }

            // ✅ Left column
            if (minCol <= maxCol) {
                for (int i = maxRow; i >= minRow; i--) {
                    list.add(matrix[i][minCol]);
                }
                minCol++;
            }
        }

        return list;
    }
}