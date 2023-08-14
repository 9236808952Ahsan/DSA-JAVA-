import java.util.*;

public class BinaryTreesYT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
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
 

    // PREORDER .......root left right

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // INORDER.. left root right


    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    // POSTORDER ....left right root


    public static void postorder(Node root) {
        if(root == null) {
            System.out.print(-1+" ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
 
    // LEVEL ORDER


    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {

            Node curr = q.remove();

            if (curr == null) {
                System.out.println();
                // queue empty

                if (q.isEmpty()) {
                    break;
                } 
                else {
                    q.add(null);
                }
            } 
            else {
                System.out.print(curr.data + " ");
                if (curr.left != null) 
                {
                    q.add(curr.left);
                }
                if (curr.right != null)
                 {
                    q.add(curr.right);
                }
            }
        }
    }
    

    public static void main(String args[]) {
        int nodes[] = { 4,5,6,7,8,9 };
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        System.out.println(root.data);

        preorder(root);

        inorder(root);

        postorder(root);

        levelOrder(root);

    }
}
