package com.snemmani.dsalgo.ds.trees;

public class AVLTree extends BinaryTree {
    public AVLTree(int key) {
        super(key);
    }

    @Override
    public void insert(int key) {
        this.setRoot(insert(key, this.getRoot()));
    }

    private Node insert(int key, Node node) {
        if ( node == null) {
            return new Node(key);
        }

        if ( node.getKey() > key ) {
            node.setLeft(insert(key, node.getLeft()));
        } else if ( node.getKey() < key ) {
            node.setRight(insert(key, node.getRight()));
        } else {
            return node;
        }

        node.setHeight(max(node.getLeft() != null ? node.getLeft().getHeight() : 0, node.getRight() != null ? node.getRight().getHeight() : 0) + 1);
        int balance = getBalance(node);

        if ( balance >= 1 && key < node.getLeft().getKey() ) {
            return rightRotation(node);
        } else if ( balance <= -1 && key > node.getRight().getKey() ) {
            return leftRotation(node);
        } else if ( balance >= 1 && key > node.getLeft().getKey() ) {
            node.setLeft(leftRotation(node.getLeft()));
            return rightRotation(node);
        } else if ( balance <= -1 && key < node.getRight().getKey() ) {
            node.setRight(rightRotation(node.getRight()));
            return leftRotation(node);
        }
        return node;
    }

    private int getBalance(Node node) {
        if ( node == null ) {
            return 0;
        }

        return calculateHeight(node.getLeft()) - calculateHeight(node.getRight());
    }

    private Node leftRotation(Node node) {
        Node newParent = node.getRight();
        node.setRight(newParent.getLeft());
        newParent.setLeft(node);
        newParent.setHeight(max(calculateHeight(newParent.getLeft()), calculateHeight(newParent.getRight())) + 1);
        node.setHeight(max(calculateHeight(node.getLeft()), calculateHeight(node.getRight())) + 1);
        return newParent;
    }

    private Node rightRotation(Node node) {
        Node newParent = node.getLeft();
        node.setLeft(newParent.getRight());
        newParent.setRight(node);
        newParent.setHeight(max(calculateHeight(newParent.getLeft()), calculateHeight(newParent.getRight())) + 1);
        node.setHeight(max(calculateHeight(node.getLeft()), calculateHeight(node.getRight())) + 1);
        return newParent;
    }

    private int calculateHeight(Node node) {
        if ( node == null ) {
            return 0;
        }
        return node.getHeight();
    }

    private int max(int height1, int height2) {
        return (height1 > height2) ? height1 : height2;
    }
}
