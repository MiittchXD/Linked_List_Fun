
public class Node {

	int value;
	Node next = null;
	
	Node(int num) {
		value = num;
	}
	
	public void addNode(Node list, Node newNode) {
		if (list.next != null) {
			addNode(list.next, newNode);
		} else {
			list.next = newNode;
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
}
