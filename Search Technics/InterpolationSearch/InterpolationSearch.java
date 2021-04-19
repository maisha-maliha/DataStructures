// ALL IMPORTS
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class InterpolationSearch{

  // ALL VARIABLES
  private static int[] num_Array = new int[15];
  private static int value, mid_index, low_index = 0, highest_index = 14;
  private static boolean found = true;
  private static Random random_number = new Random();
  private static Scanner scan = new Scanner(System.in);

  // MAIN METHODE
  public static void main(String[] args) {

    // ARRAY VALUE ASSIGNMENT AND PRINT
    System.out.print("Array Elements: ");
    for(int index = 0; index < 15; index++){
      num_Array[index] = random_number.nextInt(500);
    }

    //SORT ARRAY
    Arrays.sort(num_Array);

    //SORTED ARRAY PRINTING
    for(int x: num_Array){
      System.out.print(x + " ");
    }

    // INPUT NUMBER TO BE SEARCHED
    System.out.println("\nEnter the number you are Searching: ");
    value = scan.nextInt();

    // SEARCHING THE NUMBER
    while(found){
      mid_index = ( (highest_index - low_index)*(value - num_Array[low_index]) ) / ( num_Array[highest_index] - num_Array[low_index] );

      if(low_index > highest_index){
        break;
      }
      if(num_Array[mid_index] == value){
        found = false;
        System.out.println("Number found in index : " + (mid_index+1));
      }
      else if(num_Array[mid_index] < value){
        low_index = mid_index + 1 ;
      }
      else if(num_Array[mid_index] > value){
        highest_index = mid_index - 1;
      }
    }
    if(found){
      System.out.println("The number is NOT Found.");
    }
  }
}
