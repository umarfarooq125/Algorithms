class Solution {
    public boolean isValid(String s) {
        
        if(s == null || s.length() <=1) return false;
        
        HashMap<Character, Character> braces = new HashMap<>();
        braces.put('(', ')');
        braces.put('{', '}');
        braces.put('[', ']');
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i ++) {
         
            Character current = s.charAt(i);
            
            if(braces.containsKey(current)) {
                stack.add(current);
            } else {
                if(stack.size() == 0) return false;
                
                if(current !=braces.get(stack.pop())) return false;
            }
        }
        return stack.size()==0;
    }
}
