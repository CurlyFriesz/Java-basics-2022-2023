import java.util.Scanner;

public class BasicAssignEx2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a sequence of Bs and Ws: ");
        String seq = kb.nextLine(); //input
        String output = ""; //line to be outputted

        int count = 0;
        for (int i = 0; i < seq.length(); i++) {
            //resets the count to 1 every loop
            count = 1;
            
            //every time the for loop is run, this loop checks if the character of the index is the same as the one after
            while(i < seq.length() - 1 && seq.charAt(i) == seq.charAt(i + 1)) {
                count++;
                i++;
            } 

            //adds the letter and the number of times it occurs
            if(seq.charAt(i) == 'w' || seq.charAt(i) == 'b') {
                output = output + count + seq.charAt(i);
            }
        }
        System.out.println("output: " + output);

        kb.close();
    }
}
