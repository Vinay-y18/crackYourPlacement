//set matrix zeros
class Solution {
    public void setZeroes(int[][] matrix) {
         int m = matrix.length;
        int n = matrix[0].length;

        // Step 1: Create boolean arrays to track zeroes
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // Step 2: Identify zeroes and mark corresponding rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 3: Zero out marked rows
        for (int i = 0; i < m; i++) {
            if (rows[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Zero out marked columns
        for (int j = 0; j < n; j++) {
            if (cols[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}