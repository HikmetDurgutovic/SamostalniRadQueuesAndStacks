package ba.bitcamp.hikmet.stackmin;

public class StackPractice {
	private Node head;

	/**
	 * Constructor;
	 */
	public StackPractice() {
		head = null;
	}

	/**
	 * push() method - puts our newly added value as the first element in our
	 * Linked;
	 */
	public void push(int value) {
		if (head == null) {
			Node newNode = new Node(value);
			head = newNode;
		} else {
			Node newNode = new Node(value);
			if (newNode.min > head.min) {		
				newNode.setMin(head.min);
			} else {
				newNode.setMin(value);
			}
			newNode.next = head;
			head = newNode;
		}

	}

	/**
	 * pop() method - deletes the first(head) element from our LinkedList;
	 */
	public int pop() {
		if (head == null) {
			throw new NullPointerException("The stack is empty");
		}
		Node current = head;
		head = head.next;
		int value = current.value;
		current = null;
		return value;
	}

	/**
	 * peek() - returns the next element that would be popped if we choose to
	 * from the LinkedList
	 */
	public int peek() {
		if (head == null) {
			throw new NullPointerException("The stack is empty");
		}
		return head.value;
	}

	/**
	 * getSize() returns how many elements there are in the LinkedList;
	 * recursion-used;
	 */
	public int getSize() {
		if (head == null) {
			return 0;
		} else {
			return getSize(head, 0);
		}
	}

	private int getSize(Node current, int counter) {
		if (current == null) {
			return counter;
		} else {
			return getSize(current.next, counter + 1);
		}

	}

	/**
	 * gets the minimum from the Stack;
	 */
	public int getMinimum() {
		if (head == null) {
			throw new NullPointerException(
					"There are no elements in our StackInt.");
		}
		return head.min;
	}

	/**
	 * contains method - returns the index at what our value is positioned in
	 * the LinkedList;
	 */
	public boolean contains(int value) {
		if (head.value == value) {
			return true;
		} else {
			return contains(head, value);
		}
	}

	private boolean contains(Node current, int value) {

		if (current == null) {
			return false;
		}
		if (current.value == value) {
			return true;
		} else {
			return contains(current.next, value);
		}
	}

	/**
	 * Inner CLass Node - located inside the LinkedListInt class;
	 */
	private class Node {
		public int value;
		public Node next;
		public int min;

		/**
		 * Constructor
		 */
		public Node(int value) {
			this.value = value;
			this.next = null;
			this.min = value;
		}

		/**
		 * Setter for min;
		 * 
		 * @param min
		 */
		public void setMin(int min) {
			this.min = min;
		}

	}
}
