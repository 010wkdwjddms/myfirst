// 범위 숫자들의 합계값을 구하고 싶은 양의 정수값을 Scanner 클래스를 활용하여 입력 받아서,
//  for문을 활용하여, 입력된 양의 정수값까지  합계값을 구하여
//  화면으로 표시해 주는 자바 프로그램을 제작해 보시기 바랍니다.
//  [실행 결과 예시(1) : Scanner 클래스 활용 5를 입력 받아서, 양의 정수값 변수명 inputInt에 5 대입 예시, 
//  문자열 표현 : "1부터 " + inputInt + "까지의 합 = ", 합계 결과값 변수명 hap,
//  1부터 5까지의 합 = 15]
//  [실행 결과 예시(2) : Scanner 클래스 활용 10을 입력 받아서, 양의 정수값 변수명 inputInt에 10 대입 예시, 
//  문자열 표현 : "1부터 " + inputInt + "까지의 합 = ", 합계 결과값 변수명 hap,
//  1부터 10까지의 합 = 55]

import java.util.Scanner;

public class Project_Coding_Practice06 {

	public static void main(String[] args) {

		// Scanner 클래스를 활용하여 시스템으로부터 입력 받은 값을 변수 in에 담아서
		// scan 객체 참조 변수에 대입해 줍니다.		
		Scanner scan = new Scanner(System.in);



		// Scanner 객체를 닫습니다.
		scan.close();
	}
}
