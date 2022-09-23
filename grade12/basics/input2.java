package basics;

import java.util.*;

public class input2 {
    public static void main(String []args){
        Scanner kb = new Scanner(System.in);

        
        //a problem occurs when you have a line-based
        //following  token-based. he token-based
        //leaves a newline, then the line-based picks
        //that up and gives you an empty string
        //2 solutions


        //1. use a dummy next line
        /*
        System.out.println("enter age: ");
        int age = kb.nextInt();
        kb.nextLine(); //get the extra newline
        System.out.println("enter name: ");
        String name = kb.nextLine();
        System.out.println(name + " " + age);
        */
        //2. only ever use nextline
        System.out.println("enter age: ");
        int age = Integer.parseInt(kb.nextLine());
        kb.nextLine(); //get the extra newline
        System.out.println("enter name: ");
        String name = kb.nextLine();
        System.out.println(name + " " + age);
        kb.close();
    }
}
