/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looppractice;

/**
 *
 * @author kevinmccarthy
 */
public class LoopPractice {
    
    public static void practiceWhileLoop(){
        int x = 0;
        while(x < 5) {
            System.out.println("The value of x is " + x);
            x++;
        }
    }
    
    public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.println("The value of x is " + x);
            x++;
        } while (x < 10);   
    }
    
    public static void practiceForLoop() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++){
                System.out.println("("+x+","+y+")");

            }
        }   
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        practiceForLoop();
        // TODO code application logic here
    }
    
}
