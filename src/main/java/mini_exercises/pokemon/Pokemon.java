package mini_exercises.pokemon;

public class Pokemon {
    //class
        //create variables : instance variables
        //constructor method
        //multiple methods
        //i.e print method, add method, remove method, get method
    //main class: its a test class to test your methods
        //psvm method
            //execute your methods
            //test if your methods are working correctly

    //create instance variables
    String name;
    int level;

    //create contructor method, pass constName and constLevel in the paramenter
    //initaiting instance variables by // Setting the instance variable 'name' to the value of constName
    public Pokemon(String constName, int constLevel){
        name = constName;
        level = constLevel;
    }

    //public type attack
        //typr: void, int, String, boolean
    //print format: 'fatima attack this monster'
    public void attack(){
        //name attack
        System.out.println(name + " attack this monster!");
    }


}
