package Test;

import java.util.Arrays;
import java.util.Scanner;

public class MinandMax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int[] array = new int [i];
		
		for (int j=0; j<array.length; j++) {
			array[j]=sc.nextInt();
		
		}
		Arrays.sort(array);
		System.out.println(array[0]+" "+array[i-1]);
	}
}
