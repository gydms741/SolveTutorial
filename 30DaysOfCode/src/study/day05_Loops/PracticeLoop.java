package study.day05_Loops;

// LOOP :
// A control flow statement that allows code to be executed
// repeatedly based on some given condition

public class PracticeLoop {

    public static void practiceWhileLoop(){
        int x = 0;
        while (x<5){
            System.out.println("The value of x is "+x);
            x++;
        }
    }

    public static void practiceDoWhileLoop(){
        int x = 0;
        do{
            //this will execute once
            //it will execute again each time while(condition) is true
            System.out.println("The value of x is "+ x);
            x++;
        }while (x<10);
    }

    public static void practiceForLoop(){
        for (int x = 0; x<20; x++){
            System.out.println("The value of x is " + x);
            if (x == 10){
                break;
            }
        }
        System.out.println("This is the end");
    }

    public static void gugudan(){
        for (int i = 1; i<10 ; i++){
            for (int j = 1; j<10; j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
        }
    }


    public static void main(String[] args){
        //practiceWhileLoop();
        //practiceDoWhileLoop();
        //practiceForLoop();
        gugudan();
    }
}
