/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monday;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
/**
 *
 * @author ramaj
 */
public class Monday extends Weekday{

    
    @Override
    public void showAlarm() {
        LocalTime alarm = LocalTime.parse (time);
        LocalTime now = LocalTime.now();
        
    
        System.out.println("Alarm Time: " + alarm);
        System.out.println("Current Time: " + now);
        
        
        if (alarm.isAfter(now)) {
            System.out.println("I'll wake you up later!");
        } else {
            System.out.println("Alarm is set for tomorrow!");
        }
    }
    public static void main(String[] args) {
        try ( 
                Scanner bdlp = new Scanner(System.in)) {
            Monday monday = new Monday();
            boolean validInput = false;
            
            System.out.println("***The time should be in 24-hour clock***");

            
            while (!validInput) {
                System.out.print("Enter time for the alarm (HH:mm): ");
                String timeInput = bdlp.nextLine();
                
                String formattedTime = formatTimeInput(timeInput);
                if (formattedTime != null) {
                    monday.setAlarm(formattedTime);
                    validInput = true;
                } else {
                    System.out.println("Invalid time format! Kindly use HH:mm format (e.g., 23:59).");
                }
            }
            monday.showAlarm();
        }
        
    }
    
    public static String formatTimeInput(String time) {
        try {
            LocalTime parsedTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("[H:mm][HH:mm]"));
            return parsedTime.format(DateTimeFormatter.ofPattern("HH:mm"));
            
        } catch (DateTimeParseException e) {
            return null;
        }
    }
    
}
