



public class MyLinkedBasedStack {
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
			
		  
		 static class LinkedBasedStack
		{
			Node Top;
			int count = 0;
		// adds to the top(front) of the linked stack
		public void Push(int num) 
	    {

	        Node NewNode = new Node(num, null); 
	     //checks if the top of the node is empty if so creates new node    
	        if(Top == null) 
	        {
	            Top = NewNode;
	            count++;
	        }
	        else //otherwise adds node to linked list
	        {
	            NewNode.setNext(Top);
	            Top = NewNode;
	            count++;
	        }

	    }
		// checks if stack is empty
		public boolean isEmpty() 
		{
			return (Top == null);
		  
		}
		//remove top node from stack
		public Node pop()
		{
			 if(Top == null) 
		        {
				 System.out.print("Error: Stack is empty!! ");
		        }
			 	Node Temp = Top;
	            Top = Top.next;
	            return Temp;
		}		
			
		// prints stack to console
		public void print() 
		{
			Node current_pos = Top;  //current position
			while(current_pos != null) {
				System.out.print(current_pos.data +"->");
				current_pos = current_pos.next;
			}
		}
		
	}

		
		public static void main(String[] args) 
		{
			LinkedBasedStack StackList = new LinkedBasedStack();
			//Scanner scan = new Scanner(System.in);
			//int num = scan.nextInt();
			/*
			 * while(num!= -1) {
				System.out.println("Enter your numbers, enter -1 to exit: ");
				L_list.Push(num);
				num = scan.nextInt();
			}
			 */
			StackList.Push(2);
			StackList.Push(4);
			StackList.Push(6);
			StackList.Push(8);
			StackList.Push(10);
			StackList.pop();
			StackList.print();
			
			//output
			//8->6->4->2->
			
			
			
			
			
		}

	}
	
