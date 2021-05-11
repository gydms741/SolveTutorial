package study.day06_Review;

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String string[] = new String[T];
        for(int i = 0; i<T; i++){
            string[i] = scan.next();
        }
        for(int temp = 0; temp<T; temp++){

            for(int j = 0; j<string[temp].length(); j = j+2)
            {
                System.out.print(string[temp].charAt(j));
            }
            System.out.print(" ");

            for(int j = 1; j<string[temp].length(); j = j+2){
                System.out.print(string[temp].charAt(j));
            }

            System.out.println();

        }
        scan.close();
    }
}

/*
public class Solution {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        String s;

        for (int i = 0; i<T; i++){
            s = scan.next();

            for (int j = 0; j<s.length(); j++){
                if (j%2 == 0){
                    System.out.println(s.charAt(j));
                }
            }
            System.out.println(" ");
            for (int j = 0; j<s.length(); j++){
                if (j%2 == 1){
                    System.out.println(s.charAt(j));
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
*/