/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameeee;
import java.util.Scanner;
/**
 *
 * @author ramaj
 */
public abstract class Game implements GameControls, PlayerName {
    private String playerName;
    private GameMode gameMode;
    
    @Override
    public void setPlayerName(String name) {
        this.playerName = name;
    }
    @Override
    public String getPlayerName() {
        return this.playerName;
    }
    
    @Override
    public void selectMode(int mode) {
        if (mode == 1) {
            gameMode = new StoryMode();
        } else if (mode == 2) {
            gameMode = new SurvivalMode();
        } else {
            System.out.println("Invalid Selection of Mode. Please Try Again");
            System.exit(1);
        }
    }
    
    public void playGame() {
        if (gameMode != null) {
            gameMode.startGame();
        }
        System.out.println("Press P to start Playing, " + getPlayerName() + ".");
        Scanner bdlp = new Scanner(System.in);
        String input = bdlp.nextLine();
        
        if (input.equalsIgnoreCase("P")) {
            System.out.println("Game is now starting...");
        } else {
            System.out.println("Invalid Input. Exiting Game.");
        }
    }
}
