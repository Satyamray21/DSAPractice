package DSApractice.CyclicSort;


import java.util.*;
public class allNumber {
     public static List<Integer> findDisappearedNumbers(int[] nums)
     {
        int i=0;
        while(i<nums.length)
        {
            int correctElement = nums[i]-1;
            if(nums[i]!=nums[correctElement])
            {
                swap(nums,i,correctElement);
            }
            else{
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]!=j+1)
                {
                    result.add(j+1);
                }
            }
            return result;
        
     }
     private static void swap(int[] a,int i,int j)
     {
         int temp=a[i];
         a[i]=a[j];
         a[j]=temp;
     }
    public static void main(String[] args) {
        int[] a={4,3,2,7,8,2,3,1};
        List<Integer> result = findDisappearedNumbers(a);
        System.out.print(result);
    }
    
}
