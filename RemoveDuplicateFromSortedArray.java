import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int i=0,j=1;
        while(j<nums.length)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
}

class RemoveDuplicateFromSortedArray {
  public static void main(String[] args)
  {
    Scanner sn=new Scanner(System.in);
    int n=sn.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sn.nextInt();
    System.out.println(new Solution().removeDuplicates(arr));
  }
}
