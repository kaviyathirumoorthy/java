public class Main {
	public static void main(String[] args){
		LinkedList list=new LinkedList();
		list.addBeginning(10);list.addBeginning(20);list.addBeginning(30);list.addBeginning(40);
		list.addBeginning(60);list.addBeginning(60);list.addEnd(5);list.addEnd(5);

		list.display();
		list.ElementFromLast(8,list);
		System.out.println(list.find(60));//find whether the key present in the list
		list.RemoveDuplicatesFromSortedLinkedList();
		list.reverse();
		list.display();
		list.ElementFromLast(8,list);

	}
}
