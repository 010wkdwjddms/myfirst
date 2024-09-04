import java.util.Scanner;

public class Project_Coding_Practice07 {

    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        
        // 사용자로부터 입력값 받기
        System.out.print("숫자를 입력하세요: ");
        int input = scan.nextInt();
        
        int i = 1; // 초기값 설정
        
        // while 문을 사용하여 1부터 입력값까지 반복
        while (i <= input) {
            if (i % 3 == 0) { // i가 3의 배수인 경우
                System.out.print(i);
                
                if (i + 3 <= input) { // 다음 3의 배수가 입력값을 넘지 않을 때만 쉼표 출력
                    System.out.print(", ");
                }
            }
            i++; // i 값을 증가시켜 다음 숫자로 넘어감
        }

        scan.close(); // Scanner 객체 닫기
    }
}










