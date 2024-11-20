import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean destroyed = false;

            // Check for collision
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (Math.abs(asteroid) > Math.abs(stack.peek())) {
                    // Current asteroid destroys the top of the stack
                    stack.pop();
                } else if (Math.abs(asteroid) == Math.abs(stack.peek())) {
                    // Both asteroids are destroyed
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    // Current asteroid is destroyed
                    destroyed = true;
                    break;
                }
            }

            // If the asteroid survives, add it to the stack
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        // Convert stack to result array
        int[] ans = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        
        return ans;
    }
}
