import java.util.*;

public class BasicAssognEx5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a code: ");
        String code = kb.nextLine();

        boolean numeric = true;
        boolean space = false;
        boolean caps = false;
        int spacecount = 0;
        int numcount = 0;
        int lowercount = 0;
        String []numbers = new String[6];

        //checks for how many spaces are in the code
        for(int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == ' ') {
                spacecount++;
            } 
        }

        //if the number of spaces is more or less than 1 then 
        //the code is not valid, otherwise it moves to the next 
        //check
        if(spacecount == 0) {
            space = false;
        } else if(spacecount == 1) {
            space = true;
        }

        if(space == true) {
            //splits the code in two parts from the space
            String [] parts = code.split(" ");
            String prt1 = parts[0];
            String prt2 = parts[1];

            //checks if the characters in the 2nd prt are numbers
            try {
                Integer.parseInt(prt2);
            } catch (NumberFormatException e) {
                numeric = false;
            }

            if(numeric) {
                //splits the 1st prt into multiple chars in an array
                String [] part1 = prt1.split("");
                int x = 0;

                //if the character of the index i is a number, 
                //it gets added to an array of numbers
                for(int i = 0; i < part1.length; i++) {
                    try{
                        Integer.parseInt(part1[i]);
                        numcount++;
                        numbers[x] = part1[i];
                        x++;
                    } catch (NumberFormatException e) {
                        continue;
                    }
                }

                //removes all numbers from the 1st prt
                for(int i = 0; i < part1.length; i++) {
                    try{
                        Integer.parseInt(part1[i]);
                    } catch (NumberFormatException e) {
                        //checks if the letter of the index i is uppercase
                        if(part1[i].equals(part1[i].toUpperCase())) {
                            caps = true;
                        } else {
                            lowercount++;
                            caps = false;
                        }
                        System.out.println(caps);
                        continue;
                    }
                }
                
                if(numcount == 6) {
                    //takes the numbers in groups of 2 and turns them into one number
                    int num1 = Integer.parseInt(numbers[0] + numbers[1]);
                    int num2 = Integer.parseInt(numbers[2] + numbers[3]);
                    int num3 = Integer.parseInt(numbers[4] + numbers[5]);

                    //checks if the all the numbers together = the 2nd prt
                    if(num1*num2*num3 == Integer.parseInt(prt2)) {
                        System.out.println(caps);
                        if(caps == true && lowercount == 0) {
                            System.out.println("this code is valid");
                        } else {
                            System.out.println("Invalid!! character in 1st can only be capital");
                        }
                    } else {
                        System.out.println("invalid!! " + num1 + "*" + num2 + "*" + num3 + " does not equal " + prt2);
                    }
                } else {
                    System.out.println("invalid!! 1st part must include 6 numbers");
                }

            } else {
                System.out.println("invalid!! second part must be numeric");
            }

        } else {
            System.out.println("invalid!! one space required between 1st and 2nd part");
        }

        kb.close();
    }
}
