/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monday;

/**
 *
 * @author ramaj
 */
public abstract class Weekday implements Alarm {
    protected String time;
    
    @Override
    public void setAlarm(String time) {
        this.time = time;
    }
    
    
}
