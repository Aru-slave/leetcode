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
            sum = 0;
            while(k < j){
                sum = nums[i] + nums[k] + nums[j];
                if(sum > 0) j--;
                if(sum < 0) k++;
                if(sum == 0) set.add(Arrays.asList(nums[i],nums[k++],nums[j--]));
            }
            
        }
        return new ArrayList<>(set);
    }
}