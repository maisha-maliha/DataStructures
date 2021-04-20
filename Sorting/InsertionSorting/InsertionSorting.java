public class InsertionSorting{
  public static void main(String[] args) {
    int[] array = {52,45,86,56,1,8,89,63,2};
    int array_length = array.length;

    System.out.print("Array Elements before Insertion Sort: ");
    for(int value : array){
      System.out.print(value +" ");
    }
    System.out.println();

    //NOW WE START SORTING
    int temp_value = 0;
    for(int current_index = 0; current_index < array_length - 1; current_index++){
      // PREVIOUS INDEX OF THE CURRENT INDEX TO COMPARE WITH
      int comp_index = current_index - 1;

      // COMAPRING CURRENT INDEX VALUE WITH THE NEXT INDEX VALUE
      if( array[current_index]> array[current_index+1]){
        // SWAPPING THE VALUES
        temp_value = array[current_index];
        array[current_index] = array[current_index+1];
        array[current_index+1] = temp_value;

        // COMPARING THE CURRENT SWAPPED VALUE WITH PAST SORTED VALUES TO FIND
        // CURRENT SWAPPED VALUES REAL POSITION IN THE ARRAY
        while( comp_index >= 0 && array[comp_index+1] < array[comp_index] ){
          // SWAPPED VALUE IS SMALLER THAN THE COMPARING INDEX VALUES

          // WE SWAP VALUES AGAIN
          temp_value = array[comp_index+1];
          array[comp_index+1] = array[comp_index];
          array[comp_index] = temp_value;

          // DECREASING COMPARING INDEX TO COMPARE THE CURRENT SWAPPED VALUE WITH
          // COMPARING INDEX VALUE
          comp_index--;
        }
      }
    }
    // PRINT SORTED ARRAY
    System.out.print("Array Elements After Insertion Sort: ");
    for(int value : array){
      System.out.print(value +" ");
    }
  }
}
