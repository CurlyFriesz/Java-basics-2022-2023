import java.util.Scanner;

public class BasicEx2 {
   public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("enter a number: ");
        double num = kb.nextDouble();

        System.out.println("enter X: ");
        double x = kb.nextDouble();

        double sum = 0;

        for(int i = 0; i <= num; i++) {
            sum += (Math.pow(x, i));
        }

        System.out.printf("answer is: %-10.2f*\n", sum);

        kb.close();
   }
}

/*
 prinf (format string, value)
 format strinf can have format specifiers 
 format specifier
 %s - string
 %d - int 
 %f - double
 %c - char
 spacing
 --------
 %12s - 12 space field, right aligned
 %-12d - 12 space field left aligned
 %10.2. - 10 total, 2 after decimal
 */
