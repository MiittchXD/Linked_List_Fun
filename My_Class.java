public class My_Class {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		LinkedList.addToList(myList);
		System.out.println("Elements in linked list: " + myList.getListSize());
		myList.root.printList(myList.root);
		myList.findElement(myList);
	}
}
