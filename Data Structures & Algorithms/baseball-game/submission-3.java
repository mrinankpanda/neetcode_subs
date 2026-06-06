class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int total = 0; 
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("D")) {
                stack.push(stack.peek() * 2); 
            } else if (operations[i].equals("+")) {
                int pop1 = stack.pop();
                int pop2 = stack.pop();
                stack.push(pop2);
                stack.push(pop1);
                stack.push(pop1 + pop2);
            } else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        while (!stack.isEmpty()) {
            total += stack.pop();
        }
        
        return total; 
    }
}