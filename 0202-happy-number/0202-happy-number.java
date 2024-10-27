class Solution {
    public boolean isHappy(int n) {
        
        int slow=n;
        int fast=n;

        do{
            slow=findsq(slow);
            fast=findsq(findsq(fast));
        }while(slow!=fast);

        if(slow==1){
            return true;
        }return false;

    }

    private int findsq(int number){
        int ans=0;
        while(number>0){
            int remainder = number%10;
            ans+= remainder*remainder;
            number /= 10;
        }
        return ans;
    }
}