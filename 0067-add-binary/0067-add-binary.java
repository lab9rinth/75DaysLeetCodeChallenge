class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while(i>=0 || j>=0 || carry!=0){
            int d1 = 0, d2 = 0;
            if(i>=0){
                d1 = a.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                d2 = b.charAt(j) - '0';
                j--;
            }
            int sum = d1 + d2 + carry;
            result.append(sum%2);
            carry = sum/2;
        }
        return result.reverse().toString();
    }
}