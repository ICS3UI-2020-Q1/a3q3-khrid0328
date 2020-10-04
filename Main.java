import java.util.Scanner;
/**
 * This program will ask the user for a letter grade. It will then output what percentage range that would be.
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // enter a letter grade
    System.out.println("Please enter a letter grade");

    // declare and initialize a variable  
    String grade = input.nextLine();

    // what percentage range the grade represent using switch case
    switch(grade){

      case "A":
      System.out.println("This is between 80% and 100%");
      break;

      case "B":
      System.out.println("This is between 70% and 79%");
      break;

      case "C":
      System.out.println("This is between 60% and 69%");
      break;

      case "D":
      System.out.println("This is between 50% and 59%");
      break;

      case "F":
      System.out.println("This is between 0% and 49%");
      break;
    }
  }
}
