class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toUpperCase();
        char[] letters = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (letters[left] != letters[right]) {
                return false;
            } else if (letters[left] < letters[right]) {
                left++;
            } else if (letters[right] < letters[left]) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}
