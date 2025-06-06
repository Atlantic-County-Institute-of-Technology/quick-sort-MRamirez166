//Martin Ramirez
//March 17 2025
//Purpose: Creating a Java quick sort

//Calling method and variables.
public class Main{
    public static void main(String[] args) {
        int[] array = {2, 9, 1, 7, 6};
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            //Identifying values of the arrays to check weather or not a swap should be made.
            int changeIndex = partition(array, low, high);
            quickSort(array, low, changeIndex - 1);
            quickSort(array, changeIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        //variables
        int change = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] < change) {
                i++;
                //swap the position of value i and value j.
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //swap array i and array with the lower value.
        int temp = array[i + 1];
        array[i+1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    //Display array in order on the console.
    public static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();

    }
}