/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>>res = new ArrayList<>();
        if(root==null)return res;
        q.add(root);
        boolean left = true;
        while(!q.isEmpty()){
            int lvlsize = q.size();
            List<Integer> l = new ArrayList<>();
            

            while(lvlsize!=0){
                TreeNode temp = q.poll();
                l.add(temp.val);
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                lvlsize--;

            }
            if(!left){
                Collections.reverse(l);
            }

           res.add(l);
           left=!left;
        }
return res;
    }

}