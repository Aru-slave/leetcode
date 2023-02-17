class Solution {
    public String convert(String s, int numRows) {
        Map<Integer,StringBuilder> map = new HashMap<>();
        boolean check = false;
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            if(!check){
                if(map.get(index) == null) {
                    map.put(index, new StringBuilder(String.valueOf(s.charAt(i))));
                    index++;
                    if(index == numRows - 1) check = true;
                }
                else {
                    map.put(index,map.get(index).append(s.charAt(i)));
                    index++;
                    if(index == numRows - 1) check = true;
                }
            }
            else  {
                if(map.get(index) == null) {
                    map.put(index, new StringBuilder(String.valueOf(s.charAt(i))));
                    index--;
                    if(index == 0) check = false;
                }
                else {
                    map.put(index,map.get(index).append(s.charAt(i)));
                    index--;
                    if(index == 0) check = false;
                }

            }

        }
        StringBuilder sb = new StringBuilder(map.get(0));
        for(int i = 1; i < map.size(); i++){
            sb.append(map.get(i));
        }
        return sb.toString();
    }
}