public class Project_Coding_Practice08 {

    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            if (i % 2 != 0) {
                continue;
            }
            
            System.out.println("구구단 " + i + "단:");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
