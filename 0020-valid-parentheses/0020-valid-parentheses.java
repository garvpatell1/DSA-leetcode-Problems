class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> mp = new HashMap<>();
        mp.put(')', '(');
        mp.put('}', '{');
        mp.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (mp.containsValue(c)) {
                stack.push(c);
            } else if (mp.containsKey(c)) {
                if (stack.isEmpty() || mp.get(c) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();        
    }
}