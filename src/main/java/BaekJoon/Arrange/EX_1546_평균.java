package BaekJoon.Arrange;
//
//세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
//일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
//그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//
//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//
//세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다.
//둘째 줄에 세준이의 현재 성적이 주어진다. 
//이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;

public class EX_1546_평균 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 시험 본 과목의 개수 N
		int N = Integer.parseInt(br.readLine());
		// 성적 중 최댓값 M
		double M = 0;
		
		//과목의 개수(N)을 기반으로 하는 크기를 가진 배열 생성
		double[] arr = new double[N];
		
		//둘째 줄에 공백을 구분자로 한번에 입력하기위해 StringTokenizer 사용
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//배열에 현재 성적들 입력
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 최댓값 찾기
		Arrays.sort(arr); //오름차순 정렬
		M = arr[N-1];
		
		// 점수 변경 : (현재점수/M)*100
		for(int i=0; i< arr.length; i++) {
			arr[i] = (arr[i]/M) * 100;
		}
		double eva = 0;
		
		// 일단 변경된 점수를 모두 더하고
		for(int i=0; i<arr.length; i++) {
			eva += +arr[i];
		}
		// 성적의 개수로 나누어 평균을 구한다.
		eva = eva/N;
		
		//String.format("%.나타낼 소수점자리f",값)을 사용해
		//소수 n번째 자리까지 출력 지정 가능
		System.out.println(eva);
	}
	
}
