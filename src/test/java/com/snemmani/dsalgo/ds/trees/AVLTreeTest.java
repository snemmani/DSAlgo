package com.snemmani.dsalgo.ds.trees;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class AVLTreeTest {
    private AVLTree testTree = null;

    public AVLTree createTree() {
        AVLTree avlTree = new AVLTree(2);
        avlTree.insert(3);
        avlTree.insert(4);
        avlTree.insert(1);
        avlTree.insert(5);
        return avlTree;
    }

    @Before
    public void setUp() {
        this.testTree = createTree();
    }

    @Test
    public void testTreeCreation() {
        assertEquals(this.testTree.getRoot().getKey(), 4);
        assertEquals(this.testTree.getRoot().getLeft().getKey(), 2);
        assertEquals(this.testTree.getRoot().getLeft().getLeft().getKey(), 1);
        assertEquals(this.testTree.getRoot().getLeft().getRight().getKey(), 3);
        assertEquals(this.testTree.getRoot().getRight().getKey(), 5);
    }
}
