import java.util.Scanner;

public class BasicEx1 {
    public static void main(String[] args) {
        double total = 0;
        int count = 1;
        int min = 0;
        int max = 0;

        Scanner kb = new Scanner(System.in);
        System.out.println("enter any number (0 to exit): ");
        int num = kb.nextInt();
        total += num;
        min = num;
        max = num;

        while(num != 0) {
            System.out.println("enter a number: ");
            num = kb.nextInt();
            if(num != 0) {
                total += num;
                count++;
                if(num>max) {
                    max = num;
                }
                if(num<min) {
                    min = num;
                }
            }
        }

        System.out.println("the average is "+total/count);
        System.out.println("the largest number is "+max);
        System.out.println("the smallest number is "+min);
        
        kb.close();
    }
}
