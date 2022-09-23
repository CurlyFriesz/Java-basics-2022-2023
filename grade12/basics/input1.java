package basics;

import java.util.*;

public class input1 {
  public static void main(String[] args) {
    Scanner kb =  new Scanner((System.in));
    System.out.println("Enter your name: ");
    String name = kb.nextLine();
    System.out.println("Hello, " + name);

    System.out.println("what is your age? ");
    int age = kb.nextInt();
    System.out.println("you will be " + (age+5) + " in 5 years");
    System.out.println("how much money do you have?");
    int money = kb.nextInt();
    System.out.println("one day you will have $" + money * 2);

    //tokens 
    //this is a test   <---- eacg word is a token
    System.out.println("Describe yourself in 3 words, ");
    String w1 = kb.next();
    String w2 = kb.next();
    String w3 = kb.next();
    System.out.println(w1 + " " + w2 + " " + w3);

    /*  token-based:
       -skips over all whitespace (space, tab, new line)
       -reads one token
       
       line-based
       -does not skip
       reads up to and including newline, discards newline
     */

     kb.close();
  }  
}
