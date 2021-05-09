package com.java.study.day03_ConditionalStatements;
/*
        **Task**
        Given an integer,n, perform the following conditional actions:
        - If n is odd, print `Weird`
        - If n is even and in the inclusive range of 2 to 5, print `Not Weird`
        - If n is even and in the inclusive range of 6 to 20, print `Weird`
        - If n is even and greater than 20, print `Not Weird`
        Complete the stub code provided in your editor to print whether or not n is weird.

        **Input Format**
        A single line containing a positive integer,n.

        **Output Format**
        Print `Weird` if the number is weird; otherwise, print `Not Weird`.

        **Sample Input 0**
        ```
        3
        ```
        **Sample Output 0**
        ```
        Weird
        ```
        **Sample Input 1**
        ```
        24
        ```
        **Sample Output 1**
        ```
        Not Weird
        ```
        **Explanation**
        *Sample Case 0:* is odd and odd numbers are weird, so we print `Weird`.
        *Sample Case 1:* and is even, so it is not weird. Thus, we print `Not Weird`.
 */

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if(N % 2 != 0){
            System.out.println("Weird");
        }else if(N>=2 && N<=5){
            System.out.println("Not Weird");
        }else if(N>=6 && N<=20){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }

        bufferedReader.close();
    }
}
