class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNum = new ArrayList<Integer>();
        HashSet<Integer> numList = new HashSet<Integer>();
        
        for(int i : nums){
            numList.add(i);
        }
        
        for(int i = 1; i<=nums.length; i++){
            if(!numList.contains(i)){
                missingNum.add(i);
            }
        }
        return missingNum;
        
    }
}