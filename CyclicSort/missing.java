package DSApractice.CyclicSort;

public class missing {
    public static int missingNumber(int[] arr)
    {
    
     int i=0;
     while(i<arr.length)
     {
        int currentPosition = arr[i];
        if(arr[i]<arr.length && arr[i]!=arr[currentPosition])
        {
            swap(arr,i,currentPosition);
        }
        else
        {
            i++;
        }
     }
     for(int j=0;j<arr.length;j++)
     {
        if(arr[j]!=j)
        {
           return j;
        }
     }
     return arr.length;
    }
     private static void swap(int[] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }   
    
    public static void main(String[] args) {
        int[] a={3,0,1};
       System.out.print( missingNumber(a));
        
    }
}
