import java.util.*;

public class BasicAssignEx4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int count = 0;
        double total = 0;

        for(int i = 0; i < 10000; i++) {
            //reset the following variable every loop
            boolean duplicate = false;
            int []days = new int[365];
            count = 0;
            
            //adds 1 to the array element of a random index until it detects a 2
            while(true) {
                int day = rand.nextInt(0,365);
                days[day] += 1;
                count++;

                //if it detects a 2 in the array, the loop is broken
                for(int j = 0; j < days.length; j++) {
                    if(days[day] == 2) {
                        duplicate = true;
                        break;
                    }
                }
                //breaks the while loop
                if(duplicate == true) {
                    break;
                }
            }
            //adds the count to the total every time the while loop is broken
            total += count;
        }

        //prints the average
        System.out.println(total/10000);
    }
}
