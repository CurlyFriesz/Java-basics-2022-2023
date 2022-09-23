import java.util.Arrays;

//parameters
//ALL Parameters in java are call-by-value
//value in the variable is passed to the mehtod

public class method2 {
    //                   parameter (formal parameter)
    static void doctorfy(String name){
        name = "Dr. " + name;
    }

    static void twice(int x) {
        x *= 2;
    }

    static void twice(int []vals) {
        for(int i = 0; i<vals.length; i++){
            vals[i] *=2;
        }
    }

    public static void main(String[] args) {
        String name = "Savio";
        //             argument (actual parameter)
        doctorfy(name);
        int []x={12, 5, 23, 8};
        twice(x);
        System.out.println(Arrays.toString(x));
    }
}
