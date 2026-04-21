class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        boolean[] used = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue;
            List<String> group = new ArrayList();
            group.add(strs[i]);
            used[i] = true;
            for (int j = i + 1; j < strs.length; j++) {
                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    used[j] = true;
                }
            }
            result.add(group);

        }

        return result;
    }

    private boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
             return false;
        }

        Map<Character, Integer> occurences = new HashMap();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            occurences.put(c, occurences.getOrDefault(c, 0) + 1);
            
        }

        for (int j = 0; j < str2.length(); j++) {
            char c = str2.charAt(j);
            if (!occurences.containsKey(c) || occurences.get(c) == 0) {
                return false;
            } else if (occurences.get(c) == 1) {
                occurences.remove(c);
            } else {
                occurences.put(c, occurences.get(c) - 1);
            }
        }
        return occurences.isEmpty();
    }

}
