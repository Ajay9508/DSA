class Solution {
    public boolean squareIsWhite(String coordinates) {
        int t= coordinates.charAt(0)-'a'+coordinates.charAt(1);
        return t%2==0;
    }
}