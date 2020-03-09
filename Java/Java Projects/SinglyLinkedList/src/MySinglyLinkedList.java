
import java.util.Scanner;
public class MySinglyLinkedList {

	   static class Node
	{
		int data;
		Node next;
		
		public Node() 
		{
			data = 0;
			next = null;
		}
	    public Node(int new_data,Node new_node)
	    {
	        data = new_data;
	        next = new_node;
	    }    
	    public void setNext(Node new_node)
	    {
	        next = new_node;
	    }    
	    public void setData(int new_data)
	    {
	        data = new_data;
	    }    
	    public Node getNext()
	    {
	        return next;
	    }    
	    public int getData()
	    {
	        return data;
	    }

	}
		
	  
	 static class LinkedList
	{
		Node Head;
		
	// adds to the head(front) of the linked list
	public void AddToHead(int num) 
    {

        Node NewNode = new Node(num, null); 
     //checks if the Head of the node is empty if so creates new node    
        if(Head == null) 
        {
            Head = NewNode;
        }
        else //otherwise adds node to linked list
        {
            NewNode.setNext(Head);
            Head = NewNode;
        }

    }
	// prints linked list to console
	public void print() 
	{
		Node current_pos = Head;  //current position
		while(current_pos != null) {
			System.out.print(current_pos.data +"->");
			current_pos = current_pos.next;
		}
	}
	
}

	
	public static void main(String[] args) 
	{
		LinkedList L_list = new LinkedList();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while(num!= -1) {
			System.out.println("Enter your numbers, enter -1 to exit: ");
			L_list.AddToHead(num);
			num = scan.nextInt();
		}
		L_list.print();
		
	}

}

/*
 10
Enter your numbers, enter -1 to exit: 
15
Enter your numbers, enter -1 to exit: 
5
Enter your numbers, enter -1 to exit: 
2
Enter your numbers, enter -1 to exit: 
4
Enter your numbers, enter -1 to exit: 
-1
4->2->5->15->10->
 */

