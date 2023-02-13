class Solution {
    public int fillCups(int[] amount) {
        int count = 0;
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < amount.length; i++){
            if(amount[i] != 0)
                p.add(amount[i]);
        }
        if(p.size() == 0) return 0;
        while(!p.isEmpty()){
            int size = 0;
            int a = 0;
            int b = 0;
            if(p.size() >= 2){
     
                a = p.poll() - 1;
                b = p.poll() - 1;
                if(a != 0)
                    p.add(a);
                if(b != 0)
                    p.add(b);
            }
            else {
                a = p.poll() - 1;
                if(a != 0)
                    p.add(a);
         
            }
            count++;
        }
      
        return count;
        }
}