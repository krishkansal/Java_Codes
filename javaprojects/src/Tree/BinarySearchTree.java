package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	 class Node {
	        int key;
	        Node left, right;
	 
	        public Node(int item)
	        {
	            key = item;
	            left = right = null;
	        }
	    }
	 
	    // Root of BST
	    Node root;
	 
	    // Constructor
	    BinarySearchTree() {
	    	root = null; 
	    	}
	 
	
	    public void insert(int key){
	    	root = insertRec(root, key); 
	    	}
	 

	    public Node insertRec(Node root, int key)
	    {
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        }else if (key < root.key) {
	            root.left = insertRec(root.left, key);
	        }else if (key > root.key) {
	            root.right = insertRec(root.right, key);
	        }
	        return root;
	    }

	   public void inorder(){ 
		   inorderRec(root); 
		   }

	   public void inorderRec(Node root)
	    {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.print(root.key+" ");
	            inorderRec(root.right);
	        }
	    }
	   
	   //levelOrder with queue
	   
	   public void LevelOrder(Node root) {
			if(root==null) {
				return;
			}
			
			Queue<Node> queue=new LinkedList<>();
			queue.add(root);
			while(!queue.isEmpty()) {
				Node temp=queue.remove();
				System.out.print(temp.key+" ");
				if(temp.left!=null) {
					queue.add(temp.left);
				}
				if(temp.right!=null) {
					queue.add(temp.right);
				}
			}
			
		}
	   
	   public void search(int value) {
		   root=searchRec(root,value);
		   System.out.println(root.key);
	   }
	   
	   public Node searchRec(Node root,int value) {
		   if(root.key == value || root==null) {
			   return root;
		   }
		   else if(value<root.key) {
			   return searchRec(root.left,value);
		   }else{
			   return searchRec(root.right,value);
		   }
		   
		   
	   }
	   
	   
	   public void findmax(){ 
		   System.out.println(findMax(root)); 
		   }
	   
	   public int findMax(Node root) {
		   if(root.right!=null) {
			   return findMax(root.right);
		   }else {
			   return root.key;
		   }
	   }
	   
	   public static boolean iterativesearch(Node root,int value) {
		   while(root!=null) {
			   if(value<root.key) {
				   root=root.left;
			   }else if(value>root.key) {
				   root=root.right;
			   }else {
				   return true;
			   }
			   
		   }
		   return false;
	   }
	   
	   
	   public int height(Node root) {
		   if(root==null) {
			   return 0;
		   }
		   int lheight=height(root.left);
		   int rheight=height(root.right);
		   
		   if(lheight>rheight) {
			   return (lheight+1);
		   }else {
			   return (rheight+1);
		   }
	   }
	   
	   //level order with recursion
	   
	   public void levelorder() {
		   int h=height(root);
		   for(int i=0;i<=h;i++) {
			   printcurrentlevel(root,i);
		   }
	   }
	   
	   public void printcurrentlevel(Node root,int level) {
		   if(root==null) {
			   return;
		   }
		   if(level==0) {
			   System.out.print(root.key + " ");
		   }else if(level>0) {
			   printcurrentlevel(root.left,level-1);
			   printcurrentlevel(root.right,level-1);
		   }
	   }
	   
	   
	   public static Node minimumNode(Node root) {
		   if(root.left==null) {
			   return root;
		   }else {
			  return minimumNode(root.left);
		   }
	   }
	   
	   public Node deleteNode(Node root,int value) {
		   if(root==null) {
			   System.out.println("not found");
			   return null;
		   }
		   if(value<root.key) {
			   root.left=deleteNode(root.left,value);
		   }else if(value>root.key) {
			   root.right=deleteNode(root.right,value);
		   }
		   else {
			   if(root.left!=null && root.right!=null) {
				   Node temp=root;
				   Node minNodeRight=minimumNode(temp.right);
				   root.key=minNodeRight.key;
				   root.right=deleteNode(root.right,minNodeRight.key);
			   }else if(root.left!=null) {
				   root=root.left;
			   }else if(root.right!=null){
				   root=root.right;
			   }else {
				   root=null;
			   }
		   }
		   return root;
	   }
	   
	   public void deleteTree() {
		   root=null;
		   System.out.println("Tree is deleted");
	   }
	   
	   
//	   public void Search(Node root,int value) {
//			if(root==null) {
//				return;
//			}
//			
//			Queue<Node> queue=new LinkedList<>();
//			queue.add(root);
//			while(!queue.isEmpty()) {
//				Node temp=queue.remove();
//				if(temp.key==value) {
//				System.out.print(temp.key+"find ");
//				return;
//				}else {
//					
//				
//				if(temp.left!=null) {
//					queue.add(temp.left);
//				}
//				if(temp.right!=null) {
//					queue.add(temp.right);
//				}
//			}
//			}
//			System.out.println("value not found");
//		}
	   
	   
	   
	public static void main(String[] args) {
		  BinarySearchTree tree = new BinarySearchTree();
		  	tree.insert(50);
	        tree.insert(30);
	        tree.insert(200);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);
	 
	    
	        tree.inorder();
	        System.out.println();
	        tree.LevelOrder(tree.root);
	        System.out.println();
			System.out.print("Searching :");
			
			//tree.search(30);
			System.out.println(iterativesearch(tree.root, 30));
			System.out.println(tree.height(tree.root));
			tree.levelorder();
			
			tree.deleteNode(tree.root, 200);
			System.out.println();
			tree.inorder();
			System.out.println();
			tree.deleteTree();
			tree.inorder();
			//			tree.findmax();
	}

}
