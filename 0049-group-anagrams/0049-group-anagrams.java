class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) return null;
        Map<String, List<String>> hashMap = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = Arrays.toString(ch);
            List<String> val = hashMap.get(key);
            if (val == null) {
                val = new ArrayList<>();
            }
            val.add(strs[i]);
            hashMap.put(key, val);
        }  
        return new ArrayList<>(hashMap.values());
    }
}