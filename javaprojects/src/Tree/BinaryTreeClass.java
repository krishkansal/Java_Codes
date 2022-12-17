package Tree;

class node
{
	int data;
	Node left;
	Node right;
	node(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
}


public class BinaryTreeClass {
	
	Node root;
	private Node addElement(Node newnode, int data)
	{
		if(newnode == null)
			return new Node(data);
		if(data <newnode.data)
			newnode.left = addElement(newnode.left, data);
		else if(data > newnode.data)
			newnode.right = addElement(newnode.right, data);
		else 
			return newnode;
		
		return newnode;
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
