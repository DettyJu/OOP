/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runanimal;
import java.util.Scanner;
/**
 *
 * @author ramaj
 */
public class RunAnimal {

    /**
     * @param args the command line arguments
     */
    //1 
    public static void main(String[] args) {
        try (Scanner bdlp = new Scanner(System.in)) {
            Animal animal = null;
            boolean validInput = false;
            
            while(!validInput) {
                System.out.print("Choose an animal. Press B for Bird, C for Cat, D for Dog: ");
                String userInput = bdlp.nextLine();
                
                if(userInput.equalsIgnoreCase("B")){
                    animal = new Bird();
                    validInput = true;
                } else if (userInput.equalsIgnoreCase("C")) {
                    animal = new Cat();
                    validInput = true;
                } else if (userInput.equalsIgnoreCase("D")) {
                    animal = new Dog();
                    validInput = true;
                } else {
                    System.out.println("Invalid Input. Please try again.");
                }
                
            }
            
            
            
            
            
            animal.eat();
            animal.sleep();
            animal.makeSound();
            
            bdlp.close();
        }
        
    }
    
}
