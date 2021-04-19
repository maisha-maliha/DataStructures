import java.util.Scanner;
public class ElementDeletion{
  // ALL VARIABLES
  private static int[] Num_Array = new int[10];
  private static Scanner scan = new Scanner(System.in);
  private static int index_value = 0;
  //public int vari = 55;

  public static void main(String[] args) {
    //ARRAY VALUE ASSIGNMENT
    for(int index = 0; index < Num_Array.length; index++){
      Num_Array[index] = index*7;
    }

    //ARRAY ELEMENTS BEFORE DELETION
    System.out.println("Array elements before insertion: ");
    for(int index = 0; index < Num_Array.length; index++){
      System.out.println("Element[" + index + "] : " + Num_Array[index]);
    }

    //DELETED ELEMENT INDEX
    System.out.println("Enter element index: ");
    index_value = scan.nextInt();
    while(index_value > 10 || index_value < 0 ){
      System.out.println("Index number invalid. \nEnter element index again: ");
      index_value = scan.nextInt();
    }

    //ARRAY ELEMENTS AFTER DELETION
    System.out.println("Array elements after assignment: ");
    for(int index = 0; index < Num_Array.length - 1; index++){
      if(index_value == index){
        System.out.println("Element[" + index + "] : " + Num_Array[index+1]);
        index_value++;
        continue;
      }
      System.out.println("Element[" + index + "] : " + Num_Array[index]);
    }
  }
}
