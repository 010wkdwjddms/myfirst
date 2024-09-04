// 대소문자 구분을 안하는 지정된 영어 문자열을 입력 받아서
// 다음 결과 화면을 구현하는 자바 프로그램을 제작하시기 바랍니다.
// [실행 결과 화면(1) : KBS 또는 kbs, kBs 등 입력]
// 지정된 영어 문자열을 입력해 주세요 ==> KBS
// KBS는 한국방송공사입니다.
// [실행 결과 화면(2) : SBS 또는 sbs, sBs 등 입력]
// 지정된 영어 문자열을 입력해 주세요 ==> SBS
// SBS는 서울방송입니다.
// [실행 결과 화면(3) : 대소분자를 구분 안하는 KBS 또는 SBS 지정 문자열 이외의 문자열 입력]
// 지정된 영어 문자열을 입력해 주세요 ==> KKK
// KKK는 지정된 영어 문자열이 아닙니다.

import java.util.Scanner;

public class Project_Coding_Practice04_Review_jnr {

	public static void main(String[] args) {
		// Scanner 클래스를 활용하여 시스템으로부터 입력 받은 값을 변수 in에 담아서
		// scan 객체 참조 변수에 대입해 줍니다.
		Scanner scan = new Scanner(System.in);

		System.out.println("지정된 영어 문자열을 입력해 주세요=======> ");
		 String input = scan.nextLine();

	        // 입력된 문자열을 대소문자 구분 없이 처리하기 위해 toUpperCase() 메소드를 사용합니다.
	        String uppercaseInput = input.toUpperCase();

	        // 조건에 따라 출력 메시지를 결정합니다.
	        switch (uppercaseInput) {
	            case "KBS":
	                System.out.println("KBS는 한국방송공사입니다.");
	                break;
	            case "SBS":
	                System.out.println("SBS는 서울방송입니다.");
	                break;
	            default:
	                System.out.println(uppercaseInput + "는 지정된 영어 문자열이 아닙니다.");
	                break;
	        }

	        // 객체 참조 변수 scan의 resource 자원 사용을 종결 처리합니다.
	        scan.close();
	    }
	}



