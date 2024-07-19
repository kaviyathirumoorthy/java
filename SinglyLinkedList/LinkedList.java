class Node{
	int data;
	Node next;
	public Node(int val){
		data=val;
		next=null;
	}
}
class LinkedList{
Node head;
public void addBeginning(int val){
	Node newNode=new Node(val);
	newNode.next=head;
	head=newNode;
}
public void addEnd(int val){
	Node newNode=new Node(val);
	if(head==null){
		head=newNode;
	}
	Node current=head;
	while(current.next!=null){
		current=current.next;
	}
	current.next=newNode;

}
public void display(){
	Node current=head;
	while(current!=null){
		System.out.print(current.data+"-->");
		current=current.next;
	}
	System.out.println("null");
}
public int len(){
	Node current=head;
	int count=0;
	while(current!=null){
		count++;
		current=current.next;
	}
	return count;
}
public void ElementFromLast(int posi,LinkedList l){
	Node refPtr=head;
	Node slnPtr=head;
	int re=posi;
	if(posi>l.len()){ System.out.println("No such element present"); return;}
	while(posi!=0 && refPtr!=null){
		refPtr=refPtr.next;
		posi--;
	}
	if(refPtr==null && slnPtr!=null ){System.out.println(re+"th Element from last is "+slnPtr.data); return;}
	while(refPtr!=null){
		refPtr=refPtr.next;
		slnPtr=slnPtr.next;
	}
	System.out.println(re+"th Element from last is "+slnPtr.data);

}
public  void reverse(){
	Node current=head;
	Node previous=null;
	Node next=null;
	while(current!=null){
		next=current.next;
		current.next=previous;
		previous=current;
		current=next;
	}
	head=previous;

}
public boolean find(int key){
	Node current=head;
	if(head==null) return false;
	while(current!=null){
		if(current.data==key) return true;
		current=current.next;
	}
	return false;
}
public void RemoveDuplicatesFromSortedLinkedList(){
	Node current=head;
	while(current!=null && current.next!=null){
		if(current.data==current.next.data){
			current.next=current.next.next;
		}
		else{
			current=current.next;
		}
	}
}
