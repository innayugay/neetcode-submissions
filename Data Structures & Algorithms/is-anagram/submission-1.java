class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        Map<Character,Integer> characters = new HashMap();

        for(int x = 0; x < s.length(); x++) {
            char sChar = s.charAt(x);
            char tChar = t.charAt(x);
            
            characters.put(sChar, characters.getOrDefault(sChar, 0) + 1);
            characters.put(tChar, characters.getOrDefault(tChar, 0) - 1);
        }

        for (int count : characters.values()) {
            if (count != 0) return false;
        }

        return true;
    }
}