package DSApractice.BinarySearch;
public class NubmerOfRotation {
    public static int count(int[] arr)
    {
        int pivot=findPivot(arr);
        return pivot+1;
    }
    public static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
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
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a ={10,12,19,2,6,7,8};
        System.out.println(count(a));
    }
}
