import java.util.Scanner;

public class RPN {
	// Calculates Reverse polish notation expressions
	public static double ReversePolishCalculation(String input, LinkedBasedStack stack) {
		double num1 = Double.NaN, num2 = Double.NaN;// not a number
		
		if (!stack.isEmpty()) {
			num2 = stack.pop().getData();
		}

		if (!stack.isEmpty()) {
			num1 = stack.pop().getData();
			
		}
				
		if (input.equals("+")) {
			stack.Push(num1 + num2);
		} else if (input.equals("-")) {
			stack.Push(num1 - num2);
		} else if (input.equals("*")) {
			stack.Push(num1 * num2);
		} else if (input.equals("/")) {
			if (num2 == 0) {
				System.out.println("Error: Division by Zero");
				return Double.NaN;
			}
			stack.Push(num1 / num2);
		} else if (input.equals("=")) {
			return num2;
		} else {
			System.out.println("Error: invalid opperation");
			return Double.NaN;
		}
		
		return Double.NaN;
	}
	
	static class Node {
		double data;
		Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(double new_data, Node new_node) {
			data = new_data;
			next = new_node;
		}

		public void setNext(Node new_node) {
			next = new_node;
		}

		public void setData(double new_data) {
			data = new_data;
		}

		public Node getNext() {
			return next;
		}

		public double getData() {
			return data;
		}

		public static double evaluate() {
			return 0;
		}

	}

	static class LinkedBasedStack {
		Node Top;
		int count = 0;

		// adds to the top(front) of the linked stack
		public void Push(double num) {

			Node NewNode = new Node(num, null);
			// checks if the top of the node is empty if so creates new node
			if (Top == null) {
				Top = NewNode;
				count++;
			} else // otherwise adds node to linked list
			{
				NewNode.setNext(Top);
				Top = NewNode;
				count++;
			}

		}

		// checks if stack is empty
		public boolean isEmpty() {
			return (count==0);

		}

		// remove top node from stack
		public Node pop() {
			if (count==0) {
				System.out.print("Error: Stack is empty!! ");
			}
			Node Temp = Top;
			Top = Top.next;
			count--;
			return Temp;
		}

		// prints stack to console
		public void print() {
			Node current_pos = Top; // current position
			while (current_pos != null) {
				System.out.print(current_pos.data + "->");
				current_pos = current_pos.next;
			}
		}
	}

	private static void evaluate(String s) {
		if (s.equals("0")) {
			System.out.println("exiting Program");
			System.exit(0);
		}

		LinkedBasedStack linkedList = new LinkedBasedStack();
		String[] params = s.split(" ");
		for (int i = 0; i < params.length; i++) {
			if (params[i].equals("+") || params[i].equals("-") || params[i].equals("*") || params[i].equals("/") || params[i].equals("=")) {
				double rpn = ReversePolishCalculation(params[i], linkedList);
				if (!Double.isNaN(rpn)) {
					System.out.println(rpn);
				}
			} else {
				linkedList.Push(Double.parseDouble(params[i]));
			}
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String line;
		System.out.println("Enter your numbers to be evaluated: ");
		while (scan.hasNext()) {
			line = scan.nextLine();
			evaluate(line);
		}
	}
}
/*Output:
 * 10 15 + = 25.0
 * 10 15 - = -5.0
 * 2.5 3.5 + = 6.0
 * 10 0 / = Error: Division by Zero
 * 
 * 
 * 
 */

