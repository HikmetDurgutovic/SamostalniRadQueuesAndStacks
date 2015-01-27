package ba.bitcamp.hikmet.stacksandqueues;

import java.util.Stack;

public class MyQueue {
	private Stack<Integer> holdStack;
	private Stack<Integer> popStack;

	/**
	 * Constructor; Creates MyQueue; Exactly, creates two Stacks, one holdStack
	 * where we push all the elements we add to MyQueue; and the other popStack,
	 * so that we transfer elements to this one if we need to pop an element
	 * out; more detailed explanation in the pop() method; Please read and see
	 * below;
	 */
	public MyQueue() {
		this.holdStack = new Stack<Integer>();
		this.popStack = new Stack<Integer>();
	}

	/**
	 * Adds an integer value to MyQueue; Exactly, pushes the value into the
	 * holdStack;
	 * 
	 * @param value
	 */
	public void push(int value) {
		holdStack.push(value);
	}

	/**
	 * Pops out the first elements that has entered our MyQueue; Exactly, throws
	 * a NullPointerException if there are no elements in MyQueue (that is, no
	 * elements in holdStack, and no elements in popStack; Assuming that we
	 * already have pushed a few elements in our MyQueue that is to be exact to
	 * the holdStack. 
	 * The method is the following, the first time we want to pop
	 * an element from MyQueue, we push them all to the popStack and then pop an
	 * element out. The next time we want to pop an element out we pop it off
	 * course from the popStack(so it overall looks like FIFO from the MyQueue).
	 * If we want to pop out, and there are no elements in our popStack,
	 * (assuming that in the meantime (in between pops) we have added more
	 * elements) we push again (as we did the first time) all of the elements
	 * from our holdStack, and pop out from the popStack, and we repeat the
	 * process.
	 */
	public void pop() {
		if (popStack.isEmpty() && holdStack.isEmpty()) {
			throw new NullPointerException("No elements to pop from MyQueue.");
		}
		if (!popStack.isEmpty()) {
			popStack.pop();
		} else {
			while (!holdStack.isEmpty()) {
				popStack.push(holdStack.pop());
			}
			popStack.pop();
		}
	}

	/**
	 * MyQuese toString method;
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Inner popStack - Waiting to get poped : \n");
		sb.append(popStack.toString()).append("\n");
		sb.append("Inner holdStack - Either waiting for the pop to empty or \nwaiting for the pop()\n");
		sb.append(holdStack.toString());
		sb.append("\n****************************************");
		return sb.toString();
	}
}
