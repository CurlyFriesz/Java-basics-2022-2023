

import java.util.Scanner;

public class StringsEx1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Type a message");
        String mess = kb.nextLine();

        int space = 0;
        for(int i=0; i<mess.length(); i++) {
            if(mess.charAt(i) == ' ') {
                System.out.println(mess.substring(space,i+1));
            }

            space = i+1;
        }

        kb.close();
    }
}
