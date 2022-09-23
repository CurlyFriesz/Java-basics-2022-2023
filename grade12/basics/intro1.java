package basics;


//single line

/*
java is a n object oriented
programming language.
this means that "everything" in java 
is either a class or an object. that
even your program needs to be a class
*/

/* in replit, the class needs to be
called main. in any other IDE, it 
simply must match the name you save
it as.
*/

class intro1{
    public static void main(String []args) {
        System.out.println("hello java");
        System.out.println(Math.pow(2, 10));
        String school = "Massey";
        System.out.println(school.length());
    }
}

/*class main - my program needs to be a class.
               I can't have any code outside 
               of my class.

main - this is my main method. a method is a
       function inside a class. all functions
       in java are methods. your main method
       is the first method that is called, it 
       is referred to as the "entry point."

public - in java we can control access to our 
         method and variables. public means
         other classes can see them, private 
         means they cannot.

static - "it belongs to the class" as opposed 
         to belonging to an object.

void - we must state what our methods are 
       returning. void means that it won't 
       return anything.

string [] args - you can pass in parameters
                 to your java program when
                 you run it. this is mostly
                 only done when running from
                 the command line.

system.out.println - prints a value to the 
                     screen, does not take 
                     multiple values 
                     (4,56,6). if you
                     want multiple values,
                     you make them into one
                     big string.

system.out.print - same, but does not go to
                   the next line.

{} - curly brackets control the block sturcture,
     not the indent.

; - ends a statement
*/

