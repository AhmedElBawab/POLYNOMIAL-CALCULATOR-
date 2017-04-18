package eg.edu.alexu.csd.datastructure.linkedList.cs24_08;

import eg.edu.alexu.csd.datastructure.linkedList.IPolynomialSolver;

public class SingleApp implements IPolynomialSolver {

	RuntimeException e = new RuntimeException();
	public singleLinkedList R = new singleLinkedList();
	public singleLinkedList A = new singleLinkedList();
	public singleLinkedList B = new singleLinkedList();
	public singleLinkedList C = new singleLinkedList();

	@Override
	public void setPolynomial(char poly, int[][] terms) {
		// TODO Auto-generated method stub
		int index = terms[0][1];
		int counter = 0;
		if (poly == 'A') {
			while (index >= 0) {
				if (terms[counter][1] != index) {
					A.add(0);
					index--;
				} else {
					A.add(terms[counter][0]);
					index--;
					counter++;
				}
			}
		} else if (poly == 'B') {
			while (index >= 0) {
				if (terms[counter][1] != index) {
					B.add(0);
					index--;
				} else {
					B.add(terms[counter][0]);
					index--;
					counter++;
				}
			}
		} else if (poly == 'C') {
			while (index >= 0) {
				if (terms[counter][1] != index) {
					C.add(0);
					index--;
				} else {
					C.add(terms[counter][0]);
					index--;
					counter++;
				}
			}
		} else {
			throw e;
		}
	}

	@Override
	public String print(char poly) {
		StringBuilder string = new StringBuilder();
		if (poly == 'A') {
			if (A.head == null) {
				return null;
			}
			int counter = (int) A.head.value;
			SingleListNode i = A.head;
			while (counter >= 0) {
				if (i.value.equals(0)) {
					i = i.next;
					counter--;
					continue;
				}
				if ((int) i.value != 1 || counter == 0) {
					string.append(i.value);
				}
				if (counter != 0) {
					string.append('x');
				}
				if (counter != 1 && counter != 0) {
					string.append('^');
					string.append(counter);
				}
				if (counter != 0) {
					string.append('+');
				}
				counter--;
				i = i.next;
			}
		} else if (poly == 'B') {
			if (B.head == null) {
				return null;
			}
			int counter = (int) B.head.value;
			SingleListNode i = B.head;
			while (counter >= 0) {
				if (i.value.equals(0)) {
					i = i.next;
					counter--;
					continue;
				}
				string.append(i.value);
				string.append('x');
				string.append('^');
				string.append(counter);
				if (counter != 0) {
					string.append('+');
				}
				counter--;
				i = i.next;
			}
		} else if (poly == 'C') {
			if (C.head == null) {
				return null;
			}
			int counter = (int) C.head.value;
			SingleListNode i = C.head;
			while (counter >= 0) {
				if (i.value.equals(0)) {
					i = i.next;
					counter--;
					continue;
				}
				string.append(i.value);
				string.append('x');
				string.append('^');
				string.append(counter);
				if (counter != 0) {
					string.append('+');
				}
				counter--;
				i = i.next;
			}
		} else if (poly == 'R') {
			if (R.head == null) {
				return null;
			}
			int counter = (int) R.head.value;
			SingleListNode i = R.head;
			while (counter >= 0) {
				if (i.value.equals(0)) {
					i = i.next;
					counter--;
					continue;
				}
				string.append(i.value);
				string.append('x');
				string.append('^');
				string.append(counter);
				if (counter != 0) {
					string.append('+');
				}
				counter--;
				i = i.next;
			}
		} else {
			throw e;
		}
		return String.valueOf(string);
	}

	@Override
	public void clearPolynomial(char poly) {
		// TODO Auto-generated method stub
		if (poly == 'A') {
			A.head = null;
		} else if (poly == 'B') {
			B.head = null;
		} else if (poly == 'C') {
			C.head = null;
		} else if (poly == 'R') {
			R.head = null;
		} else {
			throw e;
		}
	}

