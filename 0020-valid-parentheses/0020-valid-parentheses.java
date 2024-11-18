class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();

        if(n%2!=0){
            return false;
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.peek();
                if(ch==')' && top!='('){
                    return false;
                }else if(ch==']' && top!='['){
                    return false;
                }else if(ch=='}' && top!='{'){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return (stack.size()==0);
    }
}