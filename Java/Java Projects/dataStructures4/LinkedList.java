package dataStructures4;

public class LinkedList {

	private String key;
	private int value;
	private int scope;
	private LinkedList next;
	
	public LinkedList(String key, int value, int scope) {
		this.key = key;
		this.value = value;
		this.next = null;
		this.scope = scope;
	}

	public int getScope() {
		return scope;
	}

	public void setScope(int scope) {
		this.scope = scope;
	}

	public String getKey() {
		return key;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public void setNext(LinkedList node) {
		next = node;
	}

	public LinkedList getNext() {
		return next;
	}
}
