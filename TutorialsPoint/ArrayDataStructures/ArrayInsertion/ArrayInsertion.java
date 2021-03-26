import java.util.Scanner;
public class ArrayInsertion{
  // ALL VARIABLES
  private static int[] Num_Array = new int[10];
  private static Scanner scan = new Scanner(System.in);
  private static int value;

  public static void main(String[] args) {

    //ARRAY VALUE ASSIGNMENT
    for(int index = 0; index < Num_Array.length - 1; index++){
      Num_Array[index] = index*2;
    }
    //ARRAY ELEMENTS BEFORE INSERTION
    System.out.println("Array elements before insertion: ");
    for(int index = 0; index < Num_Array.length - 1; index++){
      System.out.println("Element[" + index + "] : " + Num_Array[index]);
    }
    //ARRAY ELEMENT INPUT AND ASSIGNMENT
    System.out.println("Enter element value: ");
    value = scan.nextInt();
    Num_Array[Num_Array.length - 1] = value;

    //ARRAY ELEMENTS AFTER INSERTION
    System.out.println("Array elements after assignment: ");
    for(int index = 0; index < Num_Array.length; index++){
      System.out.println("Element[" + index + "] : " + Num_Array[index]);
    }

  }
}
