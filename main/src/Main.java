public class main {
    private static void quickSort(int[] array){
        //Arguments
        quickSort(array, 0, array.length -1);
    }
    private static void quickSort(int[] array, int low, int high){
        if(low<high){
            //Identifying values of the arrays to check weather or not a swap should be made.
            int changeIndex = partition(array, low, high);
            quickSort(array, low, changeIndex-1);
            quickSort(array, changeIndex+1, high);
        }
    }
    private static int partition(int[] array, int low, int high) {
        //variables
        int change = array[high];
        int i = (low-1);

        for(int j = low; j < high; j++) {
            if(array[j] < change){
                i++;
                //switch the position of value i and value j.
                int i = temp;
                swap(array,i, j);
                return i +1;
            }
            private static void swap(int[] array, int i, int j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            public static void main(String[] args){
                int[] array = {3,1,9,3,4};
                System.out.println("OG Array:");
                System.out.print(array);
            }
        }
    }
}