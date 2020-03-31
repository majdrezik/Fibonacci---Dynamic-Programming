import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
	
	private static int[] fiboArray;
	
	public static int[] findFibonacci() {
		System.out.println("Enter a number to generate a Fibonacci sequence till this number:");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		fiboArray = new int[length];
		return calculateFibonacci(length);
	}
	
	public static int[] calculateFibonacci(int n) {
		fiboArray[0] = fiboArray[1] = 1;
		
		for(int i=2 ; i<n;i++) {
			fiboArray[i] = fiboArray[i-1] + fiboArray[i-2];
		}
		return fiboArray;
	
	}
	
	

	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(findFibonacci()));
	}
	
	
}
