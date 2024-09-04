import java.util.Scanner;

public class Project_Coding_Practice10_while_jje_Question {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("3의 배수값을 알고 싶은 입력값을 입력해 주세요 ==> ");
        int input = scan.nextInt();
        
        int i = 1; 
        int sum = 0;  

        while (i <= input) {
            if (i % 3 == 0) { 
                System.out.println("3의 배수값 = " + i);
                sum += i;
            }
            i++;  
        }

        System.out.println("1부터 " + input + "까지 숫자 중에서 3의 배수값들의 합 = " + sum);
        
        scan.close();
    }
}
