/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runanimal;

/**
 *
 * @author ramaj
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.print("Cats loves to eat fish");
}
    @Override
    public void sleep() {
        System.out.println(" and sleep for 12-16 hours.");
    
}
    @Override
    public void makeSound() {
        System.out.println("Meooooooowwww.");
    }
    
}
