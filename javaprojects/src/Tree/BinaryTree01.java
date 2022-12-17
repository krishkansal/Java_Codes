package Tree;
import java.util.LinkedList;
import java.util.Queue;

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
public class BinaryTree01 {
	Node root;
	
	public void inOrder(Node root)
	{
		if (root != null)
		{
			
			inOrder(root.left);
			System.out.print("  " + root.data);
			inOrder(root.right);
		}
		return;
	}
	
	public void preOrder(Node root)
	{
		if(root != null)
		{
			System.out.print("  "+root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
		return ;
	}

	
	public void postOrder(Node root)
	{
		if(root != null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print("  "+ root.data);
		}
		else
			return;
	}

	public void LevelOrder(Node root) {
		if(root==null) {
			return;
		}
		
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp=queue.remove();
			System.out.print(temp.data+" ");
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			if(temp.right!=null) {
				queue.add(temp.right);
			}
		}
		
	}
	
	public void Search(Node root,int value) {
		if(root==null) {
			return;
		}
		
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node temp=queue.remove();
			if(temp.data==value) {
			System.out.print(temp.data+"find ");
			return;
			}else {
				
			
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			if(temp.right!=null) {
				queue.add(temp.right);
			}
		}
		}
		System.out.println("value not found");
	}
	
	 public static int maxDepth(Node node)
	    {
	        if (node == null)
	            return 0;
	        else {
	           
	            int lDepth = maxDepth(node.left);
	            int rDepth = maxDepth(node.right);
	  
	            /* use the larger one */
	            if (lDepth > rDepth)
	                return (lDepth + 1);
	            else
	                return (rDepth + 1);
	        }
	    }

	 
	 public int findmax(Node root) {
		 if(root==null) {
			 return Integer.MIN_VALUE;
		 }
		 int result=root.data;
		 int left=findmax(root.left);
		 int right=findmax(root.right);
		 if(left>right) {
			 return left;
		 }
		 if(right>left) {
			 return right;
		 }
		 return result;
		 
	 }
	 
	
	public static void main(String[] args) {
		BinaryTree01 tree = new BinaryTree01();
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
		Node n6=new Node(60);
		Node n7=new Node(70);
		Node n8=new Node(80);
		Node n9=new Node(90);
		
		tree.root=n1;
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n3;
		n3.left=n6;
		n3.right=n7;
		n4.left=n8;
		n4.right=n9;
		System.out.print("PreOrder :");
		tree.preOrder(n1);
		System.out.println();
		System.out.print("InOrder :");
		tree.inOrder(n1);
		System.out.println();
		System.out.print("PostOrder :");
		tree.postOrder(n1);
		System.out.println();
		System.out.print("LevelOrder :");
		tree.LevelOrder(n1);
		System.out.println();
		System.out.print("Searching :");
		tree.Search(n1,70);
		
		System.out.println();
		System.out.println("Height of tree is "+ tree.maxDepth(tree.root));
		
		System.out.println();
		System.out.println("Max value in tree is "+ tree.findmax(tree.root));
		
	}

}
