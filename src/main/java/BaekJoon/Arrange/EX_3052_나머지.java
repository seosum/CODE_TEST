package BaekJoon.Arrange;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EX_3052_나머지 {
	public static void main(String[] args) throws IOException{
		
		boolean[] arr = new boolean[42];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i <10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		
	}
		int count = 0;
		for(boolean value : arr) {
			if(value) {
				count++;
			}
		}
	}
}
