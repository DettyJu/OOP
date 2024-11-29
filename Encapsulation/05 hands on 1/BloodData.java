public class BloodData {
    private String bloodType;
    private String rhFactor;
    private boolean isValidInput;


    // Setter for blood type
    public void setBloodType(String bt) {
        if (isValidBloodType(bt)) {
            this.bloodType = bt; // Assign directly
            this.isValidInput = true; //Mark as Valid
        } else {
            System.out.println("Invalid input of Blood Type");
            this.isValidInput = false; //this mark as invalid
        }
    }

    // Setter for Rh factor
    public void setRhFactor(String rh) {
        if (isValidRhFactor(rh)) {
            this.rhFactor = rh; // Assign directly
            this.isValidInput = true; //Mark as Valid
        } else {
            System.out.println("Invalid input of Rh Factor");
            this.isValidInput = false; //Mark as invalid
        }
    }

    // Getter for blood type
    public String getBloodType() {
        return bloodType;
    }

    // Getter for Rh factor
    public String getRhFactor() {
        return rhFactor;
    }

    // Display method
    public void display() {
        if (isValidInput) {
             System.out.println(bloodType + rhFactor + " is added to the blood bank");
        } else {
            System.out.println("Invalid input of Blood Type and Rh Factor");
        }
    }
    
    //to validate
    private boolean isValidBloodType(String bt) {
        return bt.equals("A") || bt.equals("B") || bt.equals("AB") || bt.equals("O");
    }
    
    private boolean isValidRhFactor(String rh) {
        return rh.equals("+") || rh.equals("-");
    }
}
