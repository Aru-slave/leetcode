class Solution {
    public int lengthOfLastWord(String s) {
        //공백으로 스플릿하면 쉽게 풀린다
        //공백이 여러 개 올 수도 있다. 
        String[] str = s.split(" ");
        return str.length == 0 ? 0 : str[str.length - 1].length();
    }
}