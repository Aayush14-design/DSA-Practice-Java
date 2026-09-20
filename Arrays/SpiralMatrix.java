public class SpiralMatrix {
    int[][] spiralMatrix(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int ans[][] = new int[n][m];
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;
        while (top <= bottom && left <= right) {
            // right
            for (int i = left; i <= right; i++) {
                ans[top][i] = arr[top][i];
            }
            top++;
            //bottom
            for (int i = top; i <= bottom; i++) {
                ans[i][bottom] = arr[i][bottom];
            }
            right--;
            //left
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    ans[bottom][i] = arr[bottom][i];
                }
                bottom--;
            }
            //top
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = arr[i][left];
                }
                left++;
            }
        }
        return ans;
    }
}
