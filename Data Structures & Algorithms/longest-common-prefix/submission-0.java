class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Character letter;
        Arrays.sort(strs);
        String firstWord = strs[0];
    
        // iterate through the first word
        for (int x = 0; x < firstWord.length(); x ++ ) {
            letter = firstWord.charAt(x);
            for (int j = 1; j < strs.length; j ++) {
                if(strs[j].charAt(x) != letter) {
                    return result.toString();
                }
            }
            result.append(letter);
        }

        return result.toString();
    }
}