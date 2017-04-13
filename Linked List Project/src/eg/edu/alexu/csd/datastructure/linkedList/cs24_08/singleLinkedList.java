package eg.edu.alexu.csd.datastructure.linkedList.cs24_08;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

public class singleLinkedList implements ILinkedList {

	SingleListNode head = null;

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		if (index < 0 || index > size() || element == null){
			throw null;
		}
		SingleListNode newNode = new SingleListNode();// New node which will be
														// insert in index
		newNode.value = element;// set the value to new node
		SingleListNode i = this.head;// refrence
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
		if (element == null){
			throw null;
		}
		SingleListNode newNode = new SingleListNode();// new node
		newNode.value = element;// set value to new node
		if(this.head==null){
			newNode.next = this.head ;
			this.head = newNode;
		}else{
			SingleListNode i = this.head;// refrence
			// search for the tail
			while (i.next != null) {
				i = i.next;
			}
			// putting the new node
			i.next = newNode;
			newNode.next = null;
		}
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		SingleListNode i = this.head;// refrence
		int counter = 0;// counter for the index
		while (i != null) {
			if (counter == index) {
				return i.value;
			}
			i = i.next;
			counter++;
		}
		return null;
	}

	@Override
	public void set(int index, Object element) {
		// TODO Auto-generated method stub
		SingleListNode newNode = new SingleListNode();// new node
		newNode.value = element;// set value to new node
		SingleListNode i = this.head;// refrence for prev node
		SingleListNode j = i.next;// refrence for node
		if (index == 0) {
			newNode.next = this.head.next;
			this.head = newNode;
		} else {
			// search for prev node
			for (int counter = 0; counter < index - 1; counter++) {
				i = i.next;
				j = j.next;
			}
			i.next = newNode;
			newNode.next = j.next;
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.head = null;

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (this.head == null) {
			return true;
		}
		return false;
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		SingleListNode i = this.head;// refrence for prev node
		SingleListNode j = i.next;// refrence for node
		if (index == 0) {
			this.head = this.head.next;
		} else {
			for (int counter = 0; counter < index - 1; counter++) {
				i = i.next;
				j = i.next;
			}
			i.next = j.next;// remove node
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		SingleListNode i = this.head; // refrence
		int counter = 1;// counter for elements
		while (i != null) {
			i = i.next;
			counter++;
			if (i.next == null) {
				return counter;
			}
		}
		return 0;
	}

	@Override
	public ILinkedList sublist(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		ILinkedList subListObject = new singleLinkedList();
		SingleListNode i = this.head ;
		for(int counter = 0 ;counter<fromIndex ; counter++){
			i = i.next ;
		}
		this.head = i ;
		while(fromIndex<toIndex){
			i = i.next ;
			fromIndex++;
		}
		i.next = null ;
		return subListObject ;
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		SingleListNode i = this.head;
		while (i != null) {
			if (i.value == o) {
				return true;
			}
			i = i.next;
		}
		return false;
	}

}
