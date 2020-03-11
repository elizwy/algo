package com.zwy.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class SimpleTree {

    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result=new ArrayList<>();
        preorder(root,result);
        return result;
        }
    public void preorder(TreeNode root,List<Integer> result){
            if(root==null){
                return ;
            }
            result.add(root.val);
            preorder(root.left,result);
            preorder(root.right,result);
        }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x,TreeNode left,TreeNode right) {
        val = x;
        this.left=left;
        this.right=right;
    }
}
