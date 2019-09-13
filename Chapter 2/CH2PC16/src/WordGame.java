/**
 * Alex Harkleroad
 * Word Game
 * Programming III
 * 9/12/2019
 */
import java.util.Scanner;

public class WordGame {

    public static void main(String[] args) {
    //Declare variables
    String name, age, cityName, collegeName, profession, animal, petName;
    //Intialize utlities
    Scanner keyboard = new Scanner(System.in);
    //Aquire information
    System.out.print("Please enter your name: ");
    name = keyboard.next();
    
    System.out.print("Please enter your age: ");
    age = keyboard.next();
    
    System.out.print("Please enter a city's name: ");
    cityName = keyboard.next();
    
    System.out.print("Please enter a college's name: ");
    collegeName = keyboard.next();
    
    System.out.print("Please enter the name of a profession: ");
    profession = keyboard.next();
    
    System.out.print("Please enter a type of animal: ");
    animal = keyboard.next();
    
    System.out.print("Please enter a name for a pet: ");
    petName = keyboard.next();
    
    System.out.println("");
    //Display information and pre-made text
    System.out.print("There once was a person named " + name + " who lived in " 
    + cityName + ". At the age of " + age + ", " + name + " \nwent to college at "
    + collegeName + ". " + name + " graduated and went to" + " work as a(n) " + 
    profession + ". Then,\n" + name + " adopted a(n) " + animal + " named " 
    + petName + ". They both lived happily ever after!");
    
    }

}
