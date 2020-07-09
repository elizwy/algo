package com.zwy.leetcode.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SimpleTreeTest {

    @Test
    public void preorderTraversal() {
        SimpleTree simpleTree = new SimpleTree();
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, new TreeNode(5, null, new TreeNode(6, null, null)), null)), null);
        simpleTree.preorderTraversal(treeNode).forEach(System.out::println);
    }
    @Test
    public void preorderTraversalWhenRootIsNull() {
        SimpleTree simpleTree = new SimpleTree();
        List<Integer> result = simpleTree.preorderTraversal(null);
        assertTrue(result.size()==0);

    }
}