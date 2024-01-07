// Create the node using the pre order data

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {
    static class Node {
        int data;
        Node right, left;

        Node(int n) {
            this.data = n;
            this.right = null;
            this.left = null;
        }
    }

    static class CreateTree {
        int index = -1;

        Node createBinaryTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = createBinaryTree(nodes);
            newNode.right = createBinaryTree(nodes);
            return newNode;
        }

        // it use to print the data in preorder sequence.
        // time complexity O(n).
        // rootNode --> leftNode --> rightNode.
        void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // first it will to the left and print it and return back to root and print the
        // right node data.
        // Inorder traversal: leftNode --> root node --> rightNode:
        // Time Complexity: O(n)
        void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // postorder Traversal O(n)
        // leftNode --> rightNode --> root node
        void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // levelOrder O(n)
        // BFS
        void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            
            while (!q.isEmpty()) {
                Node curNode = q.remove();
                if(curNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(root.data + " ");
                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }
            }
        }
    }

    public static void main(String ar[]) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        CreateTree obj = new CreateTree();
        Node root = obj.createBinaryTree(nodes);
        // obj.preorder(root);
        // System.out.println();
        // obj.inorder(root);
        // System.out.println();
        // obj.postorder(root);
        // System.out.println();
        obj.levelOrder(root);
        
    }
}