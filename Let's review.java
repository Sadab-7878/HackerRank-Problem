import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int T = input.nextInt();

        input.nextLine();


        for(int i=1;i<=T;i++){
            String s = input.nextLine();
            char[] ch = s.toCharArray();

            for(int k=0;k<ch.length;k++){
                if(k%2==0){
                    System.out.print(ch[k]);
                }
            }
            System.out.print(" ");

            for(int k=0;k<ch.length;k++){
                if(k%2==1){
                    System.out.print(ch[k]);
                }
            }
            System.out.println();

        }

       








    }
}


