class Solution {
    public int largestInteger(int num) {
    PriorityQueue<Integer> odd = new PriorityQueue<>();
    PriorityQueue<Integer> even = new PriorityQueue<>();
        int value = num;
        while(num != 0){
            if((num % 10) % 2 == 0){
                even.add(num % 10);
            }
            else odd.add(num % 10);
            
            num = num / 10;
        }
        
    StringBuilder sb = new StringBuilder();
        num = value;
        while(num > 0){
            if((num % 10) % 2 == 0)
                sb.insert(0, even.poll());
            else
                sb.insert(0, odd.poll());
            num /= 10;
        }
        return Integer.parseInt(sb.toString());
        
    }                                       
}