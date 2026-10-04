class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> a = new ArrayList<>();
        int lim = 1 << n;
        for(int i=0; i<lim; i++){
            a.add(i^(i>>1));
        }
        return a;
    }
}