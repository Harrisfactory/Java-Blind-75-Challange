class Solution {
    public int maxArea(int[] height) {

        int min_height = 0;

        int left = 0;

        int right = height.length - 1;

        int max_area = 0;

        while (left <= right) {

            //set height tilt
            if(height[left] < height[right]){
                min_height = height[left];
            } else {
                min_height = height[right];
            }

            //calculate area
            if(min_height * (right - left) > max_area) {
                max_area = min_height * (right-left);
            }

            if (height[left] < height[right]) {
                left++;
            } else if (height[right] < height[left]) {
                right--;
            } else {
                left++;
                right--;
            }

        }

        return max_area;
    }
}
