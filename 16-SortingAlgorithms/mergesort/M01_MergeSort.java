package mergesort;

import java.util.Arrays;

public class M01_MergeSort {

    static void Merge(int arr[] , int s , int e , int m){

        int leftArr[] = new int[ m - s + 1 ];

        int rightArr[] = new int[ e - m];
        
        int k = 0;
        // copying all the elements of left array to leftArr
        for(int i = s ; i <= m ; i++){
            leftArr[k] = arr[i];
            k++;
        }
        // copying all the elements of right arrya to RightArr 
        k = 0;
        for(int i = m + 1 ; i <= e ; i++){
            rightArr[k] = arr[i];
            k++;
        }

        // merging logic
        int i = 0;
        int j = 0;
        int a = 0;

        int ans[] = new int[leftArr.length + rightArr.length];

        while( i < leftArr.length && j < rightArr.length){
            if(leftArr[i] < rightArr[j]){
                ans[a] = leftArr[i];
                i++;
                a++;
            }
            else{
                ans[a] = rightArr[j];
                j++;
                a++;
            }
        }

        // suppose there is left array with [1 , 2 , 3] and right with [4 , 5 , 6 , 7 , 8];
        // in this case left array will get consumed first and 2nd array will remain

        while( j < rightArr.length ){
            ans[a] = rightArr[j]; 
            j++;
            a++;
        }

        // suppose right array got consumed

        while(i < leftArr.length ){
            ans[a] = leftArr[i];
            i++;
            a++;
        }

        for(int x = 0 ; x < ans.length ; x++){
            arr[s + x] = ans[x];
        }

    }

    static void MergeSort(int arr[] , int s , int e){
        if(s >= e){
            return;
        }

        int m = s + (e - s)/2;

        // dividing array into 1st helf
        MergeSort(arr , s , m );
        // dividing array into 2nd half
        MergeSort(arr , m + 1 , e );
        //merging both the array
        Merge(arr , s , e  , m);

    }
    public static void main(String[] args) {
        int arr[] = {2 , 6 , 4 , 5 , 1 , 3 , 8 , 7 };
        int s = 0;
        int e = arr.length - 1;
        MergeSort(arr , s , e );
        System.out.println(Arrays.toString(arr));
    }
}
