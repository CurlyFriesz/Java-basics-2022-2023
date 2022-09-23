import java.util.*;

public class BasicEx4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = kb.nextInt();
        int product = 1;

        for(int i = 1; i < num+1; i++) {
            product *=i;
        }
        System.out.println(product);
        kb.close();
    }
}