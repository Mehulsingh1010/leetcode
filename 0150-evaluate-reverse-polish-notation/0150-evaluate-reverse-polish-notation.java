class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String a : tokens) {
            if (a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/")) {
                int b = stack.pop();
                int x = stack.pop(); 

                int result = 0;
                switch (a) {
                    case "+":
                        result = x + b;
                        break;
                    case "-":
                        result = x - b;
                        break;
                    case "*":
                        result = x * b;
                        break;
                    case "/":
                        result = x / b;
                        break;
                }
                stack.push(result); 
            } else {
  stack.push(Integer.parseInt(a));            }
        }

        return stack.pop(); 
    }
}
