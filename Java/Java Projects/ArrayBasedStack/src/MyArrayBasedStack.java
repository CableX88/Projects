

public class MyArrayBasedStack {
	
static class ArrayBasedStack
{
		

	int top;
	static final int MAXSIZE = 10;
	int []stackArray;
	
		public ArrayBasedStack() //object constructor
	{
		top = 0; //indicates empty stack for arrays
		stackArray= new int[MAXSIZE];
		//top++;
	}
	//adds element to the top of the array stack
	public void push(int num) 
	{ //stack overflow error if the stack is full
		if(top >= stackArray.length) 
		{
			System.out.println("Error: Stack Overflow"); 
		}
		stackArray[top] = num;
		top++;
		
	}
	//removes an element from the stack unless the stack is empty
	public void pop() 
	{
		if (isEmpty()) 
		{
			System.out.println("Error: Stack Underflow, Stack is empty!!");
		}
		top--;
		
	}
	//checks if our array is empty
	public boolean isEmpty() 
	{
		
		return(top == -1);
	}
	//prints out our array based stack
	public void print() 
	{
		for(int i = 0; i<top; i++) 
		{
			System.out.print(stackArray[i]+" ");
		}
	}
}
	public static void main(String[] args) 
	{
		ArrayBasedStack a_stack = new ArrayBasedStack();
		a_stack.push(1);
		a_stack.push(3);
		a_stack.push(4);
		a_stack.push(9);
		a_stack.pop();
		a_stack.print();

	}
	
	

}

// output
//1 3 4
