package com.sourav.chitchat.dsa;

import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

/**
 * Created by souravkumarchowhan on 15/07/2025
 *
 * @author : souravkumarchowhan
 * @Date : 15/07/2025
 * @File : {@link BinaryTreeService}
 */
public class BinaryTreeService {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(20);
        binaryTree.insert(30);
        binaryTree.insert(40);
        binaryTree.insert(50);
        binaryTree.insert(60);
        binaryTree.inOrder();
    }
}
