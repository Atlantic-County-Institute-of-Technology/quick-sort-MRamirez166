public class main {
    private static void quickSort(int array[]){
        quickSort(array, 0, array.length -1);
    }
    private static void quickSort(int[] array, int low, int high){
        if(low<high){
            int changeIndex = partition(array, low, high);
            quickSort(array, low, changeIndex-1);
            quickSort(array, changeIndex+1, high);
        }
    }
    private static int partition(int[] array, int low, int high) {
        int change = array[high];
        int i = (low-1);
        for(int j = low; j < high; j++) {
            if(array[j] < change){
                i++;
                widjdfkdjfhfkldasjflkahdsjafd(array,i, j);
                return i +1;
            }
        }
    }
}