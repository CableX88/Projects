

public class MyArrayBasedQueue {
static class ArrayBasedQueue
{
	

	int front, back;
	static final int MAXSIZE = 10;
	int []queueArray;
	
		public ArrayBasedQueue() //object constructor
		{
		front = -1;
		back = -1;//indicates empty stack for arrays
		queueArray= new int[MAXSIZE];
		//top++;
		}
		
		//adds an element to the back of the Queue
		public void Enqueue(int num) 
		{
			if(back >= queueArray.length) 
			{
				System.out.println("Error: Queue Overflow");
			}
			else if(back == -1) 
			{
				front = back = 0;
			}
			//front = back = 0;
			queueArray[back] = num;
			//System.out.println(num);
			//System.out.println(back);
			//System.out.println(front);
			++back;
		}
		
		// Removes a number from the front of the queue
		public void Dequeue() 
		{
			if(isEmpty()) 
			{
				System.out.println("Error: Queue is empty ");
			}
			front++;
		}
		
		//checks if the queue is empty
		public boolean isEmpty() 
		{		
			return(front == -1 && back == -1);
		}
		public void print() 
		{
			for(int i = front; i<back; i++) 
			{
				System.out.print(queueArray[i]+" ");	
			}
		}
		
	public static void main(String[] args) 
	{
		ArrayBasedQueue a_queue = new ArrayBasedQueue();
		a_queue.Enqueue(2);
		a_queue.Enqueue(4);
		a_queue.Enqueue(6);
		a_queue.Enqueue(8);
		a_queue.Enqueue(10);
		a_queue.Dequeue();
		a_queue.print();
	}
}
}

//output
//4 6 8 10 
