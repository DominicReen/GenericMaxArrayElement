import java.util.Scanner;
import java.util.ArrayList;

public class GenericMaxArrayElement {
	
	public static void main(String[] args) {
		
		Integer[] list = new Integer[10]; // create Integer array, length of 10 (Just to make this simple)
		Scanner input = new Scanner(System.in); // create scanner

		System.out.println("Enter 10 numbers, separated by a space:");
		System.out.println("(Note: if you enter more than 10, the extra numbers will be ignored)");
		
		// receive input
		for (int i = 0; i < 10; i++) {
			list[i] = input.nextInt(); 
		}
		
		System.out.println("Max number is: " + max(list)); // call method and print result
		
	}
	
	public static <E extends Comparable<E>> E max(E[] list) {
		
		E max = list[0]; // create variable to hold max number, which initially is equal to the first element in the array
		
		for (int i = 0; i < list.length; i++) {
			E temp = list[i]; // temp changes to the next element in the array each iteration of the loop
			if (temp.compareTo(max) > 0) { // is temp is larger than the current max, make max the current element
				max = temp;
			}
		}
		
		return max;
		
	}
	
}
