import java.util.NoSuchElementException;

// Complete the implementation of your MyLinkedList class in this file

public class MyLinkedList implements MyList {
	// Implement the required fields and methods here
	private int size = 0; // increment as number of nodes goes up
	private Node head = null; // represents 1st object in the list

	public void append(Object o) {
		Node newNode = new Node();

		if (size == 0 && head == null) {
			head = newNode;
		} else {
			head.next = newNode;
		}

		newNode.data = o;
		newNode.next = null;
		size += 1;
	}

	public void insertAt(int index, Object o) throws NoSuchElementException {

	}

	public void removeAt(int index) throws NoSuchElementException {

	}

	public Object getAt(int index) throws NoSuchElementException {
		return new Object();
	}

	public int getSize() {
		return size;
	}

	public void print() {
		MyListIterator it = this.getIterator();
		System.out.print("MyLinkedList => [");

		while(it.hasNext()) {
			Object actual = it.next();
			System.out.printf("%d",actual);

			if (it.hasNext()) {
				System.out.print(" ,");
			}
		}
		System.out.print(']');
		System.out.printf("\nSize %d\n", size);
	}

	// Do not alter the code below

	public MyListIterator getIterator() {
		return new MyLinkedListIterator();
	}

	private class MyLinkedListIterator implements MyListIterator {
		Node currentNode = null;

		@Override
		public Object next() {
			if (currentNode != null)
				currentNode = currentNode.next;
			else
				currentNode = head;

			return currentNode.data;
		}

		@Override
		public boolean hasNext() {
			if (currentNode != null)
				return currentNode.next != null;
			else
				return head != null;
		}
	}

	class Node {
		public Object data = null;
		public Node next = null;
	}
}