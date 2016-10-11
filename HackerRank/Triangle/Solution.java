import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Problem: https://www.hackerrank.com/challenges/maximum-perimeter-triangle
// Programmed by Joe.



public class Solution {
    static Scanner scan = new Scanner(System.in);
    static int[] sticks;
    static int n;
    
    public static void main(String[] args) {
        //Test for valid triangle.
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        n = scan.nextInt();
        sticks = new int[n];
        
        
        for (int i  = 0; i < n; i++){
            sticks[i] = scan.nextInt();
        }
        
        Arrays.sort(sticks);
        int result = map();
        if (result == -1){
           System.out.println(-1);
        }else{
            for (int i = result; i < result+3; i++){
                System.out.print(sticks[i]+" ");
            }
        }
        /*
        while(true){
            if (test(sticks[anchor], sticks[anchor+1], sticks[anchor+2]))
                break;
            anchor -= 1;
        }*/
        /*
        int a, b, c;
        //Largest triangle
        for (int i = 0; i < n; i++){
            
            
        }*/
    }
    public static int map(){
        for (int anchor = n - 3; true; anchor--){
            if (anchor == -1){
                return -1;
            }
            if (test(sticks[anchor], sticks[anchor+1], sticks[anchor+2])){
                return anchor; //It's a good
            }
        }
    }
    public static boolean test(int s1, int s2, int s3){
        return s3 < s1 + s2;
    }
}