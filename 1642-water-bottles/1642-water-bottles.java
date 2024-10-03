class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int x= empty/numExchange;
            total=total+x;
            
            empty=empty%numExchange + x;
        }
        return total;
    }
}