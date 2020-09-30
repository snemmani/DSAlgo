package com.snemmani.dsalgo.ds.trees;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BinaryTreeTest {
    private BinaryTree testTree = null;

    public BinaryTree createTree() {
        BinaryTree binaryTree = new BinaryTree(2);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(1);
        return binaryTree;
    }

    @Before
    public void setUp() {
        this.testTree = createTree();
    }

    @Test
    public void testTreeCreation() {
        assert this.testTree.getRoot().getLeft().getKey() == 1;
        assert this.testTree.getRoot().getRight().getRight().getKey() == 4;
    }

    @Test
    public void testTreeSearch() {
        assert this.testTree.search(3).equals(this.testTree.getRoot().getRight());
        assert this.testTree.search(4).equals(this.testTree.getRoot().getRight().getRight());
        assert this.testTree.search(8) == null;
    }

    @Test
    public void testInOrderTraverse() {
        assert this.testTree.inOrderTraverse().equals("1 2 3 4");
    }

    @Test
    public void testPreOrderTraverse() {
        assert this.testTree.preOrderTraverse().equals("2 1 3 4");
    }

    @Test
    public void testPostOrderTraverse() {
        assert this.testTree.postOrderTraverse().equals("1 4 3 2");
    }

    @Test
    public void testEmptyConstructor() {
        assert new BinaryTree().getRoot() == null;
    }
}
