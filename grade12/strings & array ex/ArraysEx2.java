import java.util.Scanner;

public class ArraysEx2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String []days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String []days2 = new String[7];

        for(int i = 0; i < days.length-1; i++) {
            days2[i] = days[i+1];
        }
        days2[6] = days[0];

        System.out.println("type a message: ");
        String line = kb.nextLine();

        String replaceString = "";

        for(int i = 1; i < days.length; i++) {
            replaceString=line.replace(days[i], days2[i]);
        }

        System.out.println(replaceString);
        
        kb.close();
    }
}
