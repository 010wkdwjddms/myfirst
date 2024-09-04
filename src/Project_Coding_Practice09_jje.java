import java.util.Scanner;

public class Project_Coding_Practice09_jje {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

   
        System.out.print("2부터 9까지의 구구단 중에서 알고 싶은 단을 입력해 주세요 ==> ");
        int dan = scan.nextInt();

  
        if (dan >= 2 && dan <= 9) {
            System.out.println("[" + dan + "단]");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " X " + i + " = " + (dan * i));
            }
        } else {
            System.out.println("2부터 9 사이의 값을 입력해 주세요.");
        }
        scan.close();
    }
}
