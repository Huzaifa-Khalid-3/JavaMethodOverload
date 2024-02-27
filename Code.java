/*
 * Author: Huzaifa Khalid
 * Date: 2024-02-26
 * Purpose: Porgram uses overloaded method to perform simple operation
 */
package MethodOverload;
import java.util.*;

public class Code {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
    // overloads the integer addition method
		System.out.println("Enter integer a: ");
		int a = k.nextInt();
		System.out.println("Enter integer b: ");
		int b = k.nextInt();
		System.out.println("Sum of a and b is "+add(a,b));
		System.out.println("Enter integer c: ");
		int c = k.nextInt();
		k.nextLine();
		System.out.println("Sum of a, b and c is "+add(a,b,c));

    // overloads the string concatination method
		System.out.println("Enter String a: ");
		String a1 = k.nextLine();
		System.out.println("Enter String b: ");
		String b2 = k.nextLine();
		System.out.println("concat of a and b is "+combine(a1,b2));
		System.out.println("Enter String c: ");
		String c3 = k.nextLine();
		System.out.println("concat of a, b, and c is "+combine(a1,b2,c3));
		
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	static String combine(String a, String b) {
		return a.concat(b);
	}
	static String combine(String a, String b, String c) {
		return a.concat(b).concat(c);
	}

}
