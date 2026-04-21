class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        int result = 0;
        int count = 1;
        int left = 0;
        int right = left + 1;
        Set chars = new HashSet();
        
        while (left < s.length() - 1 && right < s.length()) {
            chars.add(s.charAt(left));
            if (chars.contains(s.charAt(right))) {
                result = Math.max(result, count);
                chars.clear();
                count = 1;
                left ++;
                right = left + 1;

                if (result > s.length() / 2) {
                    return result;
                }
            } else {
                chars.add(s.charAt(right));
                count ++;
                right ++;
            }
        }

        return Math.max(count,result);
    }
}
