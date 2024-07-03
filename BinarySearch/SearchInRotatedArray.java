package DSApractice.BinarySearch;

public class SearchInRotatedArray {
    public static int rotatedArray(int[] arr,int target)
    {
        int pivot=findPivot(arr);
        if(arr[pivot]==-1)
        {
            return search(arr, target, 0, arr.length-1);
        }
        if(arr[pivot]==target)
        {
            return pivot;
        }
        if(target>=arr[0])
        {
            return search(arr, target, 0, pivot-1);
        }
        return search(arr, target, pivot+1, arr.length-1);
    }
    public static int findPivot(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            else if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }
            else
            {
                start=end+1;
            }
        }
        return -1;
    }
    public static int search(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a ={10,9,2,5,6,7};
        int t = 6;
        System.out.println(rotatedArray(a,t));
    }
}
