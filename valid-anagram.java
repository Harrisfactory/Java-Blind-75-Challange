class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sorted1 = s.toCharArray();
        Arrays.sort(sorted1);
        String sorted1_str = new String(sorted1);
        char[] sorted2 = t.toCharArray();
        Arrays.sort(sorted2);
        String sorted2_str = new String(sorted2);

        System.out.println(sorted1_str);
        System.out.println(sorted2_str);
        if(sorted1_str.equals(sorted2_str)) {
            return true;
        } else {
            return false;
        }
    }
}
