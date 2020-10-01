package com.snemmani.dsalgo.ds.trees;

public class BinaryTree {
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

    protected void setRoot(Node node) { this.root = node; }
    
    public void insert(int key) {
        insert(key, root);
    }

    private Node insert(int key, Node node) {
        if ( node == null) {
            return new Node(key);
        }

        if ( node.getKey() > key ) {
            node.setLeft(insert(key, node.getLeft()));
        } else {
            node.setRight(insert(key, node.getRight()));
        }

        return node;
    }

    
    public Node search(int key) {
        return search(key, root);
    }

    private Node search(int key, Node node) {
        if ( node == null ) {
            return null;
        }

        if ( node.getKey() == key ) {
            return node;
        } else if ( node.getKey() < key ) {
            return search(key, node.getRight());
        } else {
            return search(key, node.getLeft());
        }
    }

    
    public String preOrderTraverse() {
        return preOrderTraverse(root);
    }

    private String preOrderTraverse(Node node) {
        if ( node == null) return "";

        String traverse = "";
        traverse += node.getKey() + " ";
        if ( node.getLeft() != null )
            traverse += preOrderTraverse(node.getLeft()) + " ";
        if ( node.getRight() != null )
            traverse += preOrderTraverse(node.getRight()) + " ";
        return traverse.trim();
    }

    
    public String inOrderTraverse() {
        return inOrderTraverse(root);
    }

    private String inOrderTraverse(Node node) {
        if ( node == null ) {
            return "";
        }
        String traverse = "";
        traverse += inOrderTraverse(node.getLeft()) + " ";
        traverse += node.getKey() + " ";
        traverse += inOrderTraverse(node.getRight()) + " ";
        return traverse.trim();
    }

    
    public String postOrderTraverse() {
        return postOrderTraverse(root);
    }

    private String postOrderTraverse(Node node) {
        if ( node == null) return "";

        String traverse = "";
        if ( node.getLeft() != null )
            traverse += postOrderTraverse(node.getLeft()) + " ";
        if ( node.getRight() != null )
            traverse += postOrderTraverse(node.getRight()) + " ";
        traverse += node.getKey() + " ";
        return traverse.trim();
    }
}
