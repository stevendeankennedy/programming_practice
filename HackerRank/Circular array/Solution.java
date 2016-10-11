import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Problem: https://www.hackerrank.com/challenges/circular-array-rotation
//Programmed by Myatt.

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for(int a_i=0; a_i < n; a_i++){
            deque.add(in.nextInt());
        }
        
        for (int i = 0; i < k; i++){
            int j = deque.pollLast();
            deque.addFirst(j);
        }
        Integer[] array = new Integer[n];
        deque.toArray(array); 

        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(array[m]);
        }
        
        
        
    }
}
