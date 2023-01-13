package Tree;

class node
{
	int data;
	node left;
	node right;
	node(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
}


public class BinaryTreeClass {
	
	node root;
	
	BinaryTreeClass(){
		root=null;
	}
	
	
	public node addElement(node root, int data)
	{
		if(root == null) {
			root=new node(data);
		}
		else if(data <root.data)
			root.left = addElement(root.left, data);
		else if(data > root.data)
			root.right = addElement(root.right, data);
		else 
			return root;
		
		return root;
	}
	public void add(int data)
	{
		root = addElement(root,data);
	}

	

	public static void main(String[] args) {

		BinaryTreeClass bt = new BinaryTreeClass();
		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);

	}

}
