package vyas;

import java.util.Stack;

public class BracketProblemUsingStack {

    public static void m2(Stack s,char c){
        char cor = (char) s.peek();
        if(cor==c)
        {
            s.pop();
        }
    }
    public static boolean m1(String input){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')
            {
                s.push(input.charAt(i));
            }
            else if(ch=='}')
            {
                m2(s,'{');
            }
            else if(ch==']')
            {
                m2(s,'[');
            }
            else if(ch==')')
            {
                m2(s,'(');
            }
            else if(s.size() == 1)
            {
                return false;
            }
        }
        
        if(s.isEmpty()==true)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        String input = "{[(a+b)+(c+d)+(e+f)]}";
        boolean ans = m1(input);
        System.out.println(ans);
    }
}
