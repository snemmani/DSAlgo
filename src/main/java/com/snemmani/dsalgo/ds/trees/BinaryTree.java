package com.snemmani.dsalgo.ds.trees;

public class BinaryTree implements BinarySearchTree {
    private Node root;

    public BinaryTree(int key) {
        this.root = new Node(key);
    }

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    @Override
    public void insert(int key) {
        insertIntoNode(key, root);
    }

    private void insertIntoNode(int key, Node node) {
        if ( node == null ) {
            node = new Node(key);
        }

        if ( node.getKey() < key ) {
            insertIntoNode(key, node.getLeft());
        } else {
            insertIntoNode(key, node.getRight());
        }
    }

    @Override
    public Node search(int key) {
        return null;
    }

    @Override
    public void preOrderTraverse() {

    }

    @Override
    public void inOrderTraverse() {

    }

    @Override
    public void postOrderTraverse() {

    }
}
