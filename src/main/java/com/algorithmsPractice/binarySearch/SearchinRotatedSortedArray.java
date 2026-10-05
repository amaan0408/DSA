public static class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= nums[left]) { // we know left is sorted
                if (target <= nums[mid] && target >= nums[left]) {
                    if (nums[mid] == target) {
                        return mid;
                    } else if (target > nums[mid]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    left = mid + 1;
                }
            } else { // right is sorted
                if (target >= nums[mid] && target <= nums[right]) {
                    if (nums[mid] == target) {
                        return mid;
                    } else if (target < nums[mid]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }

        }
        return -1;
    }
}
    public static void main(String[] args) {
        SearchinRotatedSortedArray search = new SearchinRotatedSortedArray();
        int[] nums=new int[]{4,5,6,7,0,1,2};
        int target=1;
        System.out.println(search.search(nums,target));
    }
