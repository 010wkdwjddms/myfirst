import java.util.Scanner;

public class Project_Coding_Practice06_Review_jje {

    public static void main(String[] args) {

        // Scanner 클래스를 사용하여 입력받기
        Scanner scan = new Scanner(System.in);

        // 사용자가 입력한 양의 정수값을 inputInt 변수에 저장
        System.out.print("양의 정수를 입력하세요: ");
        int inputInt = scan.nextInt();

        // 합계를 저장할 변수 hap 초기화
        int hap = 0;
        int i = 1; // 초기값 설정

        // while문을 사용하여 1부터 inputInt까지의 합을 계산
        while (i <= inputInt) {
            hap += i; // hap에 i를 더해줌
            i++; // i 값을 1씩 증가시킴
        }

        // 결과 출력
        System.out.println("1부터 " + inputInt + "까지의 합 = " + hap);

        // Scanner 객체 닫기
        scan.close();
    }
}
