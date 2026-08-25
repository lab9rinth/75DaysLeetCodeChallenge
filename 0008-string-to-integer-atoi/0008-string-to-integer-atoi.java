class Solution {
    public int myAtoi(String s) {
        int i=0; 
        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }
        int sign = 1;
        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign = -1;
            }
            i++;
        }
        return solve(s, i, sign, 0);
    }
    private int solve(String s, int i, int sign, int result){
        if(i>=s.length() || !Character.isDigit(s.charAt(i))){
            return result * sign;
        }
        int digit = s.charAt(i) - '0';
         if (result > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return solve(s, i+1, sign, result*10+digit);
    }
}