package eg.edu.alexu.csd.datastructure.linkedList.cs24_08;

import eg.edu.alexu.csd.datastructure.linkedList.IPolynomialSolver;

public class App implements IPolynomialSolver {
	
	private DoubleLinkedList R = new DoubleLinkedList();

	private DoubleLinkedList A = new DoubleLinkedList();

	private DoubleLinkedList B = new DoubleLinkedList();

	private DoubleLinkedList C = new DoubleLinkedList();
	
	

	@Override
	public void setPolynomial(char poly, int[][] terms) {
		// TODO Auto-generated method stub
		
		if(poly == 'A'){
			
			for(int j=0;j<terms.length;j++){
				for(int i=0;i<terms[0].length;i++){
					if(terms[0][i] == 0){
						A.add(i, 0);
					}
					else{
						A.add(i, terms[0][i]);
					}
				}
			}
		}
		if(poly == 'B'){
			
			for(int i=0;i<terms[0].length;i++){
				if(terms[0][i] == 0){
					B.add(i, 0);
				}
				else{
				B.add(i, terms[0][i]);
				}
			}
		}
		if(poly == 'C'){
			for(int i=0;i<terms[0].length;i++){
				if(terms[0][i] == 0){
					C.add(i, 0);
				}
				else{
				C.add(i, terms[0][i]);
				}
			}
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
		int c=0;
		
		if(poly == 'A'){
			while (tailA.pre != null){
				c++;
				tailA = tailA.pre;
			}
			if(A.head == null){
				return null;
			}
			else{
				while (tailA.pre != null){
					if((Integer)tailA.value != 0){
					if(c != 0){
						string.append(tailA.value);
						string.append('x');
						string.append('^');
						string.append(c);
						string.append('+');
					}
					else{
					    string.append(tailA.value);	
					}
					}
					c--;
					tailA = tailA.pre;
				}
			}
		}
		
		if(poly == 'B'){
			while (tailB.pre != null){
				c++;
				tailB = tailB.pre;
			}
			if(B.head == null){
				return null;
			}
			else{
				while (tailB.pre != null){
					if((Integer)tailB.value != 0){
					if(c != 0){
						string.append(tailB.value);
						string.append('x');
						string.append('^');
						string.append(c);
						string.append('+');
					}
					else{
					    string.append(tailB.value);	
					}
					}
					c--;
					tailB = tailB.pre;
				}
			}
		}
		
		if(poly == 'C'){
			while (tailC.pre != null){
				c++;
				tailC = tailC.pre;
			}
			if(C.head == null){
				return null;
			}
			else{
				while (tailC.pre != null){
					if((Integer)tailC.value != 0){
					if(c != 0){
						string.append(tailC.value);
						string.append('x');
						string.append('^');
						string.append(c);
						string.append('+');
					}
					else{
					    string.append(tailC.value);	
					}
					}
					c--;
					tailC = tailC.pre;
				}
			}
		}
		
		if(poly == 'R'){
			while (tailR.pre != null){
				c++;
				tailR = tailR.pre;
			}
			if(R.head == null){
				return null;
			}
			else{
				while (tailR.pre != null){
					if((Integer)tailR.value != 0){
					if(c != 0){
						string.append(tailR.value);
						string.append('x');
						string.append('^');
						string.append(c);
						string.append('+');
					}
					else{
					    string.append(tailR.value);	
					}
					}
					c--;
					tailR = tailR.pre;
				}
			}
		}
		return String.valueOf(string);
		
		
	}

	@Override
	public void clearPolynomial(char poly) {
		// TODO Auto-generated method stub
		
		if(poly == 'A'){
			doubleListNode j = A.head.next;
			while(j != null){
				doubleListNode i = A.head;
				
				i.next = null;
				j.pre = null;
				A.head = j;
				j = j.next;
			}
		}
		
		if(poly == 'B'){
			doubleListNode j = B.head.next;
			while(j != null){
				doubleListNode i = B.head;
				
				i.next = null;
				j.pre = null;
				B.head = j;
				j = j.next;
			}
		}
		
		if(poly == 'C'){
			doubleListNode j = C.head.next;
			while(j != null){
				doubleListNode i = C.head;
				
				i.next = null;
				j.pre = null;
				C.head = j;
				j = j.next;
			}
		}
		
		if(poly == 'R'){
			doubleListNode j = R.head.next;
			while(j != null){
				doubleListNode i = R.head;
				
				i.next = null;
				j.pre = null;
				R.head = j;
				j = j.next;
			}
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
		double sum=0;
		if(poly == 'A'){
			while(headA.next != null){
				sum = sum + ((double)headA.value * (Math.pow(value, c)));
				c++;
				headA = headA.next;
			}
			
		}
		
		if(poly == 'B'){
			while(headB.next != null){
				sum = sum + ((double)headB.value * (Math.pow(value, c)));
				c++;
				headB = headB.next;
			}
			
		}
		
		if(poly == 'C'){
			while(headC.next != null){
				sum = sum + ((double)headC.value * (Math.pow(value, c)));
				c++;
				headC = headC.next;
			}
			
		}
		
		if(poly == 'R'){
			while(headR.next != null){
				sum = sum + ((double)headR.value * (Math.pow(value, c)));
				c++;
				headR = headR.next;
			}
			
		}
		
		
		return (float)sum;
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
