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
				return addToList(list);
			} else {
				tempNum = Integer.parseInt(input);
				Node tempNode = new Node(tempNum);
				list.root.addNode(list.root, tempNode);
				list.numElements++;
				return addToList(list);
			}
		}
		System.out.println("Done adding to list");
		scanner.close();
		return null;
	}
	
	public int getListSize() {
		return numElements;
	}
}
