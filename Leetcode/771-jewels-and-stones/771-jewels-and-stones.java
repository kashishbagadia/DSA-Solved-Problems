class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        Set<Character> st = new HashSet<>();
        for(char j : jewels.toCharArray())  
            st.add(j);
        for(char s : stones.toCharArray()){
            if(st.contains(s)) ++ans;
        }
        return ans;
    }
}