package com.snemmani.dsalgo.ds.trees;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BinaryTreeTest {
    @Test
    public void testTreeCreation() {
        BinaryTree binaryTree = new BinaryTree(2);
        assert binaryTree.getRoot().getKey() == 2;

        binaryTree.getRoot().setLeft(new Node(3));
        binaryTree.getRoot().setRight(new Node(4));

        assert binaryTree.getRoot().getLeft().getKey() == 3;
        assert binaryTree.getRoot().getRight().getKey() == 4;
    }
}
