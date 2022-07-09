class Solution {
    public boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> dictionary = new HashMap<>();

        for(int number : nums) {
            if(dictionary.containsKey(number)){
                return true;
            } else {
                dictionary.put(number, 1);
            }
        }

        return false;
    }
}
