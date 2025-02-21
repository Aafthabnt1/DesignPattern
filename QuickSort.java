import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuickSort {

    public void quickSort(int[] arr,int lowestIndex,int highestIndex){
        var leftPointer=lowestIndex;
        var rightPointer=highestIndex;
        if(leftPointer>rightPointer){
            return ;
        }
        var pivot=arr[highestIndex];
        while(leftPointer<rightPointer){
            while(arr[leftPointer]>=pivot && leftPointer<rightPointer){
            leftPointer++;
            }
            while(arr[rightPointer]<=pivot && leftPointer<rightPointer){
                rightPointer--;
            }
            swap(arr,leftPointer,rightPointer);
        }
        swap(arr,leftPointer,highestIndex);
        quickSort(arr,lowestIndex,leftPointer-1);
        quickSort(arr,leftPointer+1,highestIndex);


    }

    private void swap(int[] arr, int lowestIndex, int highestIndex) {
        var temp=arr[lowestIndex];
        arr[lowestIndex]=arr[highestIndex];
        arr[highestIndex]=temp;
    }
    //2,5,8,9,4
    //pivot=4 track lb and hb if lb is grater than pivot stop and hb is greater than pivot stop and swap
    //both the index if lb==hb then swap pivot to lb place

}
