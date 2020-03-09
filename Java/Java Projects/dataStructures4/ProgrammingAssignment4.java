package dataStructures4;

import java.io.BufferedReader;
import java.io.FileReader;

public class ProgrammingAssignment4 {

	// inc for next scope and dec when scope ends
	private static int currentScope = -1;
	private static HashMap hm = new HashMap();

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/DavidX2X/eclipse-workspace/David/src/dataStructures4/file.txt"));
			String line = br.readLine();

			while (line != null) {
				String[] parts = line.trim().split(" ");

				// check the type of command
				switch (parts[0]) {
				case "START":
					currentScope++;
					break;

				case "FINISH":
					hm.remove(currentScope);
					currentScope--;
					break;

				case "VAR":
					if (parts.length == 4 && line.indexOf("=") != -1) {
						hm.put(parts[1], Integer.parseInt(parts[3]), currentScope);
					}
					break;

				case "COM":
					// ignore the comments
					break;

				case "PRINT":
					int value = hm.get(parts[1]);
					if (value == -1) {
						System.out.println(parts[1] + " IS UNDEFINED");
					} else {
						if (parts.length == 4) { // contain an operator
							int result = calculate(value, parts[2], Integer.parseInt(parts[3]));
							System.out.println(parts[1] + " " + parts[2] + " " + parts[3] + " IS " + result);
						}
						
						if (parts.length == 2) {
							System.out.println(parts[1] + " IS " + value);
						}
					}
					break;

				default:
					LinkedList node = hm.getNode(parts[0]);
					if (node != null) {
						if (parts[1].equals("=")) {
							hm.put(parts[0], Integer.parseInt(parts[2]), node.getScope());
						} else {
							int result = calculate(node.getValue(), parts[1], 0);
							hm.put(parts[0], result, node.getScope());
						}
					}
					break;
				}
				line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	// pass operation and the final string in the parts array i.e number for binary
	// operators
	public static int calculate(int old, String op, int value) {
		switch (op) {
		case "++":
			return ++old;

		case "--":
			return --old;

		case "+":
			return old + value;

		case "-":
			return old - value;

		case "*":
			return old * value;

		case "/":
			return old / value;

		case "%":
			return (int) Math.floorMod(old, value);

		case "^":
			return (int) Math.pow(old, value);

		default:
			return -1;
		}
	}
}
