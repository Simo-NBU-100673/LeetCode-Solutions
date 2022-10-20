import java.util.ArrayList;
import java.util.List;

/**
 * Created By: Simeon Popov
 * Date: 20.10.2022 г.
 * Time: 2:02
 * Project Name: Same Tree
 */

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // p and q are both null
        if (p == null && q == null) return true;

        // one of p and q is null
        if (q == null || p == null) return false;

        //not equal values of two nodes
        if (p.val != q.val) return false;

        //This problem is approached using the method divide and conquer
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
