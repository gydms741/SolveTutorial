package study.day16_Exceptions;
/*
What is an Exception?
- An Event that occurs during the execution of a program
- Disrupts the normal flow of the program's instructions
- Something when wrong in your program
- Your program errors and exits abnormally

What is an Exceptional event?
- A problem that arises during the execution of your program and disrupts your program
- As a result, the program terminates and exits abnormally

How do we handle these?
1. Checked Exceptions
    - Occurs at compile time(syntax)
2. Unchecked Exceptions
    - Occurs at the time your program is executed(logic)
 */

public class ExceptionsPractice {

    public static void main(String[] args){
        //int[] intArray = new int[10];
        //System.out.println(intArray[10]);//ArrayIndexOutOfBoundException

        try {
            int[] c = new int[6];
            System.out.println("Element 6 at index 5 = " + c[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown" + e);
        }
        finally {
            System.out.println("Finally clause");
        }
       // System.out.println("Finally Finished try-catch");
    }
}
/*
Try-Catch Block
Try{
    Do this until we get an exception
}Catch(Type_Of_Error E){
    Do this if we get Type_Of_Error
    in the try
}Finally{
    Do this no matter what
}
 */

