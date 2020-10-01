package com.snemmani.dsalgo.ds.trees;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

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
        assertEquals(this.testTree.getRoot().getLeft().getKey(), 1);
        assertEquals(this.testTree.getRoot().getRight().getRight().getKey(), 4);
    }

    @Test
    public void testTreeSearch() {
        assertEquals(this.testTree.search(3), this.testTree.getRoot().getRight());
        assertEquals(this.testTree.search(4), this.testTree.getRoot().getRight().getRight());
        assertNull(this.testTree.search(8));
    }

    @Test
    public void testInOrderTraverse() {
        assertEquals(this.testTree.inOrderTraverse(), "1 2 3 4");
    }

    @Test
    public void testPreOrderTraverse() {
        assertEquals(this.testTree.preOrderTraverse(), "2 1 3 4");
    }

    @Test
    public void testPostOrderTraverse() {
        assertEquals(this.testTree.postOrderTraverse(), "1 4 3 2");
    }

    @Test
    public void testEmptyConstructor() {
        assertNull(new BinaryTree().getRoot());
    }
}
