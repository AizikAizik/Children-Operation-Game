/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operationgame;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class OperationGame {
    
    
    static int number1, number2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int Subtraction = Subtraction(input);
        System.out.println(Subtraction);

        int Addition = Addition(input);
        System.out.println(Addition);

    }


    static int Subtraction(Scanner in) {
        int answer;
        
        number1 = (int) (Math.random() * 10);
        number2 = (int) (Math.random() * 10);

        if (number1 < number2) {
            int swap = number1;
            number1 = number2;
            number2 = swap;
        }
    
        System.out.println("what is " + number1 + " - " + number2 + " ?");
        answer = in.nextInt();

        if (number1 - number2 == answer) {
            System.out.println("Great job !!!!!");
        } else {
            System.err.println("The Correct answer is");
            int correctanswer = number1 - number2;
            return correctanswer;
        }
        return 0;

   
    }

     static int Addition(Scanner in) {
        int answer;

        number1 = (int) (Math.random() * 10);
        number2 = (int) (Math.random() * 10);
        System.out.println("what is " + number1 + " + " + number2 + " ?");
        answer = in.nextInt();
        if (number1 + number2 == answer) {
            System.out.println("Great job !!!!!");
        } else {
            System.err.println("Incorrect answer!");
            System.out.println("Try again later!!!");
        }
        return 0;
    }
                    
     }
        
    

