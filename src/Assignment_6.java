/*
   @author Camila Arbaiza
   CSC 201-004N
   Professor Tanes Kanchanawanchai

   Assignment 6 problem 6.1

   The purpose of this program is to display a pentagonal number
  */

import java.util.Scanner;

public class Assignment_6 {

    /**
     * The getPentagonalNumber method is going to calculate a pentagonal number
     * @param n  initial number to be converted
     * @return pentNum pentagonal number
     */

    public static int getPentagonalNumber(int n){
        //A pentagonal number is defined as n(3n–1)/2 for n = 1, 2, . .

        int pentNum;

        pentNum = (n*((3*n)-1))/2;

        return (pentNum);
    }//end getPentagonalNumber method

    public static void main(String [] args) {

        //create Scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to be converterd to pentagonal number ");
        int initialNum = input.nextInt(); //number entered by the user

        //call getPentagonalNumber method
        int pentagonalNum = getPentagonalNumber(initialNum);

        //print out result
        System.out.println("The pentagonal number of " + initialNum + " is: " + pentagonalNum);
    }//end main
}//end Assignment_6 class
