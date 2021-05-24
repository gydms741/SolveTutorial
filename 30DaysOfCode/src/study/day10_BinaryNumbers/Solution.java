package study.day10_BinaryNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int rem = 0;
        int s = 0;
        int t = 0;

        while (n>0){
            rem = n%2;
            n=n/2;
            if (rem == 1){
                s++;
                if (s>=t){
                    t=s;
                }
            }else {
                s = 0;
            }
        }
        System.out.println(t);
        bufferedReader.close();
    }
}
