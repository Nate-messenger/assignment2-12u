/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment02.pkg12u;

import java.util.Scanner;

/**
 *
 * @author nate
 */
public class Assingment0212U {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Assingment0212U test = new Assingment0212U();
        System.out.println("---digital sum---");
        int total = test.digitalSum(928);
        System.out.println(total);

        int sum = test.digitalSum(2019);
        int root = test.digitalRoot(sum);
        System.out.println("---digital root---");
        System.out.println(root);

        System.out.println("---Triangle---");
        int triangle = test.triangle(100);
        System.out.println(triangle);

        System.out.println("---hailstone---");
        int thing = test.hailstone(5);
        System.out.println(thing);

        System.out.println("---binary conversion---");
        System.out.println(test.binaryConvert(156));

        System.out.println("---convert---");
        System.out.println("base 16");
        System.out.println(test.convert(1000, 16));

        System.out.println("---Palindrome---");
        String word = "racecar";
        System.out.println(word);
        int length = word.length();
        System.out.println(isPalindrome(word, length));

    }

    static int digitalSum(int n) {

        //get the last number
        int h = n % 10;

        //change the original number down one place value
        n = n / 10;

        int f = h;
        if (n == 0) {
            return f;

        }

        return digitalSum(n) + f;
    }

    static int digitalRoot(int x) {

        //get the last number
        int h = x % 10;

        //change the original number down one place value
        x = x / 10;

        int p = h;

        if (x == 0) {
            if (p == 10) {
                return 1;
            }
            return p;

        }

        return digitalRoot(x) + p;

    }

    static int triangle(int n) {
        //add the previous numbers to the number of the line in the triangle
        if (n == 0) {
            return 0;
        } else {

            return n += triangle(n - 1);
        }
    }

    static int hailstone(int n) {
        //base case
        if (n <= 1) {
            return 1;
        } else {
            //prints out number then decide what the next number is
           System.out.println(n);

            if (n % 2 != 0) {
                n = 3 * n + 1;
            } else {
                n = n / 2;
            }
//sends it back through 

            return hailstone(n);
        }

    }

    static String binaryConvert(int n) {
        //base case
        if (n == 1) {
            return Integer.toString(n);
        } else {

            int r = n % 2;
//runs through with new number and prints out binary answer
            n /= 2;
            
            return binaryConvert(n) + r;

        }
    }

    static String convert(int n, int b) {
        //number letter convertions
        String[] nnum = new String[]{"A", "B", "C", "D", "E", "F" , "G"};
        //find quotent and remainder
        int q = n / b;
        int r = n % b;
//        base case
        if (q == 0) {
            return Integer.toString(r);

        } else {
            if (r >= 10) {
                //outputting the correct letter based on the number
                int l = r % 10;
                String h = nnum[l];
                return convert(q, b) + h;
                //10->A, 11->B, 12->C, 13->D, 14->E, 15->F
            }

            return convert(q, b) + Integer.toString(r);

        }

    }

    static boolean isPalindrome(String s, int length) {
        //base case for words with 
        if (s.length() == 0 || s.length() == 1) {
            return true;
        } else {
            //take the first and last letter and if the are the same continue if not end
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                String ns = s.substring(1, s.length() - 1);
                return isPalindrome(ns, length);
            }
            return false;
        }

    }
}
