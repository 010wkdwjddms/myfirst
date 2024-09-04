import java.util.Scanner;

public class Project_Coding_Practice07_Review_jje {
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
        
       
        System.out.println("알파벳 소문자 하나를 입력하세요: ");
        char inputChar = scan.next().charAt(0);
        
    
        char i = 'a'; 
        
        while (i <= inputChar) {
            System.out.print(i); 
            if (i < inputChar) { 
                System.out.print(", "); 
            }
            i++;
        }
        
        System.out.println();
        
        scan.close();
    }
}






