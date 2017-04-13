package eg.edu.alexu.csd.datastructure.linkedList.cs24_08;

import eg.edu.alexu.csd.datastructure.linkedList.IPolynomialSolver;

public class App implements IPolynomialSolver {
	
	RuntimeException e = new RuntimeException();

	private DoubleLinkedList R = new DoubleLinkedList();

	private DoubleLinkedList A = new DoubleLinkedList();

	private DoubleLinkedList B = new DoubleLinkedList();

	private DoubleLinkedList C = new DoubleLinkedList();

	@Override
	public void setPolynomial(char poly, int[][] terms) {
		// TODO Auto-generated method stub

		int noOfNodes = terms[0][1];

		if (poly == 'A') {
			doubleListNode i = A.head;//
			// set nodes without last node
			for (int index = 0; index < noOfNodes; index++) {
				A.add(index, 0);
				i = i.next;
			}
			int counter = 0;
			A.add(terms[counter][0]);// set last node
		    //i = i.next;
			counter++;
			// set all nodes
			for (int index = noOfNodes - 1; index >= 0; index--) {
				if (index == terms[counter][1]) {
					i.pre.value = terms[counter][0];
					counter++;
					i = i.pre;
				} else {
					i.pre.value = 0;
					i = i.pre;
				}
			}
		}else if (poly == 'B') {
			doubleListNode i = B.head;// refrence
			// set nodes without last node
			for (int index = 0; index < noOfNodes; index++) {
				B.add(index, 0);
				i = i.next;
			}
			int counter = 0;
			B.add(terms[counter][0]);// set last node
			i = i.next;
			counter++;
			// set all nodes
			for (int index = noOfNodes - 1; index >= 0; index--) {
				if (index == terms[counter][1]) {
					i.pre.value = terms[counter][0];
					counter++;
					i = i.pre;
				} else {
					i.pre.value = 0;
					i = i.pre;
				}
			}
		}else if (poly == 'C') {
			doubleListNode i = C.head;// refrence
			// set nodes without last node
			for (int index = 0; index < noOfNodes; index++) {
				C.add(index, 0);
				i = i.next;
			}
			int counter = 0;
			C.add(terms[counter][0]);// set last node
			i = i.next;
			counter++;
			// set all nodes
			for (int index = noOfNodes - 1; index >= 0; index--) {
				if (index == terms[counter][1]) {
					i.pre.value = terms[counter][0];
					counter++;
					i = i.pre;
				} else {
					i.pre.value = 0;
					i = i.pre;
				}
			}
		}else{
			throw e;
		}
	}

	@Override
	public String print(char poly) {
		// TODO Auto-generated method stub

		StringBuilder string = new StringBuilder();
		doubleListNode tailA = new doubleListNode();
		doubleListNode tailB = new doubleListNode();
		doubleListNode tailC = new doubleListNode();
		doubleListNode tailR = new doubleListNode();
		tailA = A.tail;
		tailB = B.tail;
		tailC = C.tail;
		tailR = R.tail;
		int c = 0;

		if (poly == 'A') {
			while (tailA.pre != null) {
				c++;
				tailA = tailA.pre;
			}
			if (A.head == null) {
				return null;
			} else {
				while (tailA.pre != null) {
					if ((Integer) tailA.value != 0) {
						if (c != 0) {
							string.append(tailA.value);
							string.append('x');
							string.append('^');
							string.append(c);
							string.append('+');
						} else {
							string.append(tailA.value);
						}
					}
					c--;
					tailA = tailA.pre;
				}
			}
		}else if (poly == 'B') {
			while (tailB.pre != null) {
				c++;
				tailB = tailB.pre;
			}
			if (B.head == null) {
				return null;
			} else {
				while (tailB.pre != null) {
					if ((Integer) tailB.value != 0) {
						if (c != 0) {
							string.append(tailB.value);
							string.append('x');
							string.append('^');
							string.append(c);
							string.append('+');
						} else {
							string.append(tailB.value);
						}
					}
					c--;
					tailB = tailB.pre;
				}
			}
		}else if (poly == 'C') {
			while (tailC.pre != null) {
				c++;
				tailC = tailC.pre;
			}
			if (C.head == null) {
				return null;
			} else {
				while (tailC.pre != null) {
					if ((Integer) tailC.value != 0) {
						if (c != 0) {
							string.append(tailC.value);
							string.append('x');
							string.append('^');
							string.append(c);
							string.append('+');
						} else {
							string.append(tailC.value);
						}
					}
					c--;
					tailC = tailC.pre;
				}
			}
		}if (poly == 'R') {
			while (tailR.pre != null) {
				c++;
				tailR = tailR.pre;
			}
			if (R.head == null) {
				return null;
			} else {
				while (tailR.pre != null) {
					if ((Integer) tailR.value != 0) {
						if (c != 0) {
							string.append(tailR.value);
							string.append('x');
							string.append('^');
							string.append(c);
							string.append('+');
						} else {
							string.append(tailR.value);
						}
					}
					c--;
					tailR = tailR.pre;
				}
			}
		}else{
			throw e;
		}
		return String.valueOf(string);

	}

	@Override
	public void clearPolynomial(char poly) {
		// TODO Auto-generated method stub

		if (poly == 'A') {
			doubleListNode j = A.head.next;
			while (j != null) {
				doubleListNode i = A.head;

				i.next = null;
				j.pre = null;
				A.head = j;
				j = j.next;
			}
		}else if (poly == 'B') {
			doubleListNode j = B.head.next;
			while (j != null) {
				doubleListNode i = B.head;

				i.next = null;
				j.pre = null;
				B.head = j;
				j = j.next;
			}
		}else if (poly == 'C') {
			doubleListNode j = C.head.next;
			while (j != null) {
				doubleListNode i = C.head;

				i.next = null;
				j.pre = null;
				C.head = j;
				j = j.next;
			}
		}else if (poly == 'R') {
			doubleListNode j = R.head.next;
			while (j != null) {
				doubleListNode i = R.head;

				i.next = null;
				j.pre = null;
				R.head = j;
				j = j.next;
			}
		}else{
			throw e;
		}
	}

	@Override
	public float evaluatePolynomial(char poly, float value) {
		// TODO Auto-generated method stub

		doubleListNode headA = new doubleListNode();
		doubleListNode headB = new doubleListNode();
		doubleListNode headC = new doubleListNode();
		doubleListNode headR = new doubleListNode();
		headA = A.head;
		headB = B.head;
		headC = C.head;
		headR = R.head;
		int c = 0;
		double sum = 0;
		if (poly == 'A') {
			while (headA.next != null) {
				sum = sum + ((double) headA.value * (Math.pow(value, c)));
				c++;
				headA = headA.next;
			}
		}else if (poly == 'B') {
			while (headB.next != null) {
				sum = sum + ((double) headB.value * (Math.pow(value, c)));
				c++;
				headB = headB.next;
			}
		}else if (poly == 'C') {
			while (headC.next != null) {
				sum = sum + ((double) headC.value * (Math.pow(value, c)));
				c++;
				headC = headC.next;
			}
		}else if (poly == 'R') {
			while (headR.next != null) {
				sum = sum + ((double) headR.value * (Math.pow(value, c)));
				c++;
				headR = headR.next;
			}
		}else{
			throw e;
		}

		return (float) sum;
	}

	@Override
	public int[][] add(char poly1, char poly2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] subtract(char poly1, char poly2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] multiply(char poly1, char poly2) {
		// TODO Auto-generated method stub
		return null;
	}

}
