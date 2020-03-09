

public class BinaryTreeLab 
{
static class Node{
		  
		
		int data;
		Node left, right;
		
		 public Node() 
		 {
			data = 0;
			left = null;
			right = null;
		 }
	     public Node(int new_data)
	     {
	        data = new_data;
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
	         data = new_data;
	     }
	}
	static class BinaryTree 
	  {
		Node root;
		
		
		BinaryTree()
		{
			root = null;
		}
		public void add(int data)
	     {
	         root = insert(root, data);
	     }
	     //Function to insert data recursively 
			Node insert(Node node, int data)
	     {
	         if (node == null)
	             node = new Node(data);
	         else
	         {
	             if (node.getRight() == null)
	                 node.right = insert(node.right, data);
	             else
	                 node.left = insert(node.left, data);             
	         }
	         return node;
	     }
	    
	     public void preorder()
	     {
	         preorder(root);
	     }
	    void preorder(Node node) 
	    {
      if (node == null)
      {
      	return;
      }
      {
      	System.out.print(node.data + " ");
          preorder(node.left);
          preorder(node.right);
      }
  }
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree two_tree = new BinaryTree();
		two_tree.add(1);
		two_tree.add(3);
		two_tree.add(5);
		two_tree.add(7);
		two_tree.add(9);
		two_tree.add(11);
		two_tree.add(13);
		two_tree.preorder();


	}

}

//preorder traversal:
//1 5 9 13 11 7 3 
