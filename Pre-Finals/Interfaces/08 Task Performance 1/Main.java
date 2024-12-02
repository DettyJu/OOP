/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gameeee;
import java.util.Scanner;
/**
 *
 * @author ramaj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bdlp = new Scanner(System.in);
        
        Game game = new GameSupp();
        
        
        System.out.print("Enter your Name: ");
        String name = bdlp.nextLine();
        game.setPlayerName(name);
        
        
        int mode;
        while (true) {
            System.out.println("Press 1 or 2 to select your Game Mode. ");
            System.out.println("1 - Story ");
            System.out.println("2 - Survival ");
            mode = bdlp.nextInt();
            
            if (mode == 1 || mode == 2) {
                break;
            } else {
                System.out.println("Invalid Selection of Mode. Please Try again!");
            }
        }
        
        game.selectMode(mode);
        game.playGame();
        bdlp.close();
    }
    
}
