// ALL IMPORTS
import java.util.Random;
import java.util.Scanner;

public class LinearSearch{

  // ALL VARIABLES
  private static int[] num_Array = new int[15];
  private static int value;
  private static boolean found = true;
  private static Random random_number = new Random();
  private static Scanner scan = new Scanner(System.in);

  // MAIN METHODE
  public static void main(String[] args) {

    // ARRAY VALUE ASSIGNMENT AND PRINT
    System.out.print("Array Elements: ");
    for(int index = 0; index < 15; index++){
      num_Array[index] = random_number.nextInt(500);
      System.out.print(num_Array[index] + " ");
    }

    // INPUT NUMBER TO BE SEARCHED
    System.out.println("\nEnter the number you are Searching: ");
    value = scan.nextInt();

    // SEARCHING THE NUMBER
    for(int index = 0; index < 15; index++){
      if(num_Array[index] == value){
        found = false;
        System.out.println("The number is Found in index " + index);
      }
    }
    if(found){
      System.out.println("The number is NOT Found.");
    }
  }
}
