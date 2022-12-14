package Self;

// Question: Return the index of target element using binary search. (Here target = 4, targetIndex = 3)
// Array--->[1, 2, 3, 4, 5, 6]
// Indices->[0, 1, 2, 3, 4, 5]

public class Binary {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int targetIndex = 4;
        System.out.println(BinarySearch(targetIndex, arr));

    }

    static int BinarySearch(int targetIndex, int arr[]) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (targetIndex < arr[midIndex]) endIndex = midIndex - 1;
            else if(targetIndex > arr[midIndex]) startIndex = midIndex + 1;
            else return midIndex;
        }
        return -1; // "-1" is returned as an index when the target index is not found.
    }
}
