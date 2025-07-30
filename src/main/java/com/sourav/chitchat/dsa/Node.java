package com.sourav.chitchat.dsa;

/**
 * Created by souravkumarchowhan on 15/07/2025
 *
 * @author : souravkumarchowhan
 * @Date : 15/07/2025
 * @File : {@link Node}
 */
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRes(root, data);
    }

    public Node insertRes(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertRes(root.left, data);
        } else {
            root.right = insertRes(root.right, data);
        }
        return root;
    }
    public void inOrder() {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
