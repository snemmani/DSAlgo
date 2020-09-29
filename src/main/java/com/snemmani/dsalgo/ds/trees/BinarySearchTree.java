package com.snemmani.dsalgo.ds.trees;

public interface BinarySearchTree {
    void insert(int key);

    Node search(int key);

    void preOrderTraverse();

    void inOrderTraverse();

    void postOrderTraverse();
}
