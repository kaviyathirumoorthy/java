public class Main {
	public static void main(String[] args){
		LinkedList list=new LinkedList();
		list.addEnd(10);list.addEnd(20);list.addEnd(30);list.addEnd(40);
		list.addEnd(60);
                 LinkedList list2=new LinkedList();
		list2.addEnd(2);list2.addEnd(20);list2.addEnd(30);list2.addEnd(41);
		list2.addEnd(60);

		LinkedList mergedd=new LinkedList();
		mergedd.head= LinkedList.merged(list.head,list2.head);  //static method-merge
		mergedd.display();
		
		list.display();
		list.ElementFromLast(2,list);
		System.out.println(list.find(60));//find whether the key present in the list
		list.RemoveDuplicatesFromSortedLinkedList();
		list.reverse();
		list.display();
		list.ElementFromLast(8,list);

	}
}
