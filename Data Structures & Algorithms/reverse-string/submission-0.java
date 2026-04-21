class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (right > left) {
            char a = s[left];
            char b = s[right];
            s[right] = a;
            s[left] = b;
            left ++;
            right --;
        }
    }
}