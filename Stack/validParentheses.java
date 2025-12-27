package Stack;

import java.util.Stack;

public class validParentheses {
    public static boolean validParentheses(String parens)
    {
        Stack<Character> stack = new Stack<>();

        for(Character s : parens.toCharArray()){
            if(s == '('){
                stack.push('(');
            }
            else if(s == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
