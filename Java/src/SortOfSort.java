public class SortOfSort {

    public static void SortOfSort(int[] ArrayOfInts){
        int temp;
        for(int i=0; i< ArrayOfInts.length; i++){
            temp = ArrayOfInts[i];
            int j = i - 1;


            while (j >= 0 && ArrayOfInts[j] > temp) {
                ArrayOfInts[j + 1] = ArrayOfInts[j];
                j = j - 1;
            }
            ArrayOfInts[j + 1] = temp;
        }

    }
}
