public class Main {
    public static void main(String[] args) {
        TreeNode p1 = new TreeNode(1);
        TreeNode p = new TreeNode(1,p1,null);

        TreeNode q1 = new TreeNode(1);
        TreeNode q = new TreeNode(1,null,q1);
        System.out.println(new Solution().isSameTree(p,q));
    }
}