package q4pattern;

import java.util.Scanner;


public class AssignQ4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, i, j, a[][];
		
		System.out.println("HOW MANY STEPS?");
		n = sc.nextInt();
		a = new int[n][n];
		
		System.out.println("\nOUTPUT:\n");
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++)
				System.out.print(j+ " ");

			System.out.println();
		}
	}
}
