package edu.kis.vh.nursery.list;

/**
 * List of numers
 */
public class IntLinkedList {

	public static class Node{
		public int value;
		public Node prev, next;

		public Node(int i) {
			value = i;
		}
	}

	private Node last;
	private int i;

	/** Pushing number into list
	 * @param i number to pusth to list
	 */
	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().next = new Node(i);
			getLast().next.prev = getLast();
			setLast(getLast().next);
		}
	}

	/** Method checking if list is empty
	 * @return true id list is null
	 */
	public boolean isEmpty() {
		return getLast() == null;
	}

	/**
	 * @return false always :/
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * @return value on top of the list
	 */
	public int top() {
		if (isEmpty())
			return -1;
		return getLast().value;
	}

	/**
	 * @return popped value
	 */
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = getLast().value;
		setLast(getLast().prev);
		return ret;
	}

	/**
	 * @return value of last Node in List
	 */
	public Node getLast() {
		return last;
	}

	/**
	 * @param last setting node as last
	 */
	public void setLast(Node last) {
		this.last = last;
	}
}
