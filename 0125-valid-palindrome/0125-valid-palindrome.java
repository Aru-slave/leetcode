class Solution {
    public boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = 0;
        int j = temp.length()-1;
        String reverse = new StringBuilder(temp).reverse().toString();
        return temp.equals(reverse);
    }
}