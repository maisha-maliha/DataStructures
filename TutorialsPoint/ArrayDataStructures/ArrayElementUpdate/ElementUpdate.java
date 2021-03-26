import java.util.Scanner;
public class ElementUpdate{
  // ALL VARIABLES
  private static int[] Num_Array = new int[10];
  private static Scanner scan = new Scanner(System.in);
  private static int index_value = 0, value = 0;

  public static void main(String[] args) {
    //ARRAY VALUE ASSIGNMENT
    for(int index = 0; index < Num_Array.length; index++){
      Num_Array[index] = index*16;
    }

    //ARRAY ELEMENTS BEFORE UPDATE
    System.out.println("Array elements before insertion: ");
    for(int index = 0; index < Num_Array.length; index++){
      System.out.println("Element[" + index + "] : " + Num_Array[index]);
    }

    //UPDATED ELEMENT INDEX
    System.out.println("Enter element index: ");
    index_value = scan.nextInt();
    while(index_value > 10 || index_value < 0 ){
      System.out.println("Index number invalid. \nEnter element index again: ");
      index_value = scan.nextInt();
    }
    System.out.println("Enter element index value: ");
    value = scan.nextInt();

    //ARRAY ELEMENTS AFTER UPDATE
    System.out.println("Array elements after assignment: ");
    for(int index = 0; index < Num_Array.length - 1; index++){
      if(index_value == index){
        Num_Array[index] = value;
      }
      System.out.println("Element[" + index + "] : " + Num_Array[index]);
    }
  }
}
