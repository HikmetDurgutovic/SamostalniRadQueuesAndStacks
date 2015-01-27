package ba.bitcamp.hikmet.stacksandqueues;

public class TestMyQueue {

	public static void main(String[] args) {

		MyQueue myQ = new MyQueue();
		/**
		 * As I print out on the console, what is actually happening in MyQueue
		 * myQ, that is what is actually happening in our inner popStack and in
		 * our inner holdStack; Please run the program and read from the console
		 * the statuses of our both inner Stacks;
		 */
		// pushed 3 integer values into MyQueue;
		myQ.push(100);
		myQ.push(200);
		myQ.push(300);
		System.out.println(myQ.toString());
		// popped one element from MyQueue;
		myQ.pop();
		System.out.println(myQ.toString());
		// popped one more element from MyQueue;
		myQ.pop();
		System.out.println(myQ.toString());
		// pushed one integer value into MyQueue;
		myQ.push(500);
		System.out.println(myQ.toString());
		// pushed one integer value into MyQueue;
		myQ.push(700);
		System.out.println(myQ.toString());
		// popped one more element from MyQueue, after pushing some of them;
		myQ.pop();
		System.out.println(myQ.toString());
		// popped one more element from MyQueue;
		myQ.pop();
		System.out.println(myQ.toString());
		// popped the last element from MyQueue;
		myQ.pop();
		System.out.println(myQ.toString());
		// tried to pop out an elements from MyQueue when MyQueue is empty.
		// throws an NullPointerException;
		myQ.pop();
	}

}