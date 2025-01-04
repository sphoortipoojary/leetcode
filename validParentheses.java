class Solution {
    public boolean isValid(String s) {

        if(s == null || s.length() == 1 || s.length()%2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }

            else if(!stack.isEmpty()){
                    if(s.charAt(i) == ']' && stack.pop() != '[')
                        return false;
                    else if(s.charAt(i) == '}' && stack.pop() != '{')
                        return false;
                    else if(s.charAt(i) == ')' && stack.pop() != '(')
                        return false;
            }
            else
                return false;
        }

        if(stack.isEmpty())
            return true;

        return false;
    }
}
