class Solution {
    public int lengthOfLongestSubstring(String s) {

        int result = 0;
        int left = 0;
        Map<Character,Integer> charsToIndex = new HashMap();
        
        for (int right = 0; right < s.length(); right ++) {
            if (charsToIndex.containsKey(s.charAt(right))) {
                int prevIndex = charsToIndex.get(s.charAt(right));
                left = Math.max(prevIndex + 1, left);
            }
            result = Math.max(result, right - left + 1);
            charsToIndex.put(s.charAt(right), right);
        }

        return result;
    }
}
