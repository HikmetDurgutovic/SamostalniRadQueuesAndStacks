package ba.bitcamp.hikmet.stackmin;

public class TestStackPractice {
	public static void main(String[] args) {

		/**
		 * Please run the program and read from the console what has been done
		 * in the StackInt.
		 */
		StackPractice myS = new StackPractice();
		myS.push(11);
		System.out.println("Just added : " + myS.peek());
		myS.push(22);
		System.out.println("Just added : " + myS.peek());
		myS.push(33);
		System.out.println("Just added : " + myS.peek());
		System.out.println("The Minimum is : " + myS.getMinimum() + " * ");

		myS.push(10);
		System.out.println("Just added : " + myS.peek());
		System.out.println("The Minimum is : " + myS.getMinimum() + " * ");
		myS.push(55);
		System.out.println("Just added : " + myS.peek());
		myS.push(88);
		System.out.println("Just added : " + myS.peek());
		myS.push(5);
		System.out.println("Just added : " + myS.peek());
		System.out.println("The Minimum is : " + myS.getMinimum() + " * ");

		System.out.println("Just poped the " + myS.pop());
		System.out.println("Last in the stack now is : " + myS.peek());
		System.out.println("The Minimum is : " + myS.getMinimum() + " * ");

	}
}