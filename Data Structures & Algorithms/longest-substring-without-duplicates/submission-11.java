class Solution {
    public int lengthOfLongestSubstring(String s) {

        // int result = 0;
        // int left = 0;
        // Map<Character,Integer> charsToIndex = new HashMap();
        
        // for (int right = 0; right < s.length(); right ++) {
        //     if (charsToIndex.containsKey(s.charAt(right))) {
        //         left = Math.max(charsToIndex.get(s.charAt(right)) + 1, left);
        //     }
        //     result = Math.max(result, right - left + 1);
        //     charsToIndex.put(s.charAt(right), right);
        // }

        // return result;
                Set<Character> seen = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (!seen.add(currentChar)) {
                max = Math.max(seen.size(), max);

                while (s.charAt(left) != currentChar) {
                    seen.remove(s.charAt(left));
                    left++;
                }
                seen.add(currentChar);
                left++;
            }
        }

        return Math.max(seen.size(), max);
    }

    
}
