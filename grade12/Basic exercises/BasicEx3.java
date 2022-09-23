import java.util.Scanner;

public class BasicEx3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a number from 1 to 50");
        int num = kb.nextInt();

        if(num > 0 && num < 50) {
            for(int i = 1; i < num+1; i++) {
                if(num % i == 0) {
                    System.out.println(i);
                }
            }
        }
        else {
            System.out.println("invalid entry");
        }
        kb.close();
    }
}
