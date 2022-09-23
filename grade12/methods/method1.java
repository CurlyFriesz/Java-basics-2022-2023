public class method1 {
    static void hi(){
        System.out.println("hello");
    }

    //2 methods with the same name is "method overloading"
    //they must have a different "parameter signature" so java
    // can figure out which one to call.
    static void hi(String name) {
        System.out.println("Hello, " + name);
    }

    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        hi();
        hi("Savio");
        System.out.println(square(10));
    }
}


