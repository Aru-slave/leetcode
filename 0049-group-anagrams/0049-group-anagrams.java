class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) return null;
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i < strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = Arrays.toString(ch);
            List<String> val = map.get(key);//찾아지면 기존 리스트에 추가
            if (val == null) {//없으면 새로운 리스트 선언해서 추가
                val = new ArrayList<>();
            }
            val.add(strs[i]);//리스트에 추가
            map.put(key, val);
        }  
        return new ArrayList<>(map.values());
    }
}