package mergesort;

public class M02_InversionCount {

    static int Merge(int arr[], int start, int end, int mid) {
        // left array size will till mid
        int leftArrLen = mid - start + 1;
        // Right array size
        int rightArrLen = end - mid;

        int leftArr[] = new int[leftArrLen];
        int rightArr[] = new int[rightArrLen];

        // assigning elements of left to leftArr
        int c = 0;
        int a = start;
        while (a <= mid) {
            leftArr[c] = arr[a];
            a++;
            c++;
        }

        // assigning elements of right to rightArr
        c = 0;
        int b = mid + 1;
        while (b <= end) {
            rightArr[c] = arr[b];
            c++;
            b++;
        }

        int i = 0;
        int j = 0;
        int k = 0;
        int inversionCount = 0;

        int ans[] = new int[end - start + 1];

        // using k to track ans array

        while (i < leftArrLen && j < rightArrLen) {
            if (leftArr[i] > rightArr[j]) {
                ans[k] = rightArr[j];
                j++;
                k++;
                inversionCount += leftArrLen - i;
            } else {
                ans[k] = leftArr[i];
                k++;
                i++;
            }
        }

        // dealing with left array if right is exhausted
        while (i < leftArrLen) {
            ans[k] = leftArr[i];
            i++;
            k++;
        }

        // dealing with right array if left is exhausted
        while (j < rightArrLen) {
            ans[k] = rightArr[j];
            j++;
            k++;
        }

        for (int x = 0; x < ans.length; x++) {
            arr[start + x] = ans[x];
        }

        return inversionCount;

    }

    static int MergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return 0;
        }

        int mid = start + (end - start) / 2;
        // spliting array in left

        // left array start from start and end at mid
        int leftInversion = MergeSort(arr, start, mid);
        // spliting array in right
        int rightInversion = MergeSort(arr, mid + 1, end);
        // merging both the arrays
        int mergeInversion = Merge(arr, start, end, mid);

        int totalInversion = leftInversion + rightInversion + mergeInversion;
        return totalInversion;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 8 };
        int start = 0;
        int end = arr.length - 1;
        System.out.println(MergeSort(arr, start, end));
    }
}