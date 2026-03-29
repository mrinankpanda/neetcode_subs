class Solution {
    public int calculate(String s) {
        int total = 0, prev = 0, num = 0;
        char op = '+';
        int n = s.length(), i = 0;
        while (i <= n) {
            char ch = i < n ? s.charAt(i) : '+';
            if (ch == ' ') {
                i++;
                continue; 
            }
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else {
                switch(op) {
                    case '+':
                        total += prev;
                        prev = num;
                        break;
                    case '-':
                        total += prev;
                        prev = -num;
                        break;
                    case '*':
                        prev = prev * num;
                        break;
                    default:
                        prev = prev / num; 
                }
                op = ch;
                num = 0;
            }
            i++;
        }
        total += prev;
        return total;
    }
}