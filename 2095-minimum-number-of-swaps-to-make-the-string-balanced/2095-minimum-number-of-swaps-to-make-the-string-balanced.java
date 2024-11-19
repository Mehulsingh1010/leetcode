class Solution {
    public int minSwaps(String s) {
        int open=0,close=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch== '['){
                open++;
            }else{
                if(open<=0){
                    close++;
                }
                else{
                    open--;
                }
            }
        }
        int total=open+close;
        int count=total/2;
        return (count+1)/2;
    }
}