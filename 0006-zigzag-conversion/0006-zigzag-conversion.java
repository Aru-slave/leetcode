class Solution {
    public String convert(String s, int numRows) {
        Map<Integer,String> map = new HashMap<>();
        boolean check = false;
        int index = 0;
        StringBuilder sb;
        for(int i = 0; i < s.length(); i++){
            if(!check){
                if(map.get(index) == null) {
                    map.put(index,String.valueOf(s.charAt(i)));
                    index++;
                    if(index == numRows - 1) check = true;
                }
                else {
                    sb = new StringBuilder(map.get(index));
                    sb.append(s.charAt(i));
                    map.put(index,sb.toString());
                    index++;
                    if(index == numRows - 1) check = true;
                }
            }
             else  {
                    if(map.get(index) == null) {
                        map.put(index,String.valueOf(s.charAt(i)));
                        index--;
                        if(index == 0) check = false;
                    }
                    else {
                        sb = new StringBuilder(map.get(index));
                        sb.append(s.charAt(i));
                        map.put(index,sb.toString());
                        index--;
                        if(index == 0) check = false;
                    }
                
            }
        
    }
    sb = new StringBuilder(map.get(0));
        for(int i = 1; i < map.size(); i++){
        sb.append(map.get(i));
        }
        return sb.toString();
}
}