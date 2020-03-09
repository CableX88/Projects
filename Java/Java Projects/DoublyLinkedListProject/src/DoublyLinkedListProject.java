import java.util.Scanner;



public class DoublyLinkedListProject {

	static class ClientNode
	{
		String name;
		double weight;
		ClientNode next;
		ClientNode previous;
		
		public ClientNode() 
		{
			weight = 0;
			name = "";
			next = null;
			previous = null;
		}
	    public ClientNode(String newName,double new_weight ,ClientNode new_node)
	    {
	    	name = newName;
	        weight = new_weight;
	        next = new_node;
	        previous = null;
	    }    
	    public void setNext(ClientNode new_node)
	    {
	        next = new_node;
	    }
	    public void setPrevious(ClientNode newNode) 
	    {	
	    	previous = newNode;	
	    }
	    public void setWeight(double new_weight)
	    {
	        weight = new_weight;
	    }
	    public void setName(String new_Name)
	    {
	        name = new_Name;
	    }    
	    public ClientNode getNext()
	    {
	        return next;
	    }
	    public String getName() 
	    {
			return name;	    	
	    }
	    public double getWeight()
	    {
	        return weight;
	    }
	    public String toString () 
	    {	
	    	return (name + " - " + weight + " ");
	    }

	}
	static class DoublyLinkedList
	{
		ClientNode Head;
	
	//public DoublyLinkedList() 
	//{
		
	//}
	// adds to the head(front) of the linked list
	public void insert(String C_name,double C_weight) 
    {

        ClientNode NewNode = new ClientNode(C_name,C_weight, null); 
        
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
		ClientNode current_pos = Head;  //current position
		while(current_pos != null) {
			System.out.print(current_pos +"->");
			current_pos = current_pos.next;
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DoublyLinkedList DL_list = new DoublyLinkedList();
		Scanner scan = new Scanner(System.in);
		String person = "";//scan.next();
		double num = 0;//scan.nextDouble();
		
		while(true) {
			System.out.println("Enter your names and weights, enter -1 to exit: ");
			DL_list.insert(person,num);
			person = scan.next();
			if (person.equals("-1"))
				break;
			num = scan.nextDouble();
		}
		DL_list.print();
		scan.close();
		
		
	}

}
