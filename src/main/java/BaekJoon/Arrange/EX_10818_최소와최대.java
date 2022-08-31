package BaekJoon.Arrange;

import java.util.Scanner;

public class EX_10818_최소와최대 {
	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);
		int max = -1000000; //비교를 위해 max는 가장작은값
		int min = 1000000; //min은 큰값으로 지정해준다.
		int n = sc.nextInt(); //n 지정
		int[] numbers = new int[n];  //n개만큼 배열 생성 

		   for(int i = 0; i < n; i++){ 
		      numbers[i] = sc.nextInt();
		      if (max < numbers[i]) { 
		      max = numbers[i]; //최솟값 찾는 과정
		      }    
		      if (min > numbers[i]) {
		      min = numbers[i]; //최대값 찾는 과정
		      }        
		   } //for문종료
		   System.out.println(min + " " + max);
		}

	
}
