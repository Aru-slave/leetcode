class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //리스트에 들어가는건 같은건 못들어간다. - >set 쓰기, 중복 제거
        //서로 다른 인덱스 3개의 숫자를 더했을 때 0이되는 조합 찾기
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length - 2; i++){
            int k = i+1;
            int j = nums.length - 1;
            sum = -nums[i];
            while(k < j){
                int val = nums[k] + nums[j];
                if(sum > val) k++;
                if(sum < val) j--;
                if(sum == val) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[k++]);
                    list.add(nums[j--]);
                    set.add(list);
            }
            
        }
       
    }
         return new ArrayList<>(set);
}
}