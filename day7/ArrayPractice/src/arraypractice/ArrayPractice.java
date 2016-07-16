/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;

import static java.lang.System.out;
import java.util.Arrays;

/**
 *
 * @author kevinmccarthy
 */
public class ArrayPractice {

    /**
     * @param args the command line arguments
     * 
     */
    public static void printArray(int[] array) {
        System.out.print("[");
        for  (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void printArray(String[] array) {
        System.out.print("[");
        for  (int i = 0; i < array.length; i++) {
            String item = array[i];
            System.out.print(item);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        // Declaring, Allocating, and Initializing
      //Random Objects from Array
      // Math.abs(rand.nextInt) % length;
        int[] intArray1;
        int[] intArray2 = new int[4];
        printArray(intArray2);
        int[] intArray3 = {5, 2, 9, 1, 3};
        
        String[] shoppingList = {"bananas", "apples", "pears"};
        
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;
        
        printArray(intArray2);
        printArray(intArray3);
        
        Arrays.sort(intArray3);
        printArray(intArray3);
        printArray(shoppingList);
        
        // Special for loop: foreach
        System.out.println("Special For Loop");
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }
    
}
