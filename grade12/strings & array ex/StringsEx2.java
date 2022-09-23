import java.util.Arrays;
import java.util.Scanner;

public class StringsEx2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Type message here: ");
        String line = kb.nextLine();

        String line1 = line.substring(0, line.length()/2);
        String line2 = line.substring(line.length()/2);

        char []half1 = new char[line1.length()];
        char []half2 = new char[line2.length()];

        for(int i = 0; i < line1.length(); i++) {
            half1[i] = line1.charAt(i);
        }
        for(int i = 0; i < line2.length(); i++) {
            half2[i] = line2.charAt(i);
        }

        System.out.println(Arrays.toString(half1));
        System.out.println(Arrays.toString(half2));

        for(int i = 0; i < half1.length; i++) {
            System.out.print(half1[i]);
            System.out.print(half2[i]);

            if(line.length()%2 == 0) {
                
            }

            kb.close();
        }
    }
}
