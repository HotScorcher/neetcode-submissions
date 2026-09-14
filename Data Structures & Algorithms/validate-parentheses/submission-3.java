class Solution {
    public boolean isValid(String s) {
        char[] array = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : array) {
            if (Arrays.asList('(','{','[').contains(c)) {
                stack.push(c);
            } else if (')'==c) {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if ('}'==c) {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            } else if (']'==c) {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
