package eg.edu.alexu.csd.datastructure.linkedList.cs24_08;

import java.util.Scanner;

public class UserInterFaceChoices {

	Scanner input = new Scanner(System.in);
	App l = new App();

	public void welcome() {
		System.out.println("WELCOME TO THE POLYNOMIAL CALCULATOR FX-1");
		System.out.println("-----------------------------------------");

	}

	public void PrintMenue() {
		System.out.println("Please choose an action");
		System.out.println("-----------------------");

		System.out.println("1- Set a polynomial variable");
		System.out.println("2- Print the value of a polynomial variable");
		System.out.println("3- Add two polynomials");
		System.out.println("4- Subtract two polynomials");
		System.out.println("5- Multiply two polynomials");
		System.out.println("6- Evaluate a polynomial at some point");
		System.out.println("7- Clear a polynomial variable");

		System.out.println("====================================================================");
	}

	public void choice1() {
		System.out.println("Insert the variable name : A, B or C");
		char poly = input.next().charAt(0);
		System.out.println("Insert the polynomial terms in the form :");
		System.out.println("(coeff1 , exponent1 ), (coeff2 , exponent2 ), ..");
		System.out.println("-------Enter '-3' to end the pylonomial---------");
		int[][] arr = new int[10][2];
		int flag = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = input.nextInt();
				if (arr[i][j] == -3) {
					flag = 0;
					break;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		System.out.println("Polynomial A is set");
		l.setPolynomial(poly, arr);
		System.out.println("====================================================================");
	}

	public void choice2() {
		System.out.println("Insert the variable name : A, B or C");
		char poly = input.next().charAt(0);
		System.out.println(l.print(poly));
		System.out.println("====================================================================");

	}

	public void choice3() {
		System.out.println("Insert the variable name : A, B or C");
		char poly1 = input.next().charAt(0);
		System.out.println("Insert the variable name : A, B or C");
		char poly2 = input.next().charAt(0);
		System.out.println(l.add(poly1, poly2));
		System.out.println("====================================================================");
	}

	public void choice4() {
		System.out.println("Insert the variable name : A, B or C");
		char poly1 = input.next().charAt(0);
		System.out.println("Insert the variable name : A, B or C");
		char poly2 = input.next().charAt(0);
		System.out.println(l.subtract(poly1, poly2));
		System.out.println("====================================================================");
	}

	public void choice5() {
		System.out.println("Insert the variable name : A, B or C");
		char poly1 = input.next().charAt(0);
		System.out.println("Insert the variable name : A, B or C");
		char poly2 = input.next().charAt(0);
		System.out.println(l.multiply(poly1, poly2));
		System.out.println("====================================================================");
	}

	public void choice6() {
		System.out.println("Insert the variable name : A, B or C");
		char poly = input.next().charAt(0);
		System.out.println("Insert the float pint");
		float value = input.nextFloat();
		System.out.println(l.evaluatePolynomial(poly, value));
		System.out.println("====================================================================");
	}

	public void choice7() {
		System.out.println("Insert the variable name : A, B or C");
		char poly = input.next().charAt(0);
		l.clearPolynomial(poly);
		System.out.println("====================================================================");
	}

}
