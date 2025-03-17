public class main(String[] args){

    public class Main{
        private static void quickSort(int[] array) {
            //Arguments
            quickSort(array, 0, array.length - 1);
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
                    //switch the position of value i and value j.
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            int temp = array[i + 1];
            array[i+1] = array[high];
            array[high] = temp;
            return i + 1;
        }
    }
}
