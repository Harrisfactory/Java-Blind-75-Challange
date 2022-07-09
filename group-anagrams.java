class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> sorted_words = new HashMap<>();

        List<List<String>> solution = new ArrayList<>();

        for(String word : strs) {
            char[] unsorted_arr = word.toCharArray();
            Arrays.sort(unsorted_arr);
            String sorted_word = new String(unsorted_arr);
            if(sorted_words.containsKey(sorted_word)){
                sorted_words.get(sorted_word).add(word);
            } else {
                sorted_words.put(sorted_word, new ArrayList<>());
                sorted_words.get(sorted_word).add(word);
            }
        }

        for(List<String> value : sorted_words.values()) {
            solution.add(value);
        }

        return solution;
    }
}
