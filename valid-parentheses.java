class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('{','}');
        brackets.put('[',']');
        brackets.put('(',')');

        Stack<Character> bracket_stack = new Stack<>();

        for(Character bracket : s.toCharArray()) {
            System.out.print(bracket);
            if(brackets.containsKey(bracket)) {
                bracket_stack.push(bracket);
            } else if (bracket_stack.size() == 0 || brackets.get(bracket_stack.pop()) != bracket) {
                return false;
            }
        }

        if(bracket_stack.size() == 0)
            return true;
        return false;
    }
}
