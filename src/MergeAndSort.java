public class MergeAndSort {
    public static void main(String[] args) {

    }


        public static int[] merge ( int[] array1, int[] array2){
            int[] mergedArrays = new int[array1.length + array2.length];
            int i = 0, j = 0, k = 0;

            while (i < array1.length && j < array2.length) {
                if (array1[i] < array2[j]) {
                    mergedArrays[k++] = array1[i++];
                } else {
                    mergedArrays[k++] = array2[j++];
                }
            }

            while (i < array1.length) {
                mergedArrays[k++] = array1[i++];
            }

            while (j < array2.length) {
                mergedArrays[k++] = array2[j++];
            }

            return mergedArrays;
        }
}
