

public class BinarySearchTreeLab {

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
	     // Function to insert data recursively 
			Node add(Node root, int keydata)
	     { //checks if there is a root if so new root is created
	         if (root == null) {
	        	 root = new Node(keydata);
		         	return root;
	         }
	         else// checks the keydata to see which value goes left or right
	         { 
	             if (keydata < root.keydata) // values greater than the root go to the right
	                 root.right = add(root.right, keydata);
	             else if(keydata > root.keydata) // values lesser than root go to the left
	                 root.left = add(root.left, keydata);             
	         }
	         return root;
	     }
	    
	     public void inorder()
	     {
	         inorder(root);
	     }
	    void inorder(Node root) 
	    {
	    	if (root == null)
	    	{
	    		return;
	    	}
	      {
          inorder(root.left);
          System.out.print(root.keydata + " ");
          inorder(root.right);
	      }
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

//inorder traversal
//70 60 50 40 30 20 10 