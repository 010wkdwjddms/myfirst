import java.util.Scanner;

public class Project_Coding_Practice05_Review_jje {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자의 입력을 받기 위해 Scanner 객체 생성
        System.out.print("숫자를 입력하세요: ");
        int input = scanner.nextInt(); // 사용자가 입력한 값을 저장

        for (int i = 0; i <= input; i++) { // 0부터 입력된 숫자까지 반복
            if (i % 2 != 0) {
                continue; // i가 홀수일 경우, 아래 코드를 실행하지 않고 다음 반복으로 넘어감
            }

            System.out.print(i);

            if (i < input) {
                System.out.print(", "); // 마지막 숫자 뒤에 쉼표를 붙이지 않도록 조건 설정
            }
        }
        scanner.close(); // Scanner 객체 닫기
    }
}
