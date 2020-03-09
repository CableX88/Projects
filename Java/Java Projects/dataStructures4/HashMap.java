package dataStructures4;

public class HashMap {

	private LinkedList[] table;
	private static final int SIZE = 128;

	public HashMap() {
		table = new LinkedList[SIZE];
		for (int k = 0; k < table.length; k++) {
			table[k] = null;
		}
	}

	public int get(String key) {
		int hash = hash(key);

		if (table[hash] == null) {
			return -1;
		} else {
			LinkedList node = table[hash];
			while (node != null && !node.getKey().equals(key)) {
				node = node.getNext();
			}
			
			if (node == null) {
				return -1;
			} else {
				return node.getValue();
			}
		}

	}

	public LinkedList getNode(String key) {
		int hash = hash(key);

		if (table[hash] == null) {
			return null;
		} else {
			LinkedList node = table[hash];
			while (node != null && !node.getKey().equals(key)) {
				node = node.getNext();
			}

			return node;
		}
	}

	public void put(String key, int value, int scope) {
		int hash = hash(key);

		if (table[hash] == null) {
			table[hash] = new LinkedList(key, value, scope);
		} else {
			LinkedList node = table[hash];

			while (node.getNext() != null && !node.getKey().equals(key)) {
				node = node.getNext();
			}
				
			// if entry exists update value
			if (node.getKey().equals(key))  {
				node.setValue(value);
			} else {
				// if does not exist add new node
				node.setNext(new LinkedList(key, value, scope));
			}
		}
	}

	// remove all variables with same scope
	public void remove(int scope) {
		LinkedList prevNode = null;
		
		for (int k = 0; k < table.length; k++) {
			if (table[k] != null) {
				prevNode = null;
				LinkedList node = table[k];
				while (node != null) {
					if (node.getScope() == scope) {
						if (prevNode == null) {
							table[k] = node.getNext();
						} else {
							prevNode.setNext(node.getNext());
						}
					} else {
						prevNode = node;
					}
					
					node = node.getNext();
				}
			}
		}
	}

	public int hash(String key) {
		int hash = 0;
		for (int i = 0; i < key.length(); i++) {
			hash += key.charAt(i) * (i + 1);
		}
		return hash % SIZE;
	}

	public void print() {
		System.out.println("");
		for (LinkedList list : table) {
			if (list != null) {
				LinkedList node = list;
				System.out.print("\n" + list + " ");
				
				while (node != null) {
					System.out.print(node.getKey() + " " + node.getScope());
					node = node.getNext();
				}
			}
		}
	}
}
