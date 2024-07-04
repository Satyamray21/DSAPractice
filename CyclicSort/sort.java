package DSApractice.CyclicSort;

import java.util.Arrays;

public class sort {
    public static void cyclicSort(int[] arr)
    {
        int i =0;
        while(i<arr.length)
        {
            int currentPosition = arr[i]-1;
            if(arr[currentPosition]!=arr[i])
            {
                swap(arr,i,currentPosition);
            }
            else
            {
                i++;
            }
        }
    }
    private static void swap(int[] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        int[] a ={3,2,4,1};
        cyclicSort(a);
        System.out.println(Arrays.toString(a));
    }
}
