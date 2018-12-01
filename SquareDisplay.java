/**
 * Michael Haugh
 * Programming III
 * CH5PC6 - Population
 * 11-27-2018
 */

package ch5pc19;

import java.util.Scanner;

public class SquareDisplay {

    public static void main(String[] args) {
       
      System.out.println("Please enter a positive integer between 0 and 15.");
   

      //Reads user input into xNum.
      int xNum;
      Scanner keyboard = new Scanner(System.in); 
      xNum = keyboard.nextInt();
  
    
        /**
         * Checks to see if input is valid. If the input is not valid, it 
         * requests a new input.
         */
      while (xNum > 15){
            System.out.println("Input is not valid.");
            System.out.println("Please enter a positive integer between 0 and "
            + "15.");
            
            xNum = keyboard.nextInt();
        }

    /**
     *Iterates from zero to the input number, and places a new line at the end.
     */
    for (int i = 0; i < xNum; i ++){
            for (int x = 0; x < xNum; x++)
                System.out.print("X");
            System.out.println();
    }
}
}