package Tree;


public class AVLTree {
	class Node {
	    int data , height;
	    Node left, right;
	 
	    Node(int data) {
	        this.data = data;
	        height = 1;
	        
	    }
	}
	 int height(Node N) {
	        if (N == null)
	            return 0;
	 
	        return N.height;
	    }
	
	Node root;
	 AVLTree() {
	    	root = null; }
    
    public Node insert(Node node, int value) {
        if (node == null)
            return (new Node(value));
 
        if (value < node.data)
            node.left = insert(node.left, value);
        else if (value > node.data)
            node.right = insert(node.right, value);
        else 
            return node;
		return node;
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    
	public static void main(String[] args) {
		 AVLTree tree = new AVLTree();
		 
		  	tree.root = tree.insert(tree.root, 10);
	        tree.root = tree.insert(tree.root, 20);
	        tree.root = tree.insert(tree.root, 30);
	        tree.root = tree.insert(tree.root, 40);
	        tree.root = tree.insert(tree.root, 50);
	        tree.root = tree.insert(tree.root, 25);
	        
	        System.out.println("Preorder traversal of constructed tree is : ");
	        tree.preOrder(tree.root);
		
	}

}
