

public class TestCode {

static class Node{
		  
		
		int keydata;
		Node left, right;
		
		 public Node() 
		 {
			keydata = 0;
			left = null;
			right = null;
		 }
	     public Node(int new_data)
	     {
	        keydata = new_data;
	        left = null;
	        right = null;
	     }
	     // the function sets the left node
	     public void setLeft(Node new_Node)
	     {
	         left = new_Node;
	     }
	     // the function sets the right node
	     public void setRight(Node new_node)
	     {
	         right = new_node;
	     }
	     // the function gets the left node
	     public Node getLeft()
	     {
	         return left;
	     }
	     // the function to get right node 
	     public Node getRight()
	     {
	         return right;
	     }
	     public void setData(int new_data)
	     {
	         keydata = new_data;
	     }
	}
	static class BinarySearchTree 
	  {
		Node root;
		
		
		BinarySearchTree()
		{
			root = null;
		}
		public void add(int keydata)
	     {
	         root = add(root, keydata);
	     }
	     /* Function to insert data recursively */
			Node add(Node node, int keydata)
	     {
	         if (node == null)
	             node = new Node(keydata);
	         
	         else
	         {
	             if (keydata < root.keydata)
	                 node.right = add(node.right, keydata);
	             else if(keydata > root.keydata)
	                 node.left = add(node.left, keydata);             
	         }
	         return root;
	     }
	    
	     public void inorder()
	     {
	         inorder(root);
	     }
	    void inorder(Node node) 
	    {
      if (node == null)
      {
      	return;
      }
      {
          inorder(node.left);
          System.out.print(node.keydata + " ");
          inorder(node.right);
      }
  }
	public static void main(String[] args) {
BinarySearchTree BST = new BinarySearchTree();
		
		BST.add(10);
		BST.add(50);
		BST.add(20);
		BST.add(30);
		BST.add(60);
		BST.add(40);
		BST.add(70);
		BST.inorder();
	}

}
}
