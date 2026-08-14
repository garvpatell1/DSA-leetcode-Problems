class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            
            while (map.get(rightChar) > 2) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}