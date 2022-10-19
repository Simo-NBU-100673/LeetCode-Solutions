import java.util.*;

/**
 * Created By: Simeon Popov
 * Date: 19.10.2022 г.
 * Time: 19:54
 * Project Name: Binary Tree Inorder Traversal
 */

public class Solution {
    //Няма да ползваме рекурсия защото е за слабите така че ще ми се ебе майката for fun
    public List<Integer> inorderTraversal(TreeNode root){

        //created the collection for storing the result
        List<Integer> result = new ArrayList<>();

        if(root==null){
            return result;
        }

        //stack for storing the recursion
        Deque<TreeNode> stack = new ArrayDeque<>();

        TreeNode current = root;

        while (current!=null || !stack.isEmpty()){
            if(current!=null){
                stack.push(current);
                current = current.left;
            }else{
                current = stack.pop();
                result.add(current.val);
                current = current.right;
            }
        }
        return result;
    }
}
