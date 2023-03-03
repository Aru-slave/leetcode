class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        while(true){
            int size = set.size();
        while(n != 0){
            int  i = n % 10;
            sum = sum + i*i;
            n = n / 10;
        }
            if(sum == 1) return true;
            set.add(sum);
            n = sum;
            sum = 0;
            if(size == set.size())
                return false;
            
        }

        
    }
}