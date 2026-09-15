class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] array = s.toCharArray();
        for (int i = 0, j = array.length-1; i<j; i++, j--) {
            if (array[i] != array[j]) {
                return false;
            }
        }
        return true;
    }
}
