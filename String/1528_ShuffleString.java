class Solution {
    public String restoreString(String s, int[] indices) {
        char[] t=new char[s.length()];
      
        if(s.length()==indices.length){
            int n=s.length();
        for(int i=0;i<n;i++){
            t[indices[i]]=s.charAt(i);
        }}
        String a=new String(t);
        return a;
    }
}
