package study.day12_Inheritance;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

class Person{
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    //Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ","+firstName
                +"\nID: " + idNumber
        );
    }
}

class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public char calculate(){
        OptionalDouble average = Arrays.stream(testScores).average();

        if (average.getAsDouble()<40){
            return 'T';
        }else if (average.getAsDouble()<55){
            return 'D';
        }else if (average.getAsDouble()<70){
            return 'P';
        }else if (average.getAsDouble()<80){
            return 'A';
        }else if (average.getAsDouble()<90){
            return 'E';
        }else

        return 'O';
    }
}

public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: "+ s.calculate());


    }
}
