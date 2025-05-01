package mini_exercises.pokemon;

public class CoffeeMachine {
    //create instance variables
    String machineName;
    int cupsLeft;
    //create constructors to initialize values of instance variables
    public CoffeeMachine (String constmachineName, int constcupsLeft){
        machineName  = constmachineName;
        cupsLeft = constcupsLeft;
    }
// create a method to decrement the value of cupsLeft
    public void brewCup() {
        cupsLeft = cupsLeft - 1;
    }
// create a method to refill the cupsLeft
    public void refill(){
        cupsLeft = 10;
    }
    // create a method to print out values of objects
    public void showStatus() {
        System.out.println("name: " + machineName + ", cups left:" + cupsLeft );
    }

    public static void main(String[] args) {
        // create obj using CoffeeMachine class
        CoffeeMachine obj = new CoffeeMachine("nestle", 15);

        obj.showStatus(); // prints the machineName and  cupsLeft that we initiated with
        obj.brewCup();
        obj.showStatus(); // updates the value of cupsLeft
        obj.refill();
        obj.showStatus(); // updates the value of cupsLeft



    }
}

