
public class Node {

	int value;
	Node next = null;
	int position;
	
	Node(int num) {
		value = num;
	}
	
	public void addNode(Node list, Node newNode, int newPosition) {
		if (list.next != null) {
			addNode(list.next, newNode, newPosition);
		} else {
			list.next = newNode;
			list.next.position = newPosition;
		}
	}
	
	public void printList(Node list) {
		if (list.next != null) {
			System.out.println(list.value);
			printList(list.next);
		} else {
			System.out.println(list.value);
		}
	}
	
	public int numElements(Node tempNode, int numNodes) {
		if (tempNode.next != null) {
			return numElements(tempNode.next, numNodes+1);
		} else {
			return numNodes + 1;
		}
	}
	
	
	public Node searchNode(Node tempNode, int num) {
		if (tempNode.value == num) {
			return tempNode;
		} else if (tempNode.next != null) {
			return searchNode(tempNode.next, num);
		} else {
			return null;
		}
	}
}
