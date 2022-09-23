import java.util.Scanner;

public class StringsEx3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("write a message with numbers: ");
        String line = kb.nextLine();

        /*String ans = "";
        for(int i = 0; i < line.length(); i++) {
            if(Character.isDigit(i)) {
                ans += i;
            }
        }

        System.out.println(Integer.parseInt(ans));*/
        //regular expression
        String ans = line.replaceAll("[^0-9]", "");
        System.out.println(Integer.parseInt(ans));
        kb.close();
    }
}
