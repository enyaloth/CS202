//* Christina Parkhurst - CS 202 Week 6 In-Class Exercises *//
package Week6;

public class RecursionPractice {
    public static int exponential(int x,int y) {
        if (y<0) {
            throw new IllegalArgumentException("Error: Negative number: "+ x);
        }
        else if (y==0) {
            return 1;
        }
        else if (y%2==0) { //Cuts recursion work in half; more efficient
            return exponential(x*x,y/2);
        }
        else {
            return x*exponential(x,y-1);
        }
    }

    public static int factorial(int n) {
        if (n<0) {
            throw new IllegalArgumentException("Error: Negative number: " + n);
        }
        else if (n==0) {
            return 1;
        }
        else {
            System.out.println("n="+n);
            return n*(factorial(n-1));
        }
    }


    public static String writeParentheses(String name, int anum) {
        if (anum<0) { //I'm illegal
            throw new IllegalArgumentException("Error: cannot have negative value: " + anum);
        }
        else if (anum==0) { //Base condition
            return name;
        }
        else {
                return "(" + writeParentheses(name,anum-1) + ")";
        }
    }

    public static void writeRecursiveStars(int anum) {
        if (anum<0) { //I'm illegal
            throw new IllegalArgumentException("Error: cannot have negative value: " + anum);
        }
        else if (anum == 0) { //I'm the base case, done printing the stars or have no stars to print
            System.out.println();
        } else { // More than zero stars
            for (int i=anum; i>0; i--) {
                System.out.print("* ");
            }
            System.out.println();
            writeRecursiveStars(anum-1);
        }
    }
    public static void main(String[] args) {
        //writeStars(5);
        System.out.println();
        writeRecursiveStars(5);
        writeRecursiveStars(4);
        writeRecursiveStars(3);
//        System.out.println(writeParentheses("Hello", 5));
//        System.out.println(writeParentheses("Rebekah", 2));
//        System.out.println(writeParentheses("Recursive fun",0));
//        System.out.println("5!=" + factorial(5));
//        System.out.println("Exponential Method: 4^10=" + exponential(4,10));

        //System.out.print(writeParentheses("Error test",-1));
    }
}



//Recursion calls itself, passing a different parameter each time, until a base case is met.
//It's a method that is a loop -
//One loop structure does the heavy lifting. It's inverted; rather than many objects calling a method, a method calls itself many times.
//FIFO: "First in, first out." LIFO: "Last in, first out." etc.
//It's like asking "what position in line am I?" and asking the next person until you hit the front of the line, or "base" case.
//Keeps asking a question until you get the answer out.
//If (base case) {answer} else {recursive call}
//Functional languages use recursion exclusively; no loops