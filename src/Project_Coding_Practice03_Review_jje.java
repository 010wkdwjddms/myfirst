// 두 정수를 입력 받아서, 다음의 결과 화면과 같이 나오게 하는
// 자바 프로그램을 제작하시기 바랍니다.
// 결과 화면은 다음과 같이 구현하시기 바랍니다.
// 결과 화면(1)
// 첫 번째 정수를 입력해 주세요 ==> 
// 5
// 두 번째 정수를 입력해 주세요 ==> 
// 7
// 두 번째 입력값 7이 더 큽니다.
// 결과 화면(2)
// 첫 번째 정수를 입력해 주세요 ==> 
// 8
// 두 번째 정수를 입력해 주세요 ==> 
// 3
// 첫 번째 입력값 8이 더 큽니다.
// 결과 화면(3)
// 첫 번째 정수를 입력해 주세요 ==> 
// 5
// 두 번째 정수를 입력해 주세요 ==> 
// 5
// 입력하신 두개의 숫자는 같은 값입니다.

import java.util.Scanner;

public class Project_Coding_Practice03_Review_jnr {
	public static void main(String[] args) {
		
		// Scanner 클래스를 활용하여 시스템으로부터 입력 받은 값을 변수 in에 담아서
		// scan 객체 참조 변수에 대입해 줍니다.
		Scanner scan = new Scanner(System.in);
		
		 // 첫 번째 정수 입력
        System.out.print("첫 번째 정수를 입력해 주세요 ==> ");
        int num1 = scan.nextInt();
        
        // 두 번째 정수 입력
        System.out.print("두 번째 정수를 입력해 주세요 ==> ");
        int num2 = scan.nextInt();
        
        // 크기 비교 및 결과 출력
        if (num1 > num2) {
            System.out.println("첫 번째 입력값 " + num1 + "이(가) 더 큽니다.");
        } else if (num1 < num2) {
            System.out.println("두 번째 입력값 " + num2 + "이(가) 더 큽니다.");
        } else {
            System.out.println("입력하신 두개의 숫자는 같은 값입니다.");
        }
        

		
		// 객체 참조 변수 scan의 resource 자원 사용을 종결 처리합니다.
		scan.close();		
	}
}


