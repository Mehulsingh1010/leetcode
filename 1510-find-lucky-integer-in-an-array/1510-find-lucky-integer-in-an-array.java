class Solution {
    public int findLucky(int[] arr) {

        Map<Integer, Integer> frequencyMap=new HashMap<>();
        for(int num:arr){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
            
        }

        int luckynumber=-1;

        for(Map.Entry<Integer, Integer>entry: frequencyMap.entrySet()){
            int key= entry.getKey();
            int value=entry.getValue();
            if(key==value){
                luckynumber=Math.max(luckynumber,key);
            }
        }

        return luckynumber;

    }
}