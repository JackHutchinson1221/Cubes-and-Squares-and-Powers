/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgtry.hard;

import java.util.Scanner;

/**
 *
 * @author jahut9646
 */
public class TryHard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
    double n = 0;
    int count = 1;
    int choice = 0;
    int power = 0;
    double total = 0;
    
    while (count == 1){
        System.out.println("1… Find the value of a number squared (NOTE: 22 = 2 x 2)");
        System.out.println("2… Find the value of a number cubed (NOTE: 23 = 2 x 2 x 2)");
        System.out.println("3… Find the value of a number, to any power");
        System.out.println("4… Exit");
        choice = scan.nextInt();
        
    if (choice == 1){
        System.out.println("Enter a Number");
        n = scan.nextDouble();
        total = 1;
        total = n * n;
        System.out.println(total);
        
    }
    
    else if (choice == 2){
        System.out.println("Enter a Number");
        n = scan.nextDouble();
        total = 1;
        total = n * n * n;
        System.out.println(total);
    }
    
    else if (choice == 3){
        System.out.println("Enter a Number");
        System.out.println("Enter a Power");
        total = 1;
        n = scan.nextDouble();
        power = scan.nextInt();
        
        while (power != 0) {
            total = total * n;
            power--;
        }
        System.out.println(total);
        }
    
    else if (choice == 4){
        System.out.println("It's over.");
        count = 0;
    }
        }
    
    


        
        // TODO code application logic here
    }
    
}
