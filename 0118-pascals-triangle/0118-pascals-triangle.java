class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        list.add(1);
        ans.add(list);//0



        for(int i = 1; i < numRows; i++){
            list = new LinkedList<>();
     
            for(int j = 0; j < i; j++){
                if(j == 0){
                    list.add(1);
                    continue;
                }
            list.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }
            list.add(1);
            ans.add(list);
        }
        return ans;
    }
}