class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        int result = 0;
        int count = 1;
        int left = 0;
        int right = left + 1;
        Map<Character,Integer> charsToIndex = new HashMap();
        
        while (left < s.length() - 1 && right < s.length()) {
            charsToIndex.putIfAbsent(s.charAt(left), left);
            if (charsToIndex.containsKey(s.charAt(right))) {
                int prevIndex = charsToIndex.get(s.charAt(right));
                result = Math.max(result, count);
                charsToIndex.clear();
                left = prevIndex + 1;
                right = left + 1;
                count = 1;

                // if (result > s.length() / 2) {
                //     return result;
                // }
            } else {
                charsToIndex.put(s.charAt(right), right);
                count ++;
                right ++;
            }
        }

        return Math.max(count,result);
    }
}
