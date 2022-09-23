package basics;

public class selection1 {
    public static void main(String[] args) {
        //selection
        int x = 4;

        if(x > 10) {
            System.out.println("big");
        }
        else if (x > 0) {
            System.out.println("small");
        }
        else {
            System.out.println("invalid");
        }

        //conditional operator
        int num = 120;
        num = num > 100 ? 100 : num;
    }
}
