package person;

//create a person class, create variables name and age
//create constructor, the string variable called initialName is passed to it as a parameter
//public void printPerson(){}: create a method that prints the person's name and age, that will be used by objects
    //print format: name: objName, age: objAge
//ublic void growOlder(){}: create growOlder() method that when called, increases the age of the objects by 1
public class Person {
    // create instance variables
    String name;
    int age;

    // create constructor to initiate values of instance variables (name, age)
    public Person(String constname, int constage){
       name = constname;
       age = constage;

    }
    // create print person method that prints out name and add of the objects
    public void printPerson(){
        System.out.println("name: " + name + ", age: " + age);

    }

    public void growOlder(){
        age = age + 1;
    }



}
