import java.util.Scanner;

public class LinkedList {
	
	Node root;
	static int numElements;
	
	LinkedList() {
		root = null;
		numElements = 0;
	}
	
	LinkedList(Node rootNode) {
		root = rootNode;
		numElements = 1;
	}
	
	public static LinkedList addToList(LinkedList list) {
		System.out.println("Enter integer to add to the linked list or 'STOP' to stop: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input.toLowerCase();
		int tempNum;
		if (!input.equals("stop")) {
			try {
				tempNum = Integer.parseInt(input);
			} catch(NumberFormatException ex) {
				System.out.println("Error! Not an integer");
				return addToList(list);
			}
		}
		
		while(!input.equals("stop")) {
			if(list.root == null) {
				tempNum = Integer.parseInt(input);
				Node tempNode = new Node(tempNum);
				list.root = tempNode;
				list.numElements++;
				list.root.position = list.numElements-1;
				return addToList(list);
			} else {
				tempNum = Integer.parseInt(input);
				Node tempNode = new Node(tempNum);
				list.numElements++;
				int temp = list.numElements;
				list.root.addNode(list.root, tempNode, temp-1);
				return addToList(list);
			}
		}
		System.out.println("Done adding to list");
		return null;
	}
	
	public int getListSize() {
		return numElements;
	}
	
	public void findElement(LinkedList mylist) {
		System.out.println("Please enter a value to search for: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int findNum = Integer.parseInt(input);
		if (mylist.root != null) {
			Node temp = mylist.root.searchNode(mylist.root, findNum);
			if (temp != null) {
				System.out.println("Value " + findNum + " found at position " + temp.position + " of the Linked List!");
			}
		} else {
			System.out.println("Error: Value not found");
		}
	}
}
