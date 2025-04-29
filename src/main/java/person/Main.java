package person;
//in the main class
//create two objects Ada and Antii in this file and call the above methods on them
public class Main {
    public static void main(String[] args) {
        //create object Adaa using person class
       Person adaaObj =  new Person("Adaa", 20);
       //adaaObj: points to the address of  actual obj in the memory
        adaaObj.printPerson(); //prints the age and name that is initiated with

        adaaObj.growOlder(); //adaa groww 1 year older: 21


        adaaObj.printPerson(); //prints the older age
        adaaObj.growOlder();
        adaaObj.printPerson();

        System.out.println();

        Person antiiObj = new Person(" Antii",  50); // creating antii object using person class

        antiiObj.printPerson(); //calling print person method on antii object

        antiiObj.growOlder(); // calling grow older method on antii object

        antiiObj.printPerson(); //calling print person on grow older to get older age
    }
}
