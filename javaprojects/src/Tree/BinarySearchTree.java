package Tree;

class Node
{
	int data;
	Node left, right;
	Node(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
}

public class BinarySearchTree {

	static Node root;

	
	
	public Node insert(Node root, int value) {
		if(root==null) {
			root=new Node(value);
			return root;
		}
		if(value < root.data) {
			root.left = insert(root.left,value);
		}else {
			root.right=insert(root.right,value);
		}
		return root;
		
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(Node root)
	{
		if (root == null)
		{
			return;
		}
			inOrder(root.left);
			System.out.print("  " + root.data);
			inOrder(root.right);
		}
	
//	public Node search(Node root , int value) {
//		if(root==null || root.data==value) {
//			return root;
//		}
//		if(value<root.data) {
//			return search(root.left,value);
//			//return root.left;
//		}else {
//			return search(root.right,value);
//			//return root.right;
//		}
//	}
	
	
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(root, 10);
		bst.insert(root, 7);
		bst.insert(root, 20);
		bst.insert(root, 8);
		bst.insert(root, 30);
		bst.insert(root, 15);
		
		
		System.out.println();
		System.out.print("InOrder :");
		bst.inOrder();
		
//		System.out.println();
//		System.out.println(bst.search(root, 10));
//		
	}

}
