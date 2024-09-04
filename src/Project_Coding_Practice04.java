import java.util.Scanner;

public class Project_Coding_Practice04 {

    public static void main(String[] args) {
        // Scanner 클래스를 활용하여 시스템으로부터 입력 받은 값을 변수 in에 담아서
        // scan 객체 참조 변수에 대입해 줍니다.
        Scanner scan = new Scanner(System.in);

        // 사용자로부터 정수를 입력받습니다.
        System.out.print("임의의 정수를 입력해 주세요 ==> ");
        int in = scan.nextInt();

        // 입력된 정수가 양수, 음수, 또는 0인지 판단하여 출력합니다.
        if (in > 0) {
            System.out.println(in + "은(는) 양수입니다.");
        } else if (in < 0) {
            System.out.println(in + "은(는) 음수입니다.");
        } else {
            System.out.println(in + "은(는) 0입니다.");
        }

        // 객체 참조 변수 scan의 resource 자원 사용을 종결 처리합니다.
        scan.close();
    }
}
