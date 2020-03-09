

public class MyLinkBasedQueue {
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
	static class LinkBasedQueue 
	{
		Node Front,Back;
		int count = 0;
		
		//constructor 
		public LinkBasedQueue() 
		{
			Front = null;
			Back = null;
			
		}
		public boolean isEmpty() 
		{
			return (count == 0);
			//System.out.println(Front);
		  
		}
		public void Enqueue(int num) 
		{
			Node NewNode = new Node(num, null); 
		     //checks if the Back of the Queue is empty if so creates new node    
		        if(isEmpty()) 
		        {	 Back = NewNode;
		             //Back = NewNode;
		             Front = Back;
		           count++;
		        }
		        else //otherwise adds node to linked list
		        {
		            Back.setNext(NewNode);
		            //Front = NewNode;
		            Back = NewNode;
		            //System.out.println(Front);
		            count++;
		        }
		}
		
		public Node Dequeue()
		{
			 if(isEmpty()) 
		        {
				 System.out.print("Error: Stack is empty!! ");
				 return null;
		        }
			 	Node Temp = Front;
	            Front = Front.next;
	            count--;
	            return Temp;
		}		
		
		public void print() 
		{
			Node current_pos = Front;  //current position
			while(current_pos != null) {
				System.out.print(current_pos.data +"->");
				current_pos = current_pos.next;
				
				
			}
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkBasedQueue QueueList = new LinkBasedQueue();
		QueueList.Enqueue(3);
		QueueList.Enqueue(6);
		QueueList.Enqueue(9);
		QueueList.Enqueue(12);
		QueueList.Enqueue(15);
		//System.out.println(QueueList.Dequeue().data);
		QueueList.Dequeue();
		QueueList.print();
	}

}

//output
//6->9->12->15->
//3 has been dequeued
