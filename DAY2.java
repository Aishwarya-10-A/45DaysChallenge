/*Problem statement
You are given two positive integers 'n' and 'm'. You have to return the 'nth' root of 'm', i.e. 'm(1/n)'. If the 'nth root is not an integer, return -1.



Note:
'nth' root of an integer 'm' is a number, which, when raised to the power 'n', gives 'm' as a result.


Example:
Input: ‘n’ = 3, ‘m’ = 27

Output: 3

Explanation: 
3rd Root of 27 is 3, as (3)^3 equals 27.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
3 27


Sample Output 1:
3 */

/*import java.util.*;
public class DAY2 {
    public static int NthRoot(int n, int m) {
        int low = 1;
        int high = m;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long midPowN = (long) Math.pow(mid, n);
            
            if (midPowN == m) {
                return mid;
            } else if (midPowN < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return -1;
    }
}*/
/*QUESTION2:
Problem statement
Given a square binary matrix ‘mat[n][n]’, find ‘K’ such that all elements in the Kth row are ‘0’ and all elements in the Kth column are ‘1’. The value of mat[k][k] can be anything (either ‘0’ or ‘1’). If no such k exists, return ‘-1’.

For example
Consider the following matrix :
0 1 1 
0 1 0 
1 1 0 

You can see that row 1 (0-based) contains all 0’s except mat[1][1] and column 1 contains all 1’s. Hence the answer for the above case is 1.
 * 
 */
/*import java.util.*;
public class DAY2 {
    public static int findRowK(int[][] mat) {
        int n = mat.length;
        
        for (int k = 0; k < n; k++) {
            boolean isRowValid = true;
            boolean isColValid = true;
            
            for (int j = 0; j < n; j++) {
                if (mat[k][j] != 0 && (j != k)) {
                    isRowValid = false;
                    break;
                }
            }
            
            if (isRowValid) {
                for (int i = 0; i < n; i++) {
                    if (mat[i][k] != 1 && (i != k)) {
                        isColValid = false;
                        break;
                    }
                }
            } else {
                continue;
            }
            
            if (isColValid) {
                return k;
            }
        }
        
        return -1;
    }
}*/