	@Override
	public float evaluatePolynomial(char poly, float value) {
		// TODO Auto-generated method stub
		float sum = 0;
		if (poly == 'A') {
			if (A.head == null) {
				return 0;
			}
			int counter = (int) A.head.value;
			SingleListNode i = A.head;
			while (counter >= 0) {
				if (i.value.equals(0)) {
					i = i.next;
					counter--;
					continue;
				}
				sum = (float) (sum + ((Integer) i.value * (Math.pow(value, counter))));
				;
			}
			counter--;
			i = i.next;
		} else if (poly == 'B') {
			if (B.head == null) {
				return 0;
			}
			int counter = (int) B.head.value;
			SingleListNode i = B.head;
			while (counter >= 0) {
				if (i.value.equals(0)) {
					i = i.next;
					counter--;
					continue;
				}
				sum = (float) (sum + ((Integer) i.value * (Math.pow(value, counter))));
				;
			}
			counter--;
			i = i.next;
		} else if (poly == 'C') {
			if (C.head == null) {
				return 0;
			}
			int counter = (int) C.head.value;
			SingleListNode i = C.head;
			while (counter >= 0) {
				if (i.value.equals(0)) {
					i = i.next;
					counter--;
					continue;
				}
				sum = (float) (sum + ((Integer) i.value * (Math.pow(value, counter))));
				;
			}
			counter--;
			i = i.next;
		} else if (poly == 'R') {
			if (R.head == null) {
				return 0;
			}
			int counter = (int) R.head.value;
			SingleListNode i = R.head;
			while (counter >= 0) {
				if (i.value.equals(0)) {
					i = i.next;
					counter--;
					continue;
				}
				sum = (float) (sum + ((Integer) i.value * (Math.pow(value, counter))));
				;
			}
			counter--;
			i = i.next;
		} else {
			throw e;
		}
		return sum;
	}

	@Override
	public int[][] add(char poly1, char poly2) {
		// TODO Auto-generated method stub
		if (R.head != null) {
			clearPolynomial('R');
		}
		if ((poly1 == 'A' & poly2 == 'B') || (poly1 == 'B' & poly2 == 'A')) {
			int counter1 = (int) A.head.value;
			int counter2 = (int) B.head.value;
			int min;
			if (counter1 == 0 && counter2 == 0) {
				return null;
			}
			if (counter1 > counter2) {
				min = counter2;
			} else {
				min = counter1;
			}
			SingleListNode i = A.head;
			SingleListNode j = B.head;
			while (min >= 0) {
				int sum = (int) ((Integer) i.value + (Integer) j.value);
				R.add(sum);
				i = i.next;
				j = j.next;
				min--;
			}
			while (i.next != null) {
				R.add(i.value);
				i = i.next;
			}
			while (j.next != null) {
				R.add(j.value);
				j = j.next;
			}
		} else if ((poly1 == 'B' & poly2 == 'C') || (poly1 == 'C' & poly2 == 'B')) {
			int counter1 = (int) B.head.value;
			int counter2 = (int) C.head.value;
			int min;
			if (counter1 == 0 && counter2 == 0) {
				return null;
			}
			if (counter1 > counter2) {
				min = counter2;
			} else {
				min = counter1;
			}
			SingleListNode i = B.head;
			SingleListNode j = C.head;
			while (min >= 0) {
				int sum = (int) ((Integer) i.value + (Integer) j.value);
				R.add(sum);
				i = i.next;
				j = j.next;
				min--;
			}
			while (i.next != null) {
				R.add(i.value);
				i = i.next;
			}
			while (j.next != null) {
				R.add(j.value);
				j = j.next;
			}
		} else if ((poly1 == 'A' & poly2 == 'C') || (poly1 == 'C' & poly2 == 'A')) {
			int counter1 = (int) A.head.value;
			int counter2 = (int) C.head.value;
			int min;
			if (counter1 == 0 && counter2 == 0) {
				return null;
			}
			if (counter1 > counter2) {
				min = counter2;
			} else {
				min = counter1;
			}
			SingleListNode i = A.head;
			SingleListNode j = C.head;
			while (min >= 0) {
				int sum = (int) ((Integer) i.value + (Integer) j.value);
				R.add(sum);
				i = i.next;
				j = j.next;
				min--;
			}
			while (i.next != null) {
				R.add(i.value);
				i = i.next;
			}
			while (j.next != null) {
				R.add(j.value);
				j = j.next;
			}
		} else {
			throw e;
		}
		int counter = (int) R.head.value;
		int arr[][] = new int[counter][2];
		SingleListNode l = R.head;
		for (int k = 0; k <= counter; k++) {
			arr[k][0] = (int) l.value;
			l = l.next;
			arr[k][1] = counter - k;
		}
		return arr;
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
