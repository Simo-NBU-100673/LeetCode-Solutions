public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        System.out.println(root);
        System.out.println();
        System.out.println(new Solution().inorderTraversal(root));
    }
}