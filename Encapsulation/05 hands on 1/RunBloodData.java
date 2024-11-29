import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BloodData bd = new BloodData();
        
        System.out.print("Enter blood type of patient (A, B, AB, O): ");
        String inputBloodType = input.nextLine();
        bd.setBloodType(inputBloodType);

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String inputRhFactor = input.nextLine();
        bd.setRhFactor(inputRhFactor);

        bd.display(); 

        input.close(); 
    }
}
