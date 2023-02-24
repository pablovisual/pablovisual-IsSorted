public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        //loop through each index until index is < the arr length - 1 
        //so we dont go out of bounds
        for (int index = 0; index < arr.length - 1; ++index) {
            if (arr[index] > arr[index + 1])
                return false;
        }
        return true;
    }
}
