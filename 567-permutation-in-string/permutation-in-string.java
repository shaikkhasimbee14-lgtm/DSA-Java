class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            arr[ch - 'a']++;
        }
        int[] window = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s2.charAt(i);
            window[ch - 'a']++;
        }
        if (same(arr, window)) {
            return true;
        }
        for (int right = s1.length(); right < s2.length(); right++) {
            char add = s2.charAt(right);
            window[add - 'a']++;
            char remove = s2.charAt(right - s1.length());
            window[remove - 'a']--;
            if (same(arr, window)) {
                return true;
            }
        }
        return false;
    }
    public boolean same(int[] arr, int[] window) {

        for (int i = 0; i < 26; i++) {
            if (arr[i] != window[i]) {
                return false;
            }
        }
        return true;
    }
}