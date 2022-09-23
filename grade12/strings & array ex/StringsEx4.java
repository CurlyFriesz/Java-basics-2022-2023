import java.util.Scanner;

public class StringsEx4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double [] marks = new double[8];
        double sum = 0;

        for(int i = 0; i < marks.length; i++) {
            System.out.println("enter a grade: ");
            double grade = kb.nextDouble();

            marks[i] = grade;
            sum += grade;
        }
        
        double avg = sum/8;

        for(int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + "  ");
            if(marks[i] <= avg) {
                System.out.print(avg-marks[i]+" below avg");
                System.out.println("\n");
            } 
            else if(marks[i] >= avg) {
                System.out.print(marks[i]-avg +" above avg");
                System.out.println("\n");
            }
        }

        System.out.println("the total average is "+avg);

        kb.close();
    }
}
