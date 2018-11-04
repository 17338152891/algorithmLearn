package com.learn;

import java.util.Iterator;

public class BinarySearchTrees implements Iterable {

    private Node root;

    public void insert(Comparable value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insert(value, root);
        }
    }

    private void insert(Comparable value, Node root) {
        Node node = new Node(value);
        if (value.compareTo(root.value) <= 0) {
            if (root.left == null) {
                root.left = node;
            } else {
                insert(value, root.left);
            }
        } else {
            if (root.reght == null) {
                root.reght = node;
            } else {
                insert(value, root.reght);
            }
        }
    }

    public void theInOrderTraversal(Node root) {  //中序遍历
        if (root.left != null) {
            theInOrderTraversal(root.left);
        }
        System.out.println(root.value);
        if (root.reght != null) {
            theInOrderTraversal(root.reght);
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    public static void main(String[] args) {
        BinarySearchTrees bst = new BinarySearchTrees();
        bst.insert(8);
        bst.insert(3);
        bst.insert(5);
        bst.insert(9);
        bst.insert(6);
        bst.insert(11);
        bst.insert(1);
        bst.theInOrderTraversal(bst.root);

    }

    class Node {
        Comparable value;
        Node left;
        Node reght;

        public Node(Comparable value) {
            this.value = value;
        }
    }
}
