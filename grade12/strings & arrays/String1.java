import java.awt.*;

public class String1 {
    public static void main(String[] args) {
        Point pt = new Point(20, 50);
        Point p2 = pt;
        
        p2.move(80, 100);

        System.out.println(pt);
        System.out.println(p2);
    }
}
