package DSApractice.BinarySearch;

import java.util.Arrays;

public class Firstandlastoccurence {

    public static int[] search(int[] arr,int target)
    {
        int[] ans = new int[2];
        ans[0]=binarySearch(arr, target, true);
        ans[1]=binarySearch(arr, target, false);
        return ans;
    }
    public static int binarySearch(int[] arr,int target ,boolean isFirst)
    {
        int ans=-1;
        int start =0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start +(end-start)/2;
            if(arr[mid]<target)
            {
                start = mid+1;
            }
            else if(arr[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                ans=mid;
                if(isFirst)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a={1,2,5,5,5,6,8};
        int t = 6;
       int[] r=search(a, t);
       System.out.println(Arrays.toString(r));
    }
}
