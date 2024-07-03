package DSApractice.BinarySearch;

public class SearchinRotatedDuplicatearray {
    public static int searchInDuplicateRotatedArray(int[] arr,int target)
    {
        int pivot = findPivot(arr);
        if(arr[pivot]==target)
        {
            return pivot;
        }
        else if(pivot==-1)
        {
            return search(arr, target, 0,arr.length-1);
        }
        else if(target>=arr[0])
        {
            return search(arr, target, 0, pivot-1);
        }
        return search(arr, target, pivot+1,arr.length-1);
    }

    public static int findPivot(int[] arr)
    {
        int start =0;
        int end = arr.length-1;
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
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                start++;
                end--;
            }
            else if(arr[mid]>arr[start] || arr[start]==arr[mid] && arr[mid]<arr[end])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }
    public static int search(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid = start + (end-start)/2;
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
        int[] arr ={9,2,2,2,4,8};
        int t = 2;
        System.out.println(searchInDuplicateRotatedArray(arr, t));
    }
}
