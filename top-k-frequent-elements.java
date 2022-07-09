class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> num_orginizer = new HashMap<>();

        int[] solution = new int[k];

        for(int number : nums) {
            if(num_orginizer.containsKey(number)) {
                //num_orginizer.get(number)++;
                num_orginizer.put(number, num_orginizer.get(number) + 1);
            } else {
                num_orginizer.put(number, 1);
            }
        }

        while(k > 0) {
            int max_value = 0;
            int max_key = 0;
            for(Map.Entry<Integer, Integer> entry : num_orginizer.entrySet()) {
                if(entry.getValue() > max_value) {
                    max_value = entry.getValue();
                    max_key = entry.getKey();
                }
            }
            solution[k - 1] = max_key;
            num_orginizer.remove(max_key);
            max_value = 0;
            max_key = 0;
            k--;
        }

        return solution;

    }
}
