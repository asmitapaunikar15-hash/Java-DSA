class Solution {
    public int xorOperation(int n, int start) {
        int nums[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            nums[i]=start+2*i;
        }
        int temp=0;
        for(i=0;i<n;i++){
         temp=temp^nums[i];
        }
        return temp;
    }
}
