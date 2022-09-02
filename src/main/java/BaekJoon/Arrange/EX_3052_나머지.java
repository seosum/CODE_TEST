package BaekJoon.Arrange;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EX_3052_나머지 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean [] arr = new boolean [42]; 
		// 나머지값이기 때문에 boolean으로 값을 지정해준다
		// 나머지는 0-41이기떄문에 42로 배열을 지정해준다
		// boolean의 초기값은 false이다.
		
		int count = 0;
		// true로 변한 배열값을 세기위한 변수임.
		
		for(int i=0; i< arr.length; i++) {
			// 배열을 0으로 초기화 시켜준다.

			arr[Integer.parseInt(br.readLine())%42] = true;
			// 입력받은 값의 나머지에 해당하는 인덱스를 true로 바꿔준다.
			}
			
				for(boolean value : arr) {
					// 향상된 for문 
					if(value) {
						count++;
					}
				}
				
				System.out.println(count); 
		}
}
