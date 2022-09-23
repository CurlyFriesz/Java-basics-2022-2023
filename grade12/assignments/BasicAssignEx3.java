import java.util.Scanner;

public class BasicAssignEx3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //entering the coordinates for both points of the line
        System.out.println("enter the coordinates of a line (x1, y1, x2, y2): ");
        System.out.println("enter x1: ");
        int x1 = kb.nextInt();
        System.out.println("enter y1: ");
        int y1 = kb.nextInt();
        System.out.println("enter x2: ");
        int x2 = kb.nextInt();
        System.out.println("enter y2: ");
        int y2 = kb.nextInt();

        //coordinates of the point to check for
        System.out.println("enter a point: (x, y) ");
        System.out.println("x: ");
        int x = kb.nextInt();
        System.out.println("y: ");
        int y = kb.nextInt();


        //if the dist between point(x1,y1) to point(x,y) and 
        //the dist between point(x2,y2) to point(x,y) is the
        //same as the length of the line
        if(distance(x1, y1, x, y) + distance(x, y, x2, y2) == (distance(x1, y1, x2, y2))) {
            System.out.println("point is on the line");
        } else {
            System.out.println("point is not on the line");
        }

        kb.close();
    }

    //method that calculates the distance between 2 points
    private static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
    }
}
