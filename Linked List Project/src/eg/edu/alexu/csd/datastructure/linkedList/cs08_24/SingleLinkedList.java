package eg.edu.alexu.csd.datastructure.linkedList.cs08_24;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

public class SingleLinkedList implements ILinkedList {

	singleListNode head = null;

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		singleListNode newNode = new singleListNode();// New node which will be
														// insert in index
		newNode.value = element;// set the value to new node
		singleListNode i = this.head;// refrence
		// condition index = 0
		if (index == 0) {
			newNode.next = this.head;
			this.head = newNode;
		} else {
			// search for the index
			for (int counter = 0; counter < index - 1; counter++) {
				i = i.next;
			}
			// putting the new node
			newNode.next = i.next;
			i.next = newNode;
		}
	}

	@Override
	public void add(Object element) {
		// TODO Auto-generated method stub
		singleListNode newNode = new singleListNode();// new node
		newNode.value = element;// set value to new node
		singleListNode i = this.head;// refrence
		// search for the tail
		while (i.next != null) {
			i = i.next;
		}
		// putting the new node
		i.next = newNode;
		newNode.next = null;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		singleListNode i = this.head;//refrence
		int counter = 0;//counter for the index
		while (i != null) {
			if (counter == index) {
				return i;
			}
			i = i.next;
			counter++;
		}
		return null;
	}

	@Override
	public void set(int index, Object element) {
		// TODO Auto-generated method stub
		singleListNode newNode = new singleListNode();//new node
		newNode.value = element ;//set value to new node
		singleListNode i = this.head;//refrence for prev node 
		singleListNode j = i.next;//refrence for node
		if (index == 0) {
			newNode.next = this.head.next;
			this.head = newNode;
		}else{
			//search for prev node 
			for(int counter = 0;counter<index-1;counter++){
				i = i.next; 
				j = j.next;
			}
			i.next = newNode ;
			newNode.next = j.next ;
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.head = null ;

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(this.head == null){
			return true ;
		}
		return false;
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		singleListNode i = this.head;//refrence for prev node
		singleListNode j = i.next;//refrence for node
		if (index == 0) {
			this.head = this.head.next;
		} else{
			for (int counter = 0; counter < index - 1; counter++) {
				i = i.next;
				j = i.next;
			}
			i.next = j.next;//remove node
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		singleListNode i = this.head ; //refrence
		int counter = 0 ;//counter for elements
		while(i != null ){
			i = i.next ; 
			counter++ ;
			if(i.next == null){
				return counter ;
			}
		}
		return 0;
	}

	@Override
	public ILinkedList sublist(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		singleListNode i = this.head;
		//search for index
		for(int counter = 0 ; counter <fromIndex ;counter ++){
			i = i.next ;
		}
		singleListNode head2 = null ;//head for sublist
		singleListNode header = new singleListNode();//creating first node in sublist
		header.value = i.value ;//set value to header
		i = i.next; //move refrence
		head2 = header;//make head of sublist to header
		header.next = null ;//make next node null
		singleListNode j = head2;//creating refrence to sublist
		while(fromIndex+1 <= toIndex){
			singleListNode newNode = new singleListNode();//create new node
			newNode.value = i.value ;//set value to new node
			i = i.next ; //move refrence
			newNode.next = null ;//set next node to null
			j.next = newNode ;//conect with prev node
			j = j.next ;
			fromIndex++;
			
		}
		return null;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		singleListNode i = this.head ;
		while(i != null ){
			if(i.value == o){
				return true ;
			}
			i = i.next ;
		}
		return false;
	}

}
