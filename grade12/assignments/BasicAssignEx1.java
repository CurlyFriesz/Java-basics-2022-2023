import java.util.*;

public class BasicAssignEx1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); //make the scanner

        System.out.println("type a word: ");
        String word = kb.nextLine(); //taking input

        String []down = word.split(""); //splits the word at every "" to make an array of every letter
        String []up = word.split(""); // same as above

        for(int i = 0; i < up.length / 2; i++)
        {
            String temp = up[i];
            up[i] = up[up.length - i - 1];
            up[up.length - i - 1] = temp;
        } //takes the "up" array and reverses it to make it read backwards



        System.out.print(word); // top edge of the "square"

        for(int i = 0; i < down.length; i++) {
            System.out.print(down[i] + "\n" + up[i]); // both collumns of the square
            
            //at the end of the for loop, print the bottom edge
            if (i >= down.length-1){
                for(int j = 0; j < up.length; j++) {
                    System.out.print(up[j]);
                }
                break; 
            }
            //print the space between the collumns
            for(int j = 1; j < down.length; j++) {
                System.out.print(" ");
            }
        }
        kb.close();
    }
}
