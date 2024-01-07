class Node {
    int data;
    Node left, right;

    Node(int n) {
        this.data = n;
        this.left = null;
        this.right = null;
    }
}

class TreeClass {
    int index = -1;
    int nodesNum = 0;

    Node createBT(int[] nodes) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = createBT(nodes);
        newNode.right = createBT(nodes);
        return newNode;
    }

    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    int countNodes(Node root)
    {
        nodesNum++;
        if(root ==  null)
        {
            nodesNum--;
            return nodesNum;
        }
        countNodes(root.left);
        countNodes(root.right);
        return nodesNum;
    }
    {

    }

}

class BTree {
    public static void main(String arp[]) {
        int[] arr = { 100, 2, -1, -1, 3, -1, -1 };
        TreeClass obj = new TreeClass();
        Node root = obj.createBT(arr);
        // System.out.println(root.data);
        // obj.inorder(root);
        // obj.preorder(root);
        // obj.postorder(root);
        System.out.println(obj.countNodes(root));
    }
}

/*
 * 
 *             100
 *          /      \
 *        2         3
 *      /   \      /   \
 *     -1  -1    -1   -1
 */