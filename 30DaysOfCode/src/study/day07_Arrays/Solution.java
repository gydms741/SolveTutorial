package study.day07_Arrays;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException{


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //The size of our array
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int out = n;

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //sample input
        //4
        //1 4 3 2
        for (int i = n-1; i>=0; i--) {
            //out += arr.add(i);
            //System.out.println(arr[i]+"");
            //String[] temp = arr;
            //System.out.println(arr[i]+"");
            //arr[i] = arr;

            bufferedReader.close();
        }
    }
}
