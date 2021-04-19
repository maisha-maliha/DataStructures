import java.util.Scanner;
public class ElementS{
  // ALL VARIABLES
  private static int[] Num_Array = new int[10];
  private static Scanner scan = new Scanner(System.in);
  private static int value;
  private static boolean found = true;

  public static void main(String[] args) {
    //ARRAY VALUE ASSIGNMENT
    for(int index = 0; index < Num_Array.length; index++){
      Num_Array[index] = (index*15)+7;
    }

    //ARRAY ELEMENTS
    System.out.println("Array elements before insertion: ");
    for(int index = 0; index < Num_Array.length; index++){
      System.out.println("Element[" + index + "] : " + Num_Array[index]);
    }

    //SEARCHED ELEMENT VALUE
    System.out.println("Enter element value: ");
    value = scan.nextInt();


    //ARRAY ELEMENT'S EXISTANCE DETERMINATION
    for(int index = 0; index < Num_Array.length - 1; index++){
      if(value == Num_Array[index]){
        System.out.println("Element Found in Index : " + index);
        found= false;
      }
    }
    if(found){
      System.out.println("Element Not Found");
    }
  }
}
