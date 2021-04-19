public class BubbleSorting{
  public static void main(String[] args) {
    int[] array = {52,45,86,56,1,8,63,2,89};
    int array_length = array.length;

    System.out.print("Array Elements before Bubble Sort: ");
    for(int value : array){
      System.out.print(value +" ");
    }
    System.out.println();
    System.out.println("Array Elements After Bubble Sort: ");
    boolean continue_loop = true;
    int temp_value =0 ;
    while(continue_loop){
      continue_loop = false;
      for(int index = 1; index < array_length; index++){
        if( array[index] < array[index-1]) {
          temp_value = array[index];
          array[index] = array[index-1];
          array[index-1] = temp_value;
          continue_loop = true;
        }
      }
    }
    for(int value : array){
      System.out.print(value +" ");
    }
  }
}
