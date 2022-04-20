package Algorithms;

import java.util.Arrays;

public class BinarySearch {
    public void searchingBinary(){
    int[] arr = new int[100];
    int target = 42;

    for(int i =0; i < arr.length; i++){
        arr[i] = i;
    }

int index   = Arrays.binarySearch(arr,target);

    if(index == -1){
        System.out.println("not found");
    }
    else{
        System.out.println("element found");
    }
    }
}
