class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
    
        for (int x = 0; x < strs[0].length(); x ++ ) {
            for (int j = 1; j < strs.length; j ++) {
                if(strs[j].charAt(x) != strs[0].charAt(x)) {
                    return result.toString();
                }
            }
            result.append(strs[0].charAt(x));
        }

        return result.toString();
    }
}