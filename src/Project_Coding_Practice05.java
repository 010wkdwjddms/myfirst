//다음의 [실행 결과값]과 같이 출력되도록
//if문과 break, continue, for문을 이용해서
//자바 프로그램을 제작하시기 바랍니다.
//
//[실행 결과값]
//0, 2, 4, 6, 8, 10

public class Project_Coding_Practice05 {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // i가 홀수면 다음 반복으로 넘어갑니다.
            }

            System.out.print(i);

            if (i < 10) {
                System.out.print(", "); // 마지막 숫자 뒤에 쉼표를 붙이지 않도록 조건 설정
            } else {
                break; // i가 10이면 반복문을 종료합니다.
            }
        }
    }
}
