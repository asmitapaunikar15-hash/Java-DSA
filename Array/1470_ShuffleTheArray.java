class Solution {
    public int[] shuffle(int[] nums, int n) {
        int temp[]=new int[(2*n)];
        int j=0;
        for(int i=0;i<n;i++){
            temp[j++]=nums[i];
            temp[j++]=nums[i+n];
        }
        return temp;
    }
}
