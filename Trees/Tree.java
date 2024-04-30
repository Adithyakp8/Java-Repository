package Trees;

import java.util.LinkedList;
import java.util.Queue;

// LeetCode 572

public class Tree {

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // Creation class
        Node root = BinaryTree.buildTree(nodes);

        // Operation class
        // System.out.println(Operations.height(root));

        // Operations.diameter(root);
        // System.out.println(Operations.diameter);

        Operations.levelOrder(root);
        Operations.sumOfLevels(root);
    }

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {

        // creation of tree from array`
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static class Operations {

        // preorder traversal
        public static void preOrder(Node root) {
            if (root == null)
                return;

            System.out.println(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // inorder traversal
        public static void inOrder(Node root) {
            if (root == null)
                return;

            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);
        }

        // postorder traversal
        public static void postOrder(Node root) {
            if (root == null)
                return;

            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data + " ");
        }

        // level order traversal - based on iteration only
        public static void levelOrder(Node root) {
            Queue<Node> q = new LinkedList<Node>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currentNode = q.remove();
                if (currentNode == null) {
                    System.out.println();
                    if (!q.isEmpty()) {
                        q.add(null);
                    }
                } else {
                    System.out.print(currentNode.data);
                    if (currentNode.left != null) {
                        q.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        q.add(currentNode.right);
                    }
                }
            }
        }

        // height of a tree
        public static int height(Node node) {
            if (node == null) {
                return 0;
            }
            int leftheight = height(node.left);
            int rightheight = height(node.right);

            int myheight = Math.max(leftheight, rightheight) + 1;
            return myheight;
        }

        // diameter of a tree
        public static int diameter = 0;

        public static int diameter(Node node) {
            if (node == null) {
                return 0;
            }
            int leftheight = diameter(node.left);
            int rightheight = diameter(node.right);
            int currentdiameter = leftheight + rightheight + 1;
            if (currentdiameter > diameter) {
                diameter = currentdiameter;
            }
            return Math.max(leftheight, rightheight) + 1;

        }

        public static void sumOfLevels(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            int sum = 0;
            while (!q.isEmpty()) {
                Node currentNode = q.remove();
                if (currentNode == null) {
                    System.out.println(sum);
                    sum = 0;
                    if (!q.isEmpty()) {
                        q.add(null);
                    }
                } else {
                    sum = sum + currentNode.data;
                    if (currentNode.left != null) {
                        q.add(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        q.add(currentNode.right);
                    }
                }
            }
        }
    }

}
