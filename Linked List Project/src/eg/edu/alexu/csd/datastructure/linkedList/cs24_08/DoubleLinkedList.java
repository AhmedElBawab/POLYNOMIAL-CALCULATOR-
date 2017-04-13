package eg.edu.alexu.csd.datastructure.linkedList.cs24_08;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;

public class DoubleLinkedList implements ILinkedList {
	doubleListNode head = null;
	doubleListNode tail = null;

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub

		doubleListNode newNode = new doubleListNode();
		doubleListNode i = head;
		newNode.value = element;
		if (index == 0) {

			head = newNode;
		} else {
			for (int j = 0; j < index - 1; j++) {
				i = i.next;
			}
			if (i.next == null) {
				if (tail != null) {
					tail.next = newNode;
					newNode.pre = tail;
					tail = newNode;
				} else {
					head.next = newNode;
					newNode.pre = head;
					tail = newNode;
				}
			} else {
				newNode.next = i.next;
				i.next.pre = newNode;
				newNode.pre = i;
				i.next = newNode;
			}
		}

	}

	@Override
	public void add(Object element) {
		// TODO Auto-generated method stub

		doubleListNode newNode = new doubleListNode();

		newNode.value = element;

		doubleListNode i = head;

		while (i.next != null) {
			i = i.next;
		}

		if (tail != null) {
			tail = i;
			tail.next = newNode;
			newNode.pre = tail;
			tail = newNode;
		} else {
			tail = newNode;
			head.next = newNode;
			newNode.pre = head;
		}
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub

		doubleListNode i = head;

		for (int j = 0; j < index; j++) {
			i = i.next;
		}

		return i.value;
	}

	@Override
	public void set(int index, Object element) {
		// TODO Auto-generated method stub
		doubleListNode i = head;

		for (int j = 0; j < index; j++) {
			i = i.next;
		}

		i.value = element;

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

		doubleListNode j = head.next;
		while (j != null) {
			doubleListNode i = head;

			i.next = null;
			j.pre = null;
			head = j;
			j = j.next;
		}

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (head.next == null) {
			return true;
		}
		return false;
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub

		doubleListNode i = head;

		for (int j = 0; j < index; j++) {
			i = i.next;
		}
		i.next.pre = i.pre;
		i.pre.next = i.next;

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub

		doubleListNode i = head;
		int counter = 0;
		while (i != null) {
			i = i.next;
			counter++;
		}

		return counter;
	}

	@Override
	public ILinkedList sublist(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub

		doubleListNode i = head;
		doubleListNode k = head;

		ILinkedList d = new DoubleLinkedList();

		for (int j = 0; j < fromIndex; j++) {
			i = i.next;
		}
		for (int j = 0; j < toIndex; j++) {
			k = k.next;
		}

		i.pre = null;

		head = i;

		k.next = null;

		tail = k;
		doubleListNode l = head;

		for (int j = 0; j < toIndex; j++) {
			d.add(j, l.value);
			l = l.next;
		}
		return d;

	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub

		doubleListNode i = head;

		while (i != null) {
			if (i.value == o) {

				return true;

			}
			i = i.next;
		}

		return false;

	}

}
