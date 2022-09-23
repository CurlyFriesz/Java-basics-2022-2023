public class string2 {
    public static void main(String[] args) {
        String name = "Massey";
        name = "Vincent " + name; //if doing a lot of this on a contes, use a StringBuilder

        // for(int i=0; i<name.length(); i++) {
        //     System.out.println(name.charAt(i));
        // }

        // //getting at parts
        // System.out.println(name.substring(2, 6));
        // System.out.println(name.substring(2));
        if(name.equals("Vincent Massey")) {
            System.out.println("same");
        }
        else{
            System.out.println("Not the same");
        }
        String ans = String.format("Answer %.2f", 432.0);
        System.out.println(ans);
        //location of char
        System.out.println(name.indexOf('a'));
        System.out.println(name.contains("ss"));
    }
}
