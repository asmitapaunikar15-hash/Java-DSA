class Solution {
    public void rotate(int[] nums, int k) {
        int index=0;
        int n=nums.length;
        int temp[]=new int[n];
        k=k%n;
        for(int i=n-k;i<n;i++){
            temp[index++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
                temp[index++]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
}}
